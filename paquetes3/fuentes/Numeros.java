public class Numeros{
	private int numero;
	
	public Numeros(int n){
		this.numero=n;
	}
	
	private boolean esPar(){
	return (this.numero%2)==0;	
		
		
	}
	@Override
	public String toString(){
	return "EL numero "+this.numero+ " es par " +esPar();
		
	}	
}
