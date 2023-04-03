package Actividad6;

import java.util.Scanner;

	public class Calculadora {
	    
	    public static double sumar(double numero1, double numero2) {
	        return numero1 + numero2;
	    }
	    
	    public static double restar(double numero1, double numero2) {
	        return numero1 - numero2;
	    }
	    
	    public static double multiplicar(double numero1, double numero2) {
	        return numero1 * numero2;
	    }
	    
	    public static double dividir(double numero1, double numero2) {
	        if (numero2 == 0) {
	            System.out.println("El divisor no puede ser 0 ");
	            Scanner scanner = new Scanner(System.in);
	            numero2 = scanner.nextDouble();
	        }
	        
	        return numero1 / numero2;
	    }
	    
	    public static void main(String[] args) {
	    	
	        Calculadora calculadora = new Calculadora();
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Ingrese el primer numero: ");
	        double numero1 = scanner.nextDouble();
	        
	        System.out.println("Ingrese el segundo numero: ");
	        double numero2 = scanner.nextDouble();
	        double resultado;
	        
	        System.out.println("Seleccione la operacion");
	        System.out.println("1 Suma");
	        System.out.println("2 Resta");
	        System.out.println("3 Multiplicacion");
	        System.out.println("4 Division");
	        
	        int opcion = scanner.nextInt();
	        
	        //AGREGAMOS UN SWITCH
	        switch (opcion) {
	            case 1:
	                // suma
	                resultado = calculadora.sumar(numero1, numero2);
	                System.out.println("El resultado de la suma es " + resultado);
	                break;
	            case 2:
	                // resta
	                resultado = calculadora.restar(numero1, numero2);
	                System.out.println("El resultado de la resta es " + resultado);
	                break;
	            case 3:
	                // multiplicación
	                resultado = calculadora.multiplicar(numero1, numero2);
	                System.out.println("El resultado de la multiplicacion es " + resultado);
	                break;
	            case 4:
	                // división
	                resultado = calculadora.dividir(numero1, numero2);
	                System.out.println("El resultado de la division es " + resultado);
	                break;
	            default:
	                System.out.println("Error! debe elegir entre 1, 2, 3 y 4");
	  }
	        
  }
}
	
