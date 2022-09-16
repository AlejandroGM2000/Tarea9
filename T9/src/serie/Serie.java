package serie;

public class Serie implements Entregable {
	
	//Definicion de constantes
	
	private static final int temp_default=3;
	private static final boolean entregado_default=false;
	
	/*Definición de atributos
	 */
	
	protected String titulo;
	protected int num_temp;
	protected boolean entregado;
	protected String genero;
	protected String creador;
	
	//Constructor por defecto
	
	public Serie() {
		titulo="";
		num_temp=temp_default;
		entregado=entregado_default;
		genero="";
		creador="";
	}
	
	//Constructor con los atributos titulo y creador como parametro
	
	public Serie(String titulo, String creador) {
		this.titulo=titulo;
		num_temp=temp_default;
		entregado=entregado_default;
		genero="";
		this.creador=creador;
	}
	
	//Constructor con todos los atributos como parametro a excepcion
	//de entregado, que se mantiene por defecto.
	
	public Serie(String titulo, int num_temp,String genero,String creador) {
		this.titulo=titulo;
		this.num_temp=num_temp;
		entregado=entregado_default;
		this.genero=genero;
		this.creador=creador;
	}
	
	//Getters y setters de la clase
	
	public String getTitulo() {
		return titulo;
	}
	public int getNum_temp() {
		return num_temp;
	}
	public String getGenero() {
		return genero;
	}
	public String getCreador() {
		return creador;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public void setNum_temp(int num_temp) {
		this.num_temp = num_temp;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setCreador(String creador) {
		this.creador = creador;
	}
	
	//Metodo toString sobreescrito
	
	@Override
	public String toString() {
		return "Serie--> titulo=" + titulo + ", numero de temporadas=" + num_temp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador;
	}
	
	/*
	 * Implementación de los cuatro métodos definidos en la interface
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
	
	//Compara el numero de temporas por serie
	
	public void compareTo(Object a) {
		
		if(a instanceof Serie) {
			Serie ser=(Serie) a;
			System.out.println("La serie"+this.getTitulo()+"requiere"+this.getNum_temp()+"mientras que"+ser.getTitulo()+":"+ser.getNum_temp());
		}
		
	}

}
