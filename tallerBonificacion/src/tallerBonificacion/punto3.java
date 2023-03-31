package tallerBonificacion;

import java.util.Scanner;

import javax.swing.JOptionPane;



public class punto3 {
  /**
   * Metodo o funcion que imprime un rombo el cual recibe un numero que representa el tamaño de sus lados 
   * el cual va hacer el elemento que compone el rombo
   * @param n
   * @param c
   */
	public static void rombo (int n, char c) {
		
		for (int i = 0; i < n; ++i) {
	        //Cada primer for, se hace un salto de línea.
	        System.out.println();
	        //Utilizamos dos "for" para lograr la forma.
	        for (int j = 0; j < n-i-1; ++j) {                      
	            System.out.print(" ");           
	        }
	        for (int j = 0; j < 2*i+1; ++j){
	            System.out.print(c);
	        }            
	    }
	    //Se utiliza otro grupo de for para lograr la forma de "rombo"
	    for (int j = n-2; j >= 0; --j) {
	        System.out.println();
	        //Utilizamos dos "for" para lograr la forma.
	        for (int i = 0; i < n-j-1; ++i) {
	            System.out.print(" ");
	        }
	        for (int i = 0; i < 2*j+1; ++i) {
	            System.out.print(c);
	        }
	    }
	    System.out.println();

	}


		public static void main(String[] args) {
			
			Scanner dato = new Scanner(System.in);
			int n;
			System.out.println("Ingrese un numero");
			n = dato.nextInt();
			
			char c;
			System.out.println("Ingrese una letra");
			c = dato.next().charAt(0);
			
	       rombo (n, c);
		}

	}