package serie;

public class Videojuego implements Entregable {
	
	//Definicion de constantes
	
	private static final int horas_default=10;
	private static final boolean entregado_default=false;
	
	//Definición de atributos
	
	protected String titulo;
	protected int horas_est;
	protected boolean entregado;
	protected String genero;
	protected String company;
	
	//Constructor por defecto
	
	public Videojuego() {
		titulo="";
		horas_est=horas_default;
		entregado=entregado_default;
		genero="";
		company="";
	}
	
	//Constructor que recibe los atributos titulo y compañia como parámetro 
	
	public Videojuego (String titulo, String company) {
		this.titulo=titulo;
		horas_est=horas_default;
		entregado=entregado_default;
		genero="";
		this.company=company;
	}
	
	//Constructor que recibe todos los atributos como parámetro a excepción de entregado.
	
	public Videojuego (String titulo, int horas_est,String genero,String company) {
		this.titulo=titulo;
		this.horas_est=horas_est;
		entregado=entregado_default;
		this.genero=genero;
		this.company=company;
	}
	
	//Getters y setters de la clase
	
	
	public String getTitulo() {
		return titulo;
	}
	public int getHoras_est() {
		return horas_est;
	}
	public String getGenero() {
		return genero;
	}
	public String getCompany() {
		return company;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setHoras_est(int horas_est) {
		this.horas_est = horas_est;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	//Sobreescribo el método toString
	@Override
	public String toString() {
		return "Videojuego-->titulo=" + titulo + ", horas estimadas=" + horas_est + ", entregado=" + entregado + ", genero="
				+ genero + ", compañia=" + company;
	}
	
	/*
	 * Implementación de la interface entregable
	 */
	
	//Cambia el atributo prestado a true
	
	public void entregar() {
		entregado=true;
	}
	
	//Cambia el atributo prestado a false
	
	public void devolver() {
		entregado=entregado_default;
		
	}
	
	//Devuelve el estado del estributo prestado
	
	public boolean isEntregado() {
		return(entregado);
	}
	
	//Compara el numero de horas de juego
	
	public void compareTo(Object a) {
		
		if(a instanceof Videojuego) {
			Videojuego game=(Videojuego) a;
			System.out.println("El videojuego"+this.getTitulo()+"requiere"+this.getHoras_est()+"mientras que"+game.getTitulo()+":"+game.getHoras_est());
		}
		
	}
}
