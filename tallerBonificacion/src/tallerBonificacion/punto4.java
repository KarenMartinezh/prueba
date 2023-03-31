package tallerBonificacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class punto4 {
/**
 * Metodo o funcion que nos permite imprimir el metodo de fibonacci
 * @param n
 */
	public static void fibonacci (int n) {
		//Declaración de variables
		
			int num1=0, suma=1, num2=0;

//Cuando i sea menor a n el ciclo termina

  for (int i=1; i<n; i++) {
	System.out.print(suma+",");
	//num2 toma el valor de la suma de num1 y suma
	num2=num1+suma;
	//num1 toma el valor de suma
	num1=suma;
	//suma toma el valor de num2
	suma=num2;
	
    }
   }

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		int n;
		System.out.println("Ingrese un numero");
		n = dato.nextInt();
		fibonacci(n);
	}

	}