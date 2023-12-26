package aplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {

		// Implementação de forma totalmente manual!
		String path = "D:\\temp\\in.txt";
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(path); // sequencia de leitura(Stream) a partir do arquivo que estiver nesse caminho
			br = new BufferedReader(fr); // O BufferedReader é instanciado a partir do FileReader, ela é uma abstração
											// maior.

			// Versão resumida:br = new BufferedReader(new FileReader(path));

			/*
			 * OBS: Pego a stream básica e a partir dela eu instâncio a stream que tem o
			 * esquema de buffer que deixa mais rápida a leitura.
			 */

			String line = br.readLine(); // Lê apenas uma linha do arquivo.

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
