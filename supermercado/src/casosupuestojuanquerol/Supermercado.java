package casosupuestojuanquerol;

import java.util.ArrayList;

public class Supermercado {
	private ArrayList<Producto>productos;
	private ArrayList<Cliente>clientes;
	private String contraseña;
	
	
	
	
	
	public Supermercado() {
		this.contraseña = "J4v4d0n4";
		this.productos = productosIniciales();
	}
	public int Tamaño(){
		
		return productos.size();
		
	}
	
	public Producto getProductos(int i) {
		return productos.get(i);
	}
	public String getNombreProductos(int i) {
		return productos.get(i).getNombre();
	}

	public String getContraseña() {
		return contraseña;
	}
	public void setClientes(Cliente cliente) {
		clientes.add(cliente);
	}
public void EliminarProducto(String nombre) {
		
		for (int i = 0; i < productos.size(); i++) {
			if(productos.get(i).getNombre().contains(nombre)) {
				productos.remove(i);
			}
		}
		
	}
public void ModificarProducto(String nombre, double precio) {
		
	for (int i = 0; i < productos.size(); i++) {
		if(productos.get(i).getNombre().contains(nombre)) {
			productos.get(i).setPrecio(precio);
		}
	}
		
	}
	public void AñadirProducto(String nombre, double precio,Secciones seccion, int stock) {
		
		productos.add(new Producto(nombre, precio, seccion, stock));
		
	}
	public ArrayList<Producto> productosIniciales(){
		productos=new ArrayList<>();
		Producto p1 = new Producto("Leche", 3.5, Secciones.LACTEOS, 40);
		Producto p2 = new Producto("Patatas", 5, Secciones.FRUTERIA, 10);
		Producto p3 = new Producto("Queso", 1, Secciones.LACTEOS, 3);
		Producto p4 = new Producto("Platano de Canarias", 7, Secciones.FRUTERIA, 90);
		Producto p5 = new Producto("Manzana", 5, Secciones.FRUTERIA, 20);
		Producto p6 = new Producto("ternera", 1.5, Secciones.CARNICERIA, 40);
		Producto p7 = new Producto("Lubina", 10, Secciones.PESCADERIA, 66);
		Producto p8 = new Producto("Pasta de dientes", 2,Secciones.HOGAR, 25);
		Producto p9 = new Producto("Lavadora", 50, Secciones.HOGAR, 9);
		Producto p10 = new Producto("Lechuga", 10000, Secciones.FRUTERIA,);
		Producto p11 = new Producto("Alitas de pollo", 5, Secciones.CARNICERIA, 30);
		Producto p12 = new Producto("Naranja", 3.5, Secciones.FRUTERIA, 13);
		Producto p13 = new Producto("Pulpo", 20, Secciones.PESCADERIA,50);
		Producto p14 = new Producto("Gambas", 5, Secciones.PESCADERIA, 90);
		Producto p15 = new Producto("Atun", 1.5, Secciones.PESCADERIA, 22);
		Producto p16 = new Producto("Coca-Cola", 4, Secciones.BEBIDAS, 11);
		Producto p17 = new Producto("Zanahoria", 2.5, Secciones.FRUTERIA, 666);
		Producto p18 = new Producto("Jamon", 3.5, Secciones.CARNICERIA, 40);
		Producto p19 = new Producto("Yogurt", 4, Secciones.LACTEOS, 77);
		Producto p20 = new Producto("Aceite", 5.5, Secciones.BEBIDAS, 66);
		productos.add(p1);
		productos.add(p2);
		productos.add(p3);
		productos.add(p4);
		productos.add(p5);
		productos.add(p6);
		productos.add(p7);
		productos.add(p8);
		productos.add(p9);
		productos.add(p10);
		productos.add(p11);
		productos.add(p12);
		productos.add(p13);
		productos.add(p14);
		productos.add(p15);
		productos.add(p16);
		productos.add(p17);
		productos.add(p18);
		productos.add(p19);
		productos.add(p20);
		return productos;
		
	}
	
	
	
	
	
}
