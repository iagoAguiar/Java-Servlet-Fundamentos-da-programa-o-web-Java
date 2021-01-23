package br.com.alura.gerenciador.servlet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		Empresa empresa = new Empresa();
		Empresa empresa2 = new Empresa();
		Empresa empresa3 = new Empresa();
		
		empresa.setId(chaveSequencial++);
		empresa2.setId(chaveSequencial++);
		empresa3.setId(chaveSequencial++);
		
		empresa.setNome("Alura");
		empresa2.setNome("Caelum");
		empresa3.setNome("Indra");
		
		lista.add(empresa);
		lista.add(empresa2);
		lista.add(empresa3);
	}

	public void adiciona(Empresa empresa) {

		empresa.setId(Banco.chaveSequencial++);
		lista.add(empresa);
		
	}
	
	
	public List<Empresa> getEmpresas(){
		return Banco.lista;
	}
	
	
	public void removeEmpresa(Integer id) {
		
		//Metodo tradicional
		
		Iterator<Empresa> it = lista.iterator();
		
		
		while(it.hasNext()) {
			Empresa emp = it.next();
			if(emp.getId() == id) {
				it.remove();
			}
			
		}	
		
	}
	
	//Não permite alterar a lista durante o laço
	
//	public void removeEmpresa(Integer id) {
//		for(Empresa empresa : lista) {
//			if(empresa.getId() == id) {
//				lista.remove(empresa);
//			}
//		}
//	}

}
