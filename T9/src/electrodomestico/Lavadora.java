package electrodomestico;

/*
 * Clase que hereda de Electrodomestico
 */

public class Lavadora extends Electrodomestico {
	
	//Definicion del valor por defecto de carga
	
	private static final int carga_default=5;
	
	//Definición del atributo propio de la clase
	
	private int carga;
	
	/*
	 * Constructor por defecto. Se hace uso del metodo super()
	 * para llamar al constructor de la clase padre.
	 */
	
	public Lavadora() {
		super();
		carga=carga_default;
	}
	
	/*
	 * Constructor con parámetros precio y peso. Se hace uso de metodo super()
	 * para llamar al constructor de la clase padre. Este recibirá como parámetros
	 * el precio y peso, atributos correspondientes a la clase padre.
	 */
	
	public Lavadora(double precio,int peso) {
		super(precio,peso);
		carga=carga_default;
	}
	
	/*
	 * Constructor con todos los atributos como parámetro. Se hace uso del metodo super()
	 * para llamar al constructor de la clase padre. Este recibirá como parámetros
	 * el precio,peso,color y consumo energético, atributos correspondientes a la clase padre. También se 
	 * recibe el atributo carga, propio de la clase hija. 
	 */
	
	public Lavadora(double precio, String color,char consumoEnergetico, int peso,int carga) {
		super(precio,color,consumoEnergetico,peso);
		this.carga=carga;
	}
	
	// Getter del atributo carga

	public int getCarga() {
		return carga;
	}
	
	/* Se sobreescribe el metodo precioFinal()
	 * Se hace uso del metodo precioFinal de la clase padre
	 * para generar el precio del electrodoméstico. Al cual se 
	 * le añadirá 50 euros si excede una carga de 30kg, específico 
	 * de la clase lavadora.
	 */
	public double precioFinal() {
		double precio;
		precio=super.precioFinal();
		if(carga>30) {
			precio=precio+50;
			return(precio);
		}
		else {
			return(precio);
		}
	}

	@Override
	public String toString() {
		return "Lavadora [carga=" + carga + "]";
	}

	
	
	
}
