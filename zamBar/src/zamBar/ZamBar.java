
package zamBar;

import java.util.Scanner;

public class ZamBar {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);	
		 
		 
		 double valorIngressoMulher = 8.0;
		 double valorIngressoHomem = 10.0;
		 double valorRefrigerante = 3.0;
		 double valorCerveja = 5.0;
		 double valorEspetinho = 7.0;
		 double couvertArtistico = 4.0;
		 
		System.out.println("sexo do cliente (M/F): ");
		  char sexo = sc.next().toUpperCase().charAt(0);
		  
		System.out.println("Quantidade de refrigerantes: ");
		  int qntRefrigerantes = sc.nextInt();
		  
		System.out.println("Quantidade de cervejas: ");
		  int qntCervejas = sc.nextInt();
		
		System.out.println("Quantidade de espetinhos: ");
		 int qntEspetinhos = sc.nextInt();
		 
		 double precoIngresso;

		if (sexo == 'M') {
			precoIngresso = valorIngressoHomem;
		}
		else if (sexo == 'F') {
			precoIngresso = valorIngressoMulher;
		}
	
		else {
			System.out.println("sexo inválido.");
			return;
		}
		double valorRefrigerantes = qntRefrigerantes * valorRefrigerante; 
		double valorCervejas = qntCervejas * valorCerveja;
		double valorEspetinhos = qntEspetinhos * valorEspetinho;
		double valorConsumo = valorCervejas + valorRefrigerantes + valorEspetinhos; 
	
		    System.out.println("Relatório da conta:");
	        System.out.printf("Ingresso: R$ %.2f\n", precoIngresso); 
	        System.out.println("Consumo:");
	        System.out.printf("  Cervejas: %d x R$ %.2f = R$ %.2f\n", qntCervejas, valorCerveja, valorCervejas); 
	        System.out.printf("  Refrigerantes: %d x R$ %.2f = R$ %.2f\n", qntRefrigerantes, valorRefrigerante, valorRefrigerantes); 
	        System.out.printf("  Espetinhos: %d x R$ %.2f = R$ %.2f\n", qntEspetinhos, valorEspetinho, valorEspetinhos); 
	        System.out.printf("Couvert artístico: R$ %.2f\n", couvertArtistico); 
	        System.out.printf("Total a pagar: R$ %.2f\n",  valorConsumo);
	 
	  sc.close();
	}
	
	

}
