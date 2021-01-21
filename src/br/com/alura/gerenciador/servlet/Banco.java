package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	
	static {
		Empresa empresa = new Empresa();
		Empresa empresa2 = new Empresa();
		Empresa empresa3 = new Empresa();
		
		empresa.setNome("Alura");
		empresa2.setNome("Caelum");
		empresa3.setNome("Indra");
		
		lista.add(empresa);
		lista.add(empresa2);
		lista.add(empresa3);
	}

	public void adiciona(Empresa empresa) {
		lista.add(empresa);
		
	}
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	

}
