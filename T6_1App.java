import javax.swing.JOptionPane;
public class T6_1App {

	static final double PI = 3.14;
	static double result;
	
	public static void main(String[] args) {		
				
		seleccionDeFigura();
	}
	
	public static void seleccionDeFigura() {
		String figura = JOptionPane.showInputDialog("Calcular Area introduce: \n -circulo \n -triangulo \n -cuadrado");
		if(figura.equals("circulo")) {
			calculaAreaCirculo();
		} else  if(figura.equals("triangulo")) {
			calculaAreaTriangulo();
		} else if(figura.equals("cuadrado")) {
			calculaAreaCuadrado();
		}else {
			JOptionPane.showMessageDialog(null, "No ha introducida una figura disponible");
		}		
	}
	
	public static void calculaAreaCirculo() {		
		String txtRadio = JOptionPane.showInputDialog("Introduce su radio para el calculo:");
		double radio = Double.parseDouble(txtRadio);
		result = (Math.pow(radio, 2)) * PI;
		mostrarResultado();
	}
	
	public static void calculaAreaTriangulo() {
		String txtBase = JOptionPane.showInputDialog("Introduce la base:");
		String txtAltura = JOptionPane.showInputDialog("Introduce la base:");
		double base = Double.parseDouble(txtBase);
		double altura = Double.parseDouble(txtAltura);
		result = (base * altura) / 2;
		mostrarResultado();				
	}
	
	public static void calculaAreaCuadrado() {
		String txtLado = JOptionPane.showInputDialog("Introduce el lado:");
		double lado = Double.parseDouble(txtLado);
		result = lado * lado;
		mostrarResultado();
	}
	
	public static void mostrarResultado() {
		JOptionPane.showMessageDialog(null, "Su area es: " + result);
		//En el caso de que queramos que el programa no pare, nos aseguramos de que el valor resultado vuelva a cero.
		result = 0;
	}

}
