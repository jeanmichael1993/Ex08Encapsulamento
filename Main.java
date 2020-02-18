import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Main{
	public static void main(String[]args){
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			
			Funcionario f1 = new Funcionario("João", 20, 3.50);
			Funcionario f2 = new Funcionario("Mateus", 40, 5.50);
			Funcionario f3 = new Funcionario("Lucas", 40, 13.50);

			System.out.println(f1);
			System.out.println(f2);
			System.out.println(f3);


			sc.close();


	}
}