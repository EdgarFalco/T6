import javax.swing.JOptionPane;
public class T6_3App {

	static int num;
	
	public static void main(String[] args) {
		
		pedirNum();
		mostrarResultado();
	}
	
	public static void pedirNum() {
		String txtNum = JOptionPane.showInputDialog("Introduce un numero:");
		num = Integer.parseInt(txtNum);
	}
	
	public static boolean esPrimo(int num) {
		for(int i=2;i<num;i++) {
	        if(num%i==0) //Mira si el resto es 0 por cada uno de los numeros incrementados.
	            return false;
	    }
	    return true;		
	}
	
	public static void mostrarResultado() {
		if(esPrimo(num)) {
			JOptionPane.showMessageDialog(null, "Es un numero primo");
		} else {
			JOptionPane.showMessageDialog(null, "No es un numero primo");
		}
	}
}
