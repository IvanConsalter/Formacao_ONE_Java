package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import br.com.alura.java.io.modelo.Cliente;

public class TesteSerializacaoClienteInput {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		
		ois.close();
		
		System.out.println(cliente.getNome());
		System.out.println(cliente.getProfissao());
		System.out.println(cliente.getCpf());
	}

}
