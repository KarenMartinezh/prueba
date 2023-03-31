package tallerBonificacion;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class punto2 {
     /**
      * Metodo o funcion que permite saber si lo que se ingresa es una vocal o no.
      * @param letra
      * @return mensaje
      */
	public static String esVocal(char letra ) {
		//declaracion variable 
        String mensaje="";
         //proceso, para saber si lo que ingreso el usuario si es una vocal.
       
       	if (letra>='a'&& letra<='z'|| letra>='A'&& letra<='Z') {
       		
       		if(letra=='a'|| letra=='e'|| letra=='i'|| letra=='o'||letra=='u'
       		 || letra=='A'|| letra=='E'|| letra=='I'|| letra=='O'||letra=='U') {
      	 mensaje=(" ES VOCAL");
      	System.out.println(mensaje+ " ");
         }
         else
         {
       	  mensaje=(" NO VOCAL");
       	System.out.println(mensaje+ " ");

         }
       	}else {
       	 //proceso para avisarle al usuario que ingreso algo mal.
       
       		mensaje = ("no es caracter");
       		System.out.println(mensaje+ " ");
    	}  
       	
       	
       	
        char a=' ';
       	while(letra!=a);
      
        	  
        	  System.out.println(mensaje+ " Ingresò un espacio");
       	  

         mensaje+=("Fin del programa");
		return mensaje;
}
	
         
       		 
       	 
	
         // proceso para avisarle al usuario que ingreso algo mal y se rompe el programa.
	
	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		char letra;
		System.out.println("Ingrese una letra");
		letra = dato.next().charAt(0);
	    esVocal(letra);
	}

	}
