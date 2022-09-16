package electrodomestico;

//Clase que hereda de electrodoméstico

public class Television extends Electrodomestico {
	
	// Definición de constantes
	
	private static final int pulgadas_default=5;
	private static final boolean sintonizador_default=false;
	
	//Definición de los atributos
	
	private int pulgadas;
	private boolean sintonizador;
	
	// Constructor por defecto. 
	// Se llama al constructor por defecto de la clase padre
	
	public Television() {
		super();
		pulgadas=pulgadas_default;
		sintonizador=sintonizador_default;
	}
	
	//Constructor que recibe como parámetro el precio y el peso
	//Pasan como parámetros al constructor de la clase padre
	//Atributos propios de televisión por defecto
	
	public Television(double precio,int peso) {
		super(precio,peso);
		pulgadas=pulgadas_default;
		sintonizador=sintonizador_default;
	}
	
	/*
	 * Constructor que recibe todos los atributos como parámetro
	 * El precio, color, consumo energético, y peso pasan al metodo super()
	 */
	
	public Television(double precio, String color,char consumoEnergetico, int peso,int pulgadas,boolean sintonizador) {
		super(precio,color,consumoEnergetico,peso);
		this.pulgadas=pulgadas;
		this.sintonizador=sintonizador;
	}
	public int getPulgadas() {
		return pulgadas;
	}
	public boolean isSintonizador() {
		return sintonizador;
	}
	
	/* Se sobreescribe el metodo precioFinal()
	 * Se hace uso del metodo precioFinal de la clase padre
	 * para generar el precio del electrodoméstico. Al cual se 
	 * le añadirá un 30%  si excede una tamaño de 40 pulgadas
	 * y 50€ si incluye sintonizador.
	 */
	
	public double precioFinal() {
		double precio;
		precio=super.precioFinal();
		if (pulgadas>40) {
			precio=precio+0.3*precio;
		}
		if(sintonizador==true) {
			precio=precio+50;
		}
		return(precio);
	}

	@Override
	public String toString() {
		return "Television [pulgadas=" + pulgadas + ", sintonizador=" + sintonizador + "]";
	}
	

}
