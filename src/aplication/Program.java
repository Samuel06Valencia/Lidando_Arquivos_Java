package aplication;

import java.io.File;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine(); //escreverá o caminho do arquivo.
		
		File path = new File(strPath); //Uma váriavel do tipo "File" pode ser um caminho de um arquivo tanto como o caminho de uma pasta.
		
		File[] folders = path.listFiles(File::isDirectory); //Cria um vetor que recebe uma lista de diretórios,dentro da pasta escolhida.
		System.out.println("FOLDERS:");
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile); //Cria um vetor, que organiza uma lista de diretórios,dentro da pasta escolhida.
		System.out.println("FILES:");
		for (File file: files) { 
			System.out.println(file);
		}
		
		//Para criar uma pasta dentro do diretório desejado:
		//boolean success = new File(strPath + "\\subdir").mkdir();
		
		//Para imprimir somente o nome do arquivo ou da pasta:
		//System.out.println("getname: "+path.getName());
		
		//Para imprimir somente o caminho do arquivo ou pasta:
		//System.out.println("getParent: "+path.getParent());
		
		//Para imprimir o caminho completo:
		//System.out.println("getPath: "+ path.getPath());
		
		sc.close();
	}

}
