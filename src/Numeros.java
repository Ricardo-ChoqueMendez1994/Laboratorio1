import javax.swing.JOptionPane;

public class Numeros {// aca definimos la clase numeros
	int numer; // creamos una variable numer tipo entero
	int i, neg=0, par=0;// creamos tres variables i tipo entero, neg y par tipo entero y las inicializamos en 0
	
	public void entrada() {//Declaramos el metodo entrada que es donde se hace todo el proceso
		for (int i = 0; i < 5; i++) {// cREAMOS EL CICLO FOR QUE SE REPITE 5 veces
			numer = ingresarDatos("Digite 1 numero");// Llamamos al metodo ingresarDatos pasando un mensaje que se guarda en la variable numer
			if (numer % 2 == 0) {//Aca verificamos si numer es divisible entre 2 utilizando el operador modulo %
				par++;// si el numer es divisible esta variable se incrementa en 1
			}
			if (numer < 0) {//Aca verificamos si la variable numer es menor que 0
				neg++;//Si el numer es menor a 0 esta variable incrementa en 1
			}
		}
		
		JOptionPane.showMessageDialog(null, "El numero de pares es: "+par+"\n y el numero de negativos es: "+neg);// el mensaje
		//anterior obtenemos informacion con el numero de pares y negativos obtenidos durante el ciclo for
		
	}
	
	public static int ingresarDatos(String mensaje) {//Declaramos metodo estatico ingresarDatos que tiene un parametro tipo string Mensaje
		String cadena;//Declaramos variable de tipo string llamada cadena
		int valor;//Declaramos variable de tipo int llamada valor
		cadena = JOptionPane.showInputDialog(null, mensaje);//Se utiliza este metodo para mostrar un mensaje, atraves del cual el usuario puede ingresar un valor numerico
		valor = Integer.parseInt(cadena);//Casteamos la linea anterior 
		return valor;// aca devolvemos el valor
	}
	
}
