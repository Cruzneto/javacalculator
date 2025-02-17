import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator myCalculator = new Calculator();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor ");
		double num1 = input.nextDouble();
		
		System.out.println("Digite o primeiro valor ");
		double num2 = input.nextDouble();
		
		System.out.println("Digite qual operação deseja fazer: + - / * ");
		char operacao = input.next().charAt(0);
		
		System.out.println(myCalculator.calcular(num1, num2, operacao));
		
		
		

	}

}
