package br.com.altbank.blackjack21.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.altbank.blackjack21.baralhos.Baralho;
import br.com.altbank.blackjack21.cartas.Carta;

@Service
public class JogoService {

	private final int VINTE_UM = 21;

	private static int indexCartaPuxada = -1;
	private static List<Carta> cartasPuxadas = new ArrayList<>();
	private static List<Carta> cartasPuxadasA = new ArrayList<>();
	private static List<Carta> cartas = new ArrayList<>();

	public String embaralhar() {
		indexCartaPuxada = -1;
		cartasPuxadas.clear();
		cartasPuxadasA.clear();
		Baralho baralho = new Baralho();
		cartas = baralho.embaralhar();
		return "As cartas foram embaralhadas";
	}

	public Carta puxarUmaCarta() {
		if (cartas.size() == 0) {
			embaralhar();
		}

		if (getPontosAcumulados() > 21) {
			return null;
		}

		indexCartaPuxada++;
		cartasPuxadas.add(cartas.get(indexCartaPuxada));
		Carta carta = cartas.get(indexCartaPuxada);
		if (carta.getNumero().name().equals("A")) {
			cartasPuxadasA.add(carta);
		}
		
		return carta;
	}

	public int getPontosAcumulados() {
		int somaPontos = 0;

		for (Carta carta : cartasPuxadas) {
			int ponto = getPonto(carta);
			somaPontos += ponto;
		}

		if (somaPontos > VINTE_UM && cartasPuxadasA.size() > 0) {
			for (int i = 0; i < cartasPuxadasA.size(); i++) {
				somaPontos -= 11;
				somaPontos += 1;
				if (somaPontos <= VINTE_UM) {
					return somaPontos;
				}
			}
		}

		return somaPontos;
	}

	public String getPontuacao() {

		int somaPontos = getPontosAcumulados();

		if (somaPontos < VINTE_UM) {
			return "Pontuação abaixo de 21";
		}

		if (somaPontos > VINTE_UM) {
			return "Pontuação acima de 21";
		}

		return "Pontuação igual a 21";
	}

	private int getPonto(Carta carta) {
		switch (carta.getNumero().name()) {
		case "DOIS":
			return 2;
		case "TRES":
			return 3;
		case "QUATRO":
			return 4;
		case "CINCO":
			return 5;
		case "SEIS":
			return 6;
		case "SETE":
			return 7;
		case "OITO":
			return 8;
		case "NOVE":
			return 9;
		case "DEZ":
			return 10;
		case "J":
			return 10;
		case "Q":
			return 10;
		case "K":
			return 10;
		}
		return 11;
	}

}
