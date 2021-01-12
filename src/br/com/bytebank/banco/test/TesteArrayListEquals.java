package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(1, 1);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(2, 100);
		lista.add(cc2);
		
		Conta cc3 = new ContaCorrente(2, 100);
		boolean existe = lista.contains(cc3);

		System.out.println("Já existe? " + existe);
		
		for (Object obj : lista) {
			System.out.println(obj);
		}
	}

}
