import javax.swing.JOptionPane;

public class T6_6App {

	static int num;
	
	public static void main(String[] args) {
		pedirNum();
		mostrarResultado();
	}
	
	public static void pedirNum() {		
		String txtNum = JOptionPane.showInputDialog("Introduce un numero para contar las cifras:");
		num = Integer.parseInt(txtNum);		
	}
	
	public static int contarCifras(int num) {
				
		int contador = 0;
		String txtNum = Integer.toString(num);
		for (int i = 0; i < txtNum.length(); i++) {
			contador++;
		}		
		return contador;
	}
	
	public static void mostrarResultado() {
		if(num < 0) {
			JOptionPane.showMessageDialog(null, "El numero tiene que ser positivo");
		} else {
			JOptionPane.showMessageDialog(null, "El numero tiene: " + contarCifras(num) + " cifras");
		}		
	}	
}
