package exe001Poo;

import java.util.Scanner;

public class testandoPa {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Digite o primeiro termo da Pa :");
		int primeiroTermo = sc.nextInt();
		System.out.print("Digite a razaõ da Pa: ");
		int razao = sc.nextInt();
		System.out.print("Digite o numero de termos que deseja exibir :");
        int n = sc.nextInt();
        
        TermoPa pa =  new TermoPa(primeiroTermo,razao, n);
        for (int i = 0; i < n; i++) {
        	System.out.println(pa.proximoTermo() + " " );
			
		}
        
	}

}
