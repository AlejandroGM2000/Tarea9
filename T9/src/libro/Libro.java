package libro;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numpaginas;
	
	//Constructor de la clase Libro
	
	public Libro(String isbn,String titulo, String autor,int numpaginas) {
		this.isbn=isbn;
		this.titulo=titulo;
		this.autor=autor;
		this.numpaginas=numpaginas;
	}
	
	//Definición de los getter y setter

	public String getIsbn() {
		return isbn;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getAutor() {
		return autor;
	}

	public int getNumpaginas() {
		return numpaginas;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void setNumpaginas(int numpaginas) {
		this.numpaginas = numpaginas;
	}

	//Sobreescribe el método toString()
	
	@Override
	public String toString() {
		return "El Libro con ISBN=" + isbn + " por el autor=" + autor + " tiene "+numpaginas+" paginas";
	}
	
	
}
