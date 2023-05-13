package br.com.altbank.blackjack21.cartas;

import br.com.altbank.blackjack21.cartas.enums.CorEnum;
import br.com.altbank.blackjack21.cartas.enums.NaipeEnum;
import br.com.altbank.blackjack21.cartas.enums.NumeroEnum;

public class Carta {

	private NumeroEnum numero;
	private NaipeEnum naipe;
	private CorEnum cor;

	public Carta(NumeroEnum numero, NaipeEnum naipe, CorEnum cor) {
		this.numero = numero;
		this.naipe = naipe;
		this.cor = cor;
	}

	public NumeroEnum getNumero() {
		return numero;
	}

	public NaipeEnum getNaipe() {
		return naipe;
	}

	public CorEnum getCor() {
		return cor;
	}

}
