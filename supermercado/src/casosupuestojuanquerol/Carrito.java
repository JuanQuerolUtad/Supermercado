package casosupuestojuanquerol;

import java.util.ArrayList;

public class Carrito {
	
	private ArrayList<Producto> productos;
	
	public void añadirCarrito(String nombre) {
		Supermercado s1 = new Supermercado();
		for (int i = 0; i < s1.Tamaño(); i++) {
			if (s1.getNombreProductos(i).contains(nombre)) {
				productos.add(new Producto(s1.getProductos(i).getNombre(), s1.getProductos(i).getPrecio(), s1.getProductos(i).getSeccion()));
			}
		}
	}
	public boolean consultarProducto (String nombre) {
		
		int cont = 0;
		for (int i = 0; i < productos.size(); i++) {
			if (nombre.equalsIgnoreCase(productos.get(i).getNombre())) {
				cont++;
			}
		}
		return cont>0;
	}
	
	public double precioTotal() {
		double precio = 0;
		for (int i = 0; i < productos.size(); i++) {
			precio = precio+productos.get(i).getPrecio();
		}
		return precio;
		
	}
}
