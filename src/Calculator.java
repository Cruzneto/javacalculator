public class Calculator {

		public Calculator( ) {
			
		}
		private double add(double num1, double num2) {
	        return num1 + num2;
	    }

	    private double mult(double num1, double num2) {
	        return num1 * num2;
	    }

	    private double divide(double num1, double num2) {
	        if (num2 == 0) {
	            throw new ArithmeticException("Erro: Divisão por zero não permitida.");
	        }
	        return num1 / num2;
	    }

	    private double subtract(double num1, double num2) {
	        return num1 - num2;
	    }


	public double calcular(double num1, double num2, char operacao) {
        switch (operacao) {
        case '+':
            return add(num1, num2);
        case '-':
            return subtract(num1, num2);
        case '/':
            return divide(num1, num2);
        case '*':
            return mult(num1, num2);
        default:
            throw new IllegalArgumentException("Operação inválida. Use +, -, * ou /.");
					}
		
		
												}

}