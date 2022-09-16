package electrodomestico;

public class Electrodomestico {
	
	//Defino atributos de clase. El modificador es protected.
	//Este permite que las variables sean accesibles por la clase que hereda.
	
	protected double precioBase;
	protected String color;
	protected char consumoEnergetico;
	protected int peso;
	
	//Defino diversas constantes. Valores por defecto.
	
	private static final double precioBase_default=100;
	private static final String color_default="blanco";
	private static final char consumoEnergetico_default='F';
	private static final int peso_default=5;
	
	private static final String[] colores= {"blanco","negro","rojo","azul","gris"};
	private static final char[] consumos= {'A','B','C','D','E','F'};
	private static final int[] precios_consumo= {100,80,60,50,30,10};
	private static final int[] precios_peso= {10,50,80,100};
	
	//Constructor por defecto
	
	public Electrodomestico() {
		precioBase=precioBase_default;
		color=color_default;
		consumoEnergetico=consumoEnergetico_default;
		peso=peso_default;
	}
	
	//Constructor que recibe el precio y peso como parámetro
	
	public Electrodomestico(double precio,int peso) {
		precioBase=precio;
		color=color_default;
		consumoEnergetico=consumoEnergetico_default;
		this.peso=peso;
	}
	
	//Se reciben todos los atributos como parámetro
	//Compruebo que el consumo Energetico y el color introducidos sean aceptables.
	//En caso contrario, se disponen los valores por defecto.
	
	public Electrodomestico(double precio, String color,char consumoEnergetico, int peso) {
		precioBase=precio;
		this.color=comprobarColor(color);
		this.consumoEnergetico=comprobarConsumoEnergetico(consumoEnergetico);
		this.peso=peso;
	}
	
	//Genero los getters de los diferentes atributos
	
	public double getPrecioBase() {
		return precioBase;
	}

	public String getColor() {
		return color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}
	
	/*
	 * Método que recibe un carácter como parámetro. Este comprueba que
	 * el caracter introducido se halle en la lista definida de consumos energeticos (A-F)
	 * En caso negativo, retorna la letra F(defecto) 
	 */
	private char comprobarConsumoEnergetico(char letra) {
		boolean consumaceptable=false;
		int j=0;
		
		//Búsqueda de la letra introducida en la tabla de consumos.
		
		while((j<consumos.length)&&(consumaceptable!=true)) {
			if(consumos[j]==letra) {
				consumaceptable=true;
			}
			else {
				j++;
			}
		}
		if(consumaceptable==true) {
			return(letra);
		}
		else {
			return(consumoEnergetico_default);
		}
	}
	
	/*
	 * Método que recibe un String como parámetro. Este comprueba que
	 * el color(String)  introducido se halle en la lista definida de colores
	 * En caso negativo, retorna el color por defecto(blanco) 
	 */
	
	private String comprobarColor(String color) {
		boolean coloraceptable=false;
		int i=0;
		
		//Busqueda del color introducido como parámetro
		
		while((i<colores.length)&&(coloraceptable!=true)) {
			if(colores[i].equalsIgnoreCase(color)) {
				coloraceptable=true;
			}
			else {
				i++;
			}
		}
		if (coloraceptable==true) {
			return(color);
		}
		else {
			return(color_default);
		}
		
	}
	
	/*
	 * 	Método encargado de calcular el precio final en base al consumo
	 * energético y el tamaño establecido en la tabla de la diapositiva
	 * 4 de la tarea.
	 */
	
	public double precioFinal() {
		double precioFinal=precioBase;
		
		//Calculo del precio correspondiente al consumo energético.
		
		switch(consumoEnergetico) {
			case 'A':
				precioFinal=precioFinal+precios_consumo[0];
				break;
			case 'B':
				precioFinal=precioFinal+precios_consumo[1];
				break;
			case 'C':
				precioFinal=precioFinal+precios_consumo[2];
				break;
			case 'D':
				precioFinal=precioFinal+precios_consumo[3];
				break;
			case 'E':
				precioFinal=precioFinal+precios_consumo[4];
				break;
			case 'F':
				precioFinal=precioFinal+precios_consumo[5];
				break;
			
		}
		
		//Calculo del precio correspondiente al peso.
		
		if((peso>=0)&&(peso<=19)) {
			precioFinal=precioFinal+precios_peso[0];
		}
		else if((peso>=20)&&(peso<=49)) {
			precioFinal=precioFinal+precios_peso[1];
		}
		else{
			if(((peso>=50)&&(peso<=79))) {
				precioFinal=precioFinal+precios_peso[2];
			}
			else {
				precioFinal=precioFinal+precios_peso[3];
			}
			
		}
		return(precioFinal);
	}

	@Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}
	
}
