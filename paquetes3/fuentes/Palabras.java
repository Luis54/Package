public class Palabras{
		private String palabra;
		
	public Palabras(String p){
		this.palabra=p;
	}
	public boolean empiezaVocal(){
	return (this.palabra.startsWith("a") || this.palabra.startsWith("e") || this.palabra.startsWith("i") ||	this.palabra.startsWith("o") || this.palabra.startsWith("u") || this.palabra.startsWith("A") || this.palabra.startsWith("E") ||	this.palabra.startsWith("I") || this.palabra.startsWith("O") || this.palabra.startsWith("U"));		 			
	}	
	public String toString(){
	return "La palabra "+this.palabra+" empieza por la vocal " +empiezaVocal();	
	}	
	
}
