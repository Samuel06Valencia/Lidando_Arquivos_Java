package aplication;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		File file = new File("D:\\temp\\in.txt"); //Objeto para localizar o arquivo.
		Scanner sc = null;
		try {
			sc = new Scanner(file); //instanciar o Scanner a partir do arquivo. Tenta abiri o arquivo.
			while(sc.hasNextLine()) { //testa se existe uma nova linha no arquivo.
				System.out.println(sc.nextLine()); //Se existir essa nova linha,imprima.
			}
		}
		catch(IOException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			if(sc != null) {
			sc.close();
			}
		}
		
		
		
	}

}
