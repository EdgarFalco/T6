import javax.swing.JOptionPane;

public class T6_5App {

	static int num;
	
	public static void main(String[] args) {
		pedirNum();
		deDecimalAbinario(num);
		mostrarResultado();
	}	
	
	public static String deDecimalAbinario(int num) {
		String binario = "";
		int resto;		
		
		while(num > 2) {
			resto = num%2;
			num = num/2;			
			binario += Integer.toString(resto); //Vamos añadiendo en un String el resto de la division.			
		}
		//Cogemos el cociente para ponerlo en el String solo si es 1 o 0.
		if(num == 1 || num == 0) {
			binario += Integer.toString(num);			
		}		
		//Giramos el contenido del string para mostrar correctamente el resultado
		String binarioInvertido = "";
		for (int i = binario.length()-1; i >= 0; i--) {
			binarioInvertido = binarioInvertido + binario.charAt(i);
		}		
		return binarioInvertido;
	}
	
	public static void pedirNum() {		
		String txtNum = JOptionPane.showInputDialog("Introduce un numero:");
		num = Integer.parseInt(txtNum);
	}
	
	public static void mostrarResultado() {
		JOptionPane.showMessageDialog(null, "En codigo binario seria: " + deDecimalAbinario(num));
	}
}
