import javax.swing.JOptionPane;

public class T6_7App {

	static double num;
	static String txtNum;
	
	public static void main(String[] args) {
		pedirEuros();
		pedirTipoDeMoneda();
		canviarOtraMoneda(num, txtNum);
	}
	
	public static void pedirEuros() {		
		String txtNum = JOptionPane.showInputDialog("Introduce la cantidad de euros:");
		num = Integer.parseInt(txtNum);		
	}
	
	public static void pedirTipoDeMoneda() {
		txtNum = JOptionPane.showInputDialog("Introduce la moneda que quieres convertir: \n -libra \n -dolar \n -yen");
	}
	
	public static void canviarOtraMoneda(double euro, String moneda) {
		double result = 0;
		if(moneda.equals("libra")) {
			result = euro * 1.20;
		} else if(moneda.equals("dolar")) {
			result = euro * 0.87;
		} else if(moneda.equals("yen")) {
			result = euro * 0.0077;
		} else {
			JOptionPane.showMessageDialog(null, "Has introducido una moneda incorrecta");
		}	
		JOptionPane.showMessageDialog(null, num + " euros " + "son " + result + " " + moneda);
	}
}
