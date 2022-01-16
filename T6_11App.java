import javax.swing.JOptionPane;
import java.util.Random;

public class T6_11App {

	static int num;
	static int lista1[];
	static int lista2[];
	static Random claseRandom = new Random();	
	static int lista3[];
	
	public static void main(String[] args) {
		crearListaNumerosAleatorios();
		modificarLista2ApuntaAla1();
		nuevoArray(lista1, lista2);
		mostrarResultado();
	}
	
	//Creanis una lista con el tamaño que especifique el usuario y la retornamos
	public static void crearListaNumerosAleatorios() {		
		
		int numRandom;
		
		String txtNum = JOptionPane.showInputDialog("Introduce el tamaño de dos listas:");
		num = Integer.parseInt(txtNum);	
		
		lista1 = new int[num];		
				
		for (int i = 0; i < lista1.length; i++) {
			numRandom = claseRandom.nextInt(10);			
			lista1[i] = numRandom;			
		}
		//mostrar la lista
		/*System.out.println("Lista1");
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(lista1[i]);
		}*/
	}
	
	public static void modificarLista2ApuntaAla1() {
		int numRandom;		
		
		lista2 = lista1;		
		
		for (int i = 0; i < lista2.length; i++) {
			numRandom = claseRandom.nextInt(10);			
			lista2[i] = numRandom;			
		}
		//mostrar la lista 2 que apunta a la 1
		/*System.out.println("\nLista2");
		for (int i = 0; i < lista2.length; i++) {
			System.out.print(lista1[i]);
		}*/
	}
	
	public static int[] nuevoArray(int[] array1, int[] array2) {
		
		lista3 = new int[num];
		int result;
		
		for (int i = 0; i < lista1.length; i++) {
			result = lista1[i] * lista2[i];
			lista3[i] = result;
		}		
		return lista3;
	}
	
	public static void mostrarResultado() {	
		System.out.println("\nArray1");
		for (int i = 0; i < lista1.length; i++) {
			System.out.print(lista1[i] + " ");			
		}
		System.out.println("\nArray2");
		for (int i = 0; i < lista2.length; i++) {
			System.out.print(lista2[i] + " ");			
		}
		System.out.println("\nArray3");
		for (int i = 0; i < lista3.length; i++) {
			System.out.print(lista3[i] + " ");			
		}
	}
}
