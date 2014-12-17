//clase que genera numero aleatorios
//lo llevamos a biblioteca.utilidades
package biblioteca.utilidades;
public class Numeros{
		//atributos
		private int numero;
		//constructor
		public Numeros(){
			this.numero = (int) Math.random()*10;
	}
	@Override 
	public String toString(){
		return "El numero creado es : " +this.numero;
	
	
	}
}	
