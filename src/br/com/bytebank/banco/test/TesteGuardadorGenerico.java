package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorGenerico;

public class TesteGuardadorGenerico {

	public static void main(String[] args) {
		
		//Contas
        GuardadorGenerico guardador = new GuardadorGenerico();

        Conta cc = new ContaCorrente(22, 11);
        guardador.adiciona(cc);

        Conta cc2 = new ContaCorrente(22, 22);
        guardador.adiciona(cc2);

        int tamanho = guardador.getQuantidadeDeElementos();
        System.out.println(tamanho);

        Conta ref = (Conta) guardador.getReferencia(0);
        System.out.println(ref.getNumero());
        
        
        //String
        GuardadorGenerico guardadorString = new GuardadorGenerico();
        guardadorString.adiciona("cachorro");
        guardadorString.adiciona("gato");
        System.out.println(guardadorString.getReferencia(1));
        
	}

}
