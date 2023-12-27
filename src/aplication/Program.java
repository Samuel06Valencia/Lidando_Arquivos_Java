package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		// Implementação de forma totalmente manual!
		String path = "D:\\temp\\in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			

			/*
			 * OBS: Pego a stream básica e a partir dela eu instâncio a stream que tem o
			 * esquema de buffer que deixa mais rápida a leitura.
			 */

			String line = br.readLine(); // Lê apenas uma linha do arquivo.

			while (line != null) {
				System.out.println(line); //Se a linha não for nula,imprima.
				line = br.readLine(); //continue lendo as linas...
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

	}

}
