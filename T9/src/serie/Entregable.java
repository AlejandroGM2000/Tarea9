package serie;

//Interface con los metodos que deben implementar las clases.

public interface Entregable {
	public void entregar();
	public void devolver();
	public boolean isEntregado();
	public void compareTo(Object a);
}
