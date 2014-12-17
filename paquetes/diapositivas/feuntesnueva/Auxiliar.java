//vamos a crear una biblioteca basica
//situada en biblioteca.utililes
//eso se traduce que la primera linea de codigo sea:
//package biblioteca.utilidades
//lo compilamos con la opcin javac -d
//calse auxiliar que nos crea objetos
//y metodos de acceso
package biblioteca;
public class Auxiliar{
		private String nombre;
		private int edad;
	public Auxiliar(){
			this.nombre="Enrique gomez";
			this.edad=22;
		
		
	}		
	//getter y setter
	public String getNombre(){
			return this.nombre;
	}	
	public int getEdad(){
			return this.edad;
	}
	public void setNombre(String n){
		this.nombre=n;
	}	
	public void setEdad(int e){
		this.edad=e;
	}
	public boolean mayorEdad(){
			return this.edad>=18;
	}	
	@Override
	public String toString(){
	return ("Su nombre es "+this.nombre+" Y su edad es "+this.edad);	
		
	}	
		
}	
