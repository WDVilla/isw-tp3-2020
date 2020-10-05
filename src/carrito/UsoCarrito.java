

public class UsoCarrito {

	public static void main(String[] args) throws Exception {
		Usuario a = new Usuario("Franco");
		Producto p1 = new Producto();
		Producto p2 = new Producto("Aire Acondicionado", 50000);
		p1.setNombre("Cocina Electrica");
		p1.setPrecio(70000);
		p1.setStock(13);
		p2.setStock(10);
		Carrito f = new Carrito(a);
		f.setDetalle(p1, 2);
		f.setDetalle(p2, 4);
		
		System.out.println("Nombre del usuario: "+a.getNombre()+" id del carrito: "+f.getId()+" Total de la compra: "+ f.getTotal()+" Pesos");
		System.out.println("Cantidad de "+ p1.getNombre()+" en Stock:"+p1.getStock());
		System.out.println("Cantidad de "+ p1.getNombre()+" en Carrito:"+f.getDetalle(0).getCantidad());
	}

}
