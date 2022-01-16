import javax.swing.JOptionPane;

public class T6_4App {

	static int num;
	
	public static void main(String[] args) {		
		pedirNum();
		mostrarResultado();
	}
	
	public static int calcularFactorial(int num) {		
		int resultado = 1;
		for (int i = 1; i <= num; i++) {
			resultado *= i;			
		}		
		return resultado;		
	}
	
	public static void pedirNum() {
		String txtNum = JOptionPane.showInputDialog("Introduce un numero:");
		num = Integer.parseInt(txtNum);
	}
	
	public static void mostrarResultado() {
		JOptionPane.showMessageDialog(null, "El factorial es: " + calcularFactorial(num));
	}
}
