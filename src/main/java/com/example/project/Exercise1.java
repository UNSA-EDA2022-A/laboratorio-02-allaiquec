package com.example.project;

import java.util.Scanner;

public class Exercise1 {

	public static void main(final String[] args) {

		Exercise1 obj = new Exercise1();
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			System.out.println(obj.esCuadradoPerfecto(n));			
		}
	}

	//Si el numero es 1, pues defrente es cuadrado perfecto
	public boolean esCuadradoPerfecto(int numero) {
		if(numero == 1) 
			return true;
		else 
			return esCuadradoPerfecto(numero,1); 
		
	}
	
	public boolean esCuadradoPerfecto(int numero,int i) {
		if(numero ==i)     //Si recorrimos todos los números, y aún no encontramos alguno que cumpliera, será false
			return false;
		
		if ((numero % i == 0) && (numero / i == i))  // Veremos que si cumple con la siguientes condiciones será un cuadrado perfecto
             return true;
         
		return esCuadradoPerfecto(numero,i+1);  //Incrementamos al i
	}
}

}
