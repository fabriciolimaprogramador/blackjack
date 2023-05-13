package br.com.altbank.blackjack21.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.ResponseEntity;

import br.com.altbank.blackjack21.controller.response.RetornoResponse;
import br.com.altbank.blackjack21.service.JogoService;

class JogoControllerTest {

	@InjectMocks
	private JogoController jogoController;

	@Mock
	private JogoService jogoService;

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	void testEmbaralharCartas() {
		ResponseEntity<RetornoResponse> response = jogoController.embaralharCartas();

		Assertions.assertEquals(200, response.getStatusCodeValue());
	}

	@Test
	void testPuxarUmaCarta() {
		ResponseEntity<?> response = jogoController.puxarUmaCarta();
		if (response.getStatusCodeValue() == 200) {
			Assertions.assertEquals(200, response.getStatusCodeValue());
		} else {
			Assertions.assertEquals(206, response.getStatusCodeValue());
		}

	}

	@Test
	void testGetPontosAcumulados() {
		ResponseEntity<RetornoResponse> response = jogoController.getPontosAcumulados();
		Assertions.assertEquals(200, response.getStatusCodeValue());
	}

	@Test
	void testGetPontuacao() {
		ResponseEntity<RetornoResponse> response = jogoController.getPontuacao();
		Assertions.assertEquals(200, response.getStatusCodeValue());
	}

}
