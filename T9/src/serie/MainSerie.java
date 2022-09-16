package serie;

public class MainSerie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Definicion de los arrays de series y juegos de 5 posiciones
		 */
		
		Serie [] series=new Serie[5];
		Videojuego [] gaming=new Videojuego[5];
		int video_entregados=0;
		int series_entregados=0;
		int pos_game=0;
		int pos_serie=0;
		int game_ant=0;
		int serie_ant=0;
		
		//Lleno las tablas
		
		series[0]=new Serie("Big bang theory",13,"comedia","Chuck Lorre");
		series[1]=new Serie("Kenobi",1,"ciencia ficcion","George Lucas");
		series[2]=new Serie("Mandalorian",2,"ciencia ficcion","George Lucas");
		series[3]=new Serie("Leonardo",2,"historica","Frank");
		series[4]=new Serie("Chernobyl",1,"historica","Mazin");
		
		gaming[0]=new Videojuego("Fifa22",48,"deporte","EA");
		gaming[1]=new Videojuego("NBA22",40,"deporte","2K");
		gaming[2]=new Videojuego("F12022",30,"deporte","EA");
		gaming[3]=new Videojuego("Uncharted4",60,"aventura","Naughthy Dog");
		gaming[4]=new Videojuego("Spiderman",24,"aventura","Imsomniac");
		
		//Pruebo el metodo entregar (cambia entregar a true)
		
		series[1].entregar();
		series[3].entregar();
		gaming[0].entregar();
		gaming[2].entregar();
		
		System.out.println("Serie entregada:"+series[1].isEntregado());
		System.out.println("Videojuego entregado:"+gaming[0].isEntregado());
		
		/*
		 * Se recorren las tablas para ver que objetos se han entregado, y en el caso de que
		 * el atribudo entregado sea true, se aplica el metodo devolver para restablecerlo a false.
		 * Se realiza un recuento de esta acción.
		 */
		
		for (int i=0;i<series.length;i++) {
			if(series[i].isEntregado()) {
				series_entregados=series_entregados+1;
				series[i].devolver();
			}
			if(gaming[i].isEntregado()) {
				video_entregados=video_entregados+1;
				gaming[i].devolver();
			}
		}
		
		//Compruebo que se realize la entrega correctamente
		
		System.out.println("\nSerie entregada:"+series[1].isEntregado());
		System.out.println("Videojuego entregado:"+gaming[0].isEntregado());
		
		System.out.println("\nSeries entregadas y devueltas:"+series_entregados);
		System.out.println("Videojuegos entregados y devueltos:"+video_entregados);
		
		//Se recorren las tablas para observar que serie y juego tienen mayor
		//numero de temporadas o horas jugables.
		
		for(int j=0;j<series.length;j++) {
			if(serie_ant<series[j].getNum_temp()) {
				pos_serie=j;
				serie_ant=series[j].getNum_temp();
			}
			if(game_ant<gaming[j].getHoras_est()) {
				pos_game=j;
				game_ant=gaming[j].getHoras_est();
			}
		}
		System.out.println(series[pos_serie].toString());
		System.out.println(gaming[pos_game].toString());
	}

}
