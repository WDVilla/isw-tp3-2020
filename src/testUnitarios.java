import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class testUnitarios {

	@Test
	
	void validarNombreClaseUsuario() {
		Usuario user = new Usuario("nombre");
		assertNotNull(user);
	}
	@Test
	void validarNombreClaseCarrito() {
		Usuario user = new Usuario("nombre");
		Carrito carrito = new Carrito(user);
		assertNotNull(carrito);
	} 
	@Test
	void ingresarPrecioAlProducto() {
		int precio = 200;
		Producto prod = new Producto ("nombre", precio);
		assertEquals(prod.getPrecio(), precio);
	}
	@Test
	void ingresarDetalleProductoAlCarrito() throws Exception {
		Producto prod = new Producto();
		Usuario user = new Usuario("nombre");
		Carrito car = new Carrito(user);
		car.setDetalle(prod, 0);
		assertEquals(car.getDetalle(0).getProducto(), prod);
	
	}
	@Test
	int devolverCantidadDeProductoEnUnCarrito (int i) throws Exception {
		Producto prod = new Producto();
		Usuario user = new Usuario("nombre");
		Carrito car = new Carrito(user);
		car.setDetalle(prod, 1);		
		return car.getDetalle(i).getCantidad();		
	}
	@Test
	int devolverTotalDeLaCompra () throws Exception {
		Producto prod = new Producto();
		Usuario user = new Usuario("nombre");
		Carrito car = new Carrito(user);
		car.setDetalle(prod, 1);
		return car.getTotal();
	}
	@Test
	int devolverCantidadEnStockDeUnProducto() {
		Producto prod = new Producto();
		return prod.getStock();
	}
	@Test
	void registrarCantidadEnStockDeUnProducto() {
		int stock=50;
		Producto prod = new Producto();
		prod.setStock(stock);
		assertEquals(prod.getStock(), stock);
	}

	

}
