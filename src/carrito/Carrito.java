

public class Carrito {
	private int contador=0;
	private double id;
	private Usuario user;
	private DetalleProducto[] detalle = new DetalleProducto[20];
	private int total;
	public Carrito (Usuario user) {
		this.id=Math.random()*100;
		this.user= user;
	}
	public double getId() {
		return id;
	}
	public int getTotal() {
		return total;
	}
	public String getUsuario() {
		return user.getNombre();
	}
	public void setDetalle(Producto nombre, int cant) throws Exception { //este metodo añade detalles al carrito
		detalle[contador]=new DetalleProducto();
		detalle[contador].setProducto(nombre);
		detalle[contador].setCantidad(cant);
		detalle[contador].getProducto().setStock(detalle[contador].getProducto().getStock()-cant);
		if (detalle[contador].getProducto().getStock()<0) {
			Exception error = new Exception("No hay stock suficiente de: "+detalle[contador].getProducto().getNombre());
			throw error;
		}
		total= total+((detalle[contador].getProducto().getPrecio())*cant);
		contador++;
	}
	public DetalleProducto getDetalle(int i) {
		return detalle[i];
	}
}
