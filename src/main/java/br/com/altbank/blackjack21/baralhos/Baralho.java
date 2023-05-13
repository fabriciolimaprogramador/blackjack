package br.com.altbank.blackjack21.baralhos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import br.com.altbank.blackjack21.cartas.Carta;
import br.com.altbank.blackjack21.cartas.enums.CorEnum;
import br.com.altbank.blackjack21.cartas.enums.NaipeEnum;
import br.com.altbank.blackjack21.cartas.enums.NumeroEnum;

public class Baralho {

	private List<Carta> cartas = new ArrayList<>();

	public Baralho() {

		cartas.add(new Carta(NumeroEnum.A, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.DOIS, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.TRES, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.QUATRO, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.CINCO, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.SEIS, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.SETE, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.OITO, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.NOVE, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.DEZ, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.J, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.Q, NaipeEnum.COPAS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.K, NaipeEnum.COPAS, CorEnum.VERMELHO));

		cartas.add(new Carta(NumeroEnum.A, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.DOIS, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.TRES, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.QUATRO, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.CINCO, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.SEIS, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.SETE, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.OITO, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.NOVE, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.DEZ, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.J, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.Q, NaipeEnum.ESPADAS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.K, NaipeEnum.ESPADAS, CorEnum.PRETO));

		cartas.add(new Carta(NumeroEnum.A, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.DOIS, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.TRES, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.QUATRO, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.CINCO, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.SEIS, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.SETE, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.OITO, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.NOVE, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.DEZ, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.J, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.Q, NaipeEnum.OUROS, CorEnum.VERMELHO));
		cartas.add(new Carta(NumeroEnum.K, NaipeEnum.OUROS, CorEnum.VERMELHO));

		cartas.add(new Carta(NumeroEnum.A, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.DOIS, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.TRES, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.QUATRO, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.CINCO, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.SEIS, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.SETE, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.OITO, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.NOVE, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.DEZ, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.J, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.Q, NaipeEnum.PAUS, CorEnum.PRETO));
		cartas.add(new Carta(NumeroEnum.K, NaipeEnum.PAUS, CorEnum.PRETO));

	}

	public List<Carta> getCartas() {
		return cartas;
	}

	public List<Carta> embaralhar() {
		Carta[] arrayCarta = new Carta[cartas.size()];
		cartas.toArray(arrayCarta);
		embaralhar(arrayCarta);
		return Arrays.asList(arrayCarta);
	}

	private void embaralhar(Carta[] baralho) {
		Random rnd = new Random();
		for (int i = baralho.length - 1; i > 0; i--) {
			int randomNumber = rnd.nextInt(i + 1);
			trocarPosicaoCarta(baralho, i, randomNumber);
		}
	}

	private void trocarPosicaoCarta(Carta[] baralho, int i, int j) {
		Carta temp = baralho[i];
		baralho[i] = baralho[j];
		baralho[j] = temp;
	}

}
