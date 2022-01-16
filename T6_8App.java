import javax.swing.JOptionPane;

public class T6_8App {

	static int listNum[] = new int [10];
	
	public static void main(String[] args) {
		CrearListaConValores();
		MostrarValores();
	}
	
	public static void CrearListaConValores() {
		
		String txtValor = "";
		
		//Pedir los valores
		for (int i = 0; i < listNum.length; i++) {
			txtValor = JOptionPane.showInputDialog("Introduce un valor en la posicion " + i);
			listNum[i] = Integer.parseInt(txtValor);
		}		
	}
	
	public static void MostrarValores() {
		String result = "";
		
		for (int i = 0; i < listNum.length; i++) {
			//Añadimos todo en un String para luego mostrar el valor ordenado.
			result += "La posicion: " + i + " tiene el valor: " + Integer.toString(listNum[i]) + "\n";						
		}
		JOptionPane.showMessageDialog(null, result);
	}
}
