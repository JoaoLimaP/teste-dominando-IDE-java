package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroProjeto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gato gato = new Gato(null, null, null);
		livros livros = new livros();
		
		System.out.println(gato);
		System.out.println(livros);
				
		int a = 2;
				int b = 5;
		
		System.out.println ("hellow world " + (b*a));
		
	}

}

class livros{
	private String nome;
	private String Npage;
	
}
