package electrodomestico;

public class MainElectro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Inicializo unan tabla vacia de 10 electrodomésticos vacia
		
		Electrodomestico [] electro=new Electrodomestico[10];
		double precio=0;
		double precio_lavadora=0;
		double precio_television=0;
		double precio_electro=0;
		
		//Lleno la tabla de electrodomesticos con lavadoras, televisiones y electrodomésticos
		/*
		 * Estos contendrán diversos casos en el calculo del precio:
		 * 1-Electrodoméstico: variaciones en el consumo y peso
		 * 2-Lavadora: Las condiciones anteriores junto con la carga (si es superior a 30)
		 * 3-Television: Las condiciones de electrodoméstico y el tamaño de pantalla y presencia de sintonizador
		 */
		
		electro[0]=new Electrodomestico(120,8);
		
		//Genero una lavadora con un color no incluido en la lista. El valor se dispondrá en blanco
		
		electro[1]=new Lavadora(200,"naranja",'B',40,20);
		
		//Lavadora con carga superior a los 30 kg.
				
		electro[2]=new Lavadora(180,"NEGRO",'R',50,31);
		
		//Televisor con más de 40 pulgadas y sintonizador
		
		electro[3]=new Television(400,"gris",'A',80,41,true);
		
		//Televisor con menos de 40 pulgados y sin sintonizador
		
		electro[4]=new Television(200,"gris",'A',16,24,false);
		
		electro[5]=new Electrodomestico(100,"rojo",'C',22);
		
		electro[6]=new Lavadora(180,83);
		
		electro[7]=new Television(10,"negro",'D',10,90,true);
		
		electro[8]=new Electrodomestico(300,65);
		
		electro[9]=new Television(10,"blanca",'E',8,48,true);
		
		/*
		 * Recorro la tabla de Electrodomesticos, analizando si son
		 * electrodomesticos, lavadoras o televisiones. En base al resultado
		 * calculo el precio según los parámetros establecidos.
		 */
		
		for(int i=0;i<electro.length;i++) {
			if(electro[i] instanceof Lavadora) {
				Lavadora lavadora=(Lavadora)electro[i];
				precio_lavadora=precio_lavadora+ lavadora.precioFinal();
			}
			else if(electro[i] instanceof Television) {
				Television tele=(Television)electro[i];
				precio_television=precio_television+tele.precioFinal();
			}
			else {
				precio_electro=precio_electro+electro[i].precioFinal();
			}
				
		}
		precio=precio_lavadora+precio_television+precio_electro;
		
		System.out.println("\n");
		
		System.out.println("Compra total: "+precio);
		System.out.println("Compra lavadora: "+precio_lavadora);
		System.out.println("Comprar television: "+precio_television);
		System.out.println("Comprar electrodomestico: "+precio_electro);
	}

}
