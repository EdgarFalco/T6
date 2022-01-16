import javax.swing.JOptionPane;
public class T6_2App {

	static int cuantosNum;
	static int inicio;
	static int fin;
	
	public static void main(String[] args) {
		pedirCuantosNumeros();
		inicioFinNumeros();
		generarNumeros();
	}
	
	//Generara una lista con el tamaño especificado y generara un lista de numeros con el rango especificado. 
	public static void generarNumeros() {
		int listNum[] = new int [cuantosNum];
		String resultado = "";
		for (int i = 0; i < listNum.length; i++) {
			listNum[i] = (int) (Math.random() * fin + inicio);//Creamos los numeros aleatorios y lo añadimos a la lista;
			resultado += Integer.toString(listNum[i]) + " ";//Añadimos todo en un String para luego mostrarlo junto.
		}
		JOptionPane.showMessageDialog(null, "Se han generado " + cuantosNum + " numeros: " + resultado);		
	}	
	
	//Pediremos que rango de numeros generaremos (principio y fin incluidos).
	public static void inicioFinNumeros() {
		String txtInicio = JOptionPane.showInputDialog("Introduce el inicio:");
		inicio = Integer.parseInt(txtInicio);
		String txtFin = JOptionPane.showInputDialog("Introduce el final:");
		fin = Integer.parseInt(txtFin);
	}
	
	//Pediremos cuantos numeros vamos a generar.
	public static void pedirCuantosNumeros() {
		String txtCuantosNum = JOptionPane.showInputDialog("Introduce cuantos numeros quieres generar:");
		cuantosNum = Integer.parseInt(txtCuantosNum);
	}

}
