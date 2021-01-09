package br.com.bytebank.banco.test;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList<>();
		
		Conta cc1 = new ContaCorrente(1, 1);
		lista.add(cc1);
		
		Conta cc2 = new ContaCorrente(2, 100);
		lista.add(cc2);
		
        System.out.println(lista.size());
        Conta ref = (Conta) lista.get(0);
        System.out.println(ref.getNumero());
        
        lista.remove(0);

        System.out.println("Tamanho: " + lista.size());

		Conta cc3 = new ContaCorrente(3, 3);
		lista.add(cc3);
		
		Conta cc4 = new ContaCorrente(4, 4);
		lista.add(cc4);
		
		
        System.out.println("Tamanho: " + lista.size());
        
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		System.out.println("------------------");
		for (Object obj : lista) {
			System.out.println(obj);
		}
	}

}
