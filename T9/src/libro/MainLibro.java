package libro;

public class MainLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Genero dos libros
		
		Libro lib1=new Libro("978-84-481-8137-6","Quimica","McGrawHill",360);
		Libro lib2=new Libro("977-87-484-8257-2","Fisica","McGrawHill",373);
		
		System.out.println(lib1.toString());
		System.out.println(lib2.toString());
		
		//Compruebo que libro tiene más paginas
		
		if (lib1.getNumpaginas()>lib2.getNumpaginas()) {
			System.out.println("El libro "+lib1.getTitulo()+" tiene mas paginas");
		}
		else {
			System.out.println("El libro de "+lib2.getTitulo()+" tiene mas paginas");
		}
	}

}
