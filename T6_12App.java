import java.util.Random;

import javax.swing.JOptionPane;

public class T6_12App {

	static int num;
	static int num2;
	static int lista1[];
	static Random claseRandom = new Random();
	
	public static void main(String[] args) {
		crearListaNumerosAleatorios();
		buscarNumeros();
	}
	
	public static void crearListaNumerosAleatorios() {		
		
		int numRandom;
		
		String txtNum = JOptionPane.showInputDialog("Introduce el tamaño de la lista de numeros aleatorios:");
		num = Integer.parseInt(txtNum);	
		
		String txtNum2 = JOptionPane.showInputDialog("Buscar numeros acabados en: ");
		num2 = Integer.parseInt(txtNum2);	
		
		lista1 = new int[num];		
		//Creamos la lista de numeros random		
		for (int i = 0; i < lista1.length; i++) {
			numRandom = claseRandom.nextInt(301);			
			lista1[i] = numRandom;			
		}
		//mostrar la lista
		System.out.println("Lista");
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(lista1[i] + " ");
		}
		System.out.println();
	}
	
	public static void buscarNumeros() {
		String result = "";
		String txtNum = "";
		int numero;
		char ultimaPos;
		
		if(validarNumero()) {
			for (int i = 0; i < lista1.length; i++) {
				txtNum = Integer.toString(lista1[i]); //Cogemos el valor de la lista como String
				ultimaPos = txtNum.charAt(txtNum.length()-1);//Cogemos la ultima posicion del String
				numero = Integer.parseInt(String.valueOf(ultimaPos));//Cogemos el valor como Integer
				//Si coincide con el numero introducido por el usuario lo añadira al resultado;
				if(numero == num2) {
					result += Integer.toString(lista1[i]) + " ";
				}
			}
			System.out.println("Numeros de la lista acabados en " + num2 + ": " + result);
		}		
	}
	//Mira si el numero introducido por el usuario no sea mayor de 9 o menor de 0.
	public static boolean validarNumero() {
		if(num2 > 9 || num2 < 0) {
			System.out.println("No has introducido un numero correcto");
			return false;
		}
		return true;
	}
	
	
}
