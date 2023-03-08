package casosupuestojuanquerol;

import java.util.ArrayList;

public class Carrito {
	private Cliente cliente;
	private ArrayList<Producto> productos;
	public Carrito(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public void setProducto(Producto producto) {
		productos.add(producto);
	}
}
