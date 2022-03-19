
//Importação da biblioteca que possibilitará o uso de entrada de dados
import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		//Construindo a variável (teclado) que permitirá acessar as informações
		//fornecidas pelo usuário
		Scanner teclado = new Scanner(System.in);
		
		//Comando referente ao escreva no português estruturado
		System.out.println("Informe o valor 1");
		
		//armazenando a informação passada pelo usuário em um tipo inteiro
		//A opção nextInt converte o valor fornecido pelo usuário em um inteiro
		//Para cada tipo de dado, existirá uma forma de realizar a conversão;
		//Por exemplo, existe o nextFloat para converter em float. 
		//Existe o nextBoolean para transformar em boolean. 
		//Logo abaixo forneço alguns exemplos. 
		
		int numero = teclado.nextInt();
		
		System.out.println("Informe o valor 2");
		
		//armazenando a informação passada pelo usuário em um tipo inteiro

		
		int numero2 = teclado.nextInt();
		
		int soma = numero + numero2;
		
		System.out.println("O resultado da soma é " + soma);
		
		/**
		 * Logo abaixo segue exemplos de entrada de dados com outros 
		 * tipos
		 * 
		 */
		
		System.out.println("Informe um nome");
		//conversão em String
		String nome = teclado.next();
		
		System.out.println("O nome fornecido foi " + nome);
		
		System.out.println("Informe um valor decimal");
		
		// conversão em valor decimal do tipo float
		float valorDecimal = teclado.nextFloat();
		
		System.out.println("O valor decimal fornecido foi " + valorDecimal);
		
		//após o uso da variável que obtém as informações através da digitação via teclado, é necessário fechá-la. 
		teclado.close();
		
		// TODO Auto-generated method stub

	}

}
