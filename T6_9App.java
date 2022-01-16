import javax.swing.JOptionPane;
import java.util.Random;

public class T6_9App {	
		
	static int num;
	
	public static void main(String[] args) {		
		rellenarArray();
	}
	
	//Creanis una lista con el tamaño que especifique el usuario y la retornamos
	public static int[] crearLista(int num) {
		String txtNum = JOptionPane.showInputDialog("Introduce el tamaño para crear la lista:");
		num = Integer.parseInt(txtNum);
		int listNum[] = new int [num];
		return listNum;
	}
	
	public static void rellenarArray() {		
		int numRandom;
		int suma = 0;
		String result = "";
		Random claseRandom = new Random();		
		
		int[]listaCreada = crearLista(num);//Retornamos la lista para usarla;
		//Añadimos un valor aleatorio de 0 a 9 (ambos incluidos) en la lista;
		for (int i = 0; i < listaCreada.length; i++) {
			numRandom = claseRandom.nextInt(10);
			suma += numRandom;
			listaCreada[i] = numRandom;			
		}		
		
		for (int i = 0; i < listaCreada.length; i++) {
			//Añadimos todo en un String para luego mostrar el valor ordenado.
			result += "La posicion: " + i + " tiene el valor: " + Integer.toString(listaCreada[i]) + "\n";						
		}
		JOptionPane.showMessageDialog(null, result + "\n La suma de todos los valores es de: " + suma);		
	}
}
