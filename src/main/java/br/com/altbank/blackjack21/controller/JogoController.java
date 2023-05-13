package br.com.altbank.blackjack21.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.altbank.blackjack21.cartas.Carta;
import br.com.altbank.blackjack21.controller.response.RetornoResponse;
import br.com.altbank.blackjack21.service.JogoService;

@RestController
@RequestMapping("/black-jack")
@CrossOrigin(origins = "*")
public class JogoController {

	@Autowired
	private JogoService service;

	@GetMapping("/embaralhar-cartas")
	public RetornoResponse embaralharCartas() {
		return new RetornoResponse(service.embaralhar());
	}

	@GetMapping("/puxar-uma-carta-do-baralho")
	public ResponseEntity<?> puxarUmaCarta() {
		Carta carta = service.puxarUmaCarta();
		if(carta == null) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new RetornoResponse("Jogo finalizado"));
		}
		return ResponseEntity.ok(carta);
	}

	@GetMapping("/pontos-acumulados")
	public RetornoResponse getPontosAcumulados() {
		return new RetornoResponse("Pontos acumulados " + Integer.toString(service.getPontosAcumulados()));
	}

	@GetMapping("/pontuacao")
	public RetornoResponse getPontuacao() {
		return new RetornoResponse(service.getPontuacao());
	}

}
