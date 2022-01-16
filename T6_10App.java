import java.util.Random;

import javax.swing.JOptionPane;

public class T6_10App {

	static int num;
	static int lista1[];
	static int listaPrimos[];
	static Random claseRandom = new Random();
	static String numerosPrimos = "";
	
	public static void main(String[] args) {
		crearListaNumerosAleatorios();
		buscarNumerosPrimos();
		buscarMayorNumeroPrimo();
	}
	
	public static void crearListaNumerosAleatorios() {		
		
		int numRandom;
		
		String txtNum = JOptionPane.showInputDialog("Introduce el tamaño de la lista de numeros aleatorios:");
		num = Integer.parseInt(txtNum);	
		
		lista1 = new int[num];		
				
		for (int i = 0; i < lista1.length; i++) {
			numRandom = claseRandom.nextInt(101);			
			lista1[i] = numRandom;			
		}
		//mostrar la lista
		System.out.println("Lista1");
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(lista1[i] + " ");
		}
		System.out.println();
	}
	
	public static boolean esPrimo(int num) {
		for(int i=2;i<num;i++) {
	        if(num%i==0) //Mira si el resto es 0 por cada uno de los numeros incrementados.
	            return false;
	    }
	    return true;		
	}
	
	public static void buscarNumerosPrimos() {
		listaPrimos = new int[num];
		
		for (int i = 0; i < lista1.length; i++) {
			if(esPrimo(lista1[i])) {
				listaPrimos[i] = lista1[i];
				numerosPrimos += Integer.toString(lista1[i]) + " ";
			}			
		}
		if(numerosPrimos.equals("")) {
			System.out.print("No hay numeros Primos");
		} else {
			System.out.print("Los numeros primos de la lista son: " + numerosPrimos);
		}		
	}	
	
	public static void buscarMayorNumeroPrimo() {
		int numPrimoMayor = 0;
		for (int i = 0; i < listaPrimos.length; i++) {			
			if(listaPrimos[i] > numPrimoMayor ) {
				numPrimoMayor = listaPrimos[i];
			}
		}
		if(numPrimoMayor == 0) {
			return;
		} else {
			System.out.println("\nEl numero primo mayor es: " + numPrimoMayor);
		}		
		/*System.out.println("ListaPrimos");
		for (int i = 0; i < listaPrimos.length; i++) {
			System.out.print(listaPrimos[i] + " ");
		}*/
	}
}
