package casosupuesto;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SupermercadoMain {
	public static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int numMenu = 0;
		String[]arrayComida = {"tomate","lechuga","patata","leche","aceite",
				"pan","vino","queso","yogurt","jamón","manzana",
				"harina","melocoton","arroz","esparragos","lubina","merluza","cacahuetes","zanahoria","huevos"};
		TreeSet<String> productoVenta = new TreeSet<>();
		productoVenta.addAll(Arrays.asList(arrayComida));
		TreeSet<String>productoCarrito = new TreeSet<>();
		
		do {
			imprimirMenu();
			numMenu = src.nextInt();
			switch(numMenu) {
			case 1:
				System.out.println("Estos son los productos que estan a la venta:" );
				System.out.println(productoVenta);
			case 2:
				rellenarCarrito(productoCarrito,productoVenta);
			case 3:
				System.out.println("Estos son los productos que tienes en el carrito:" );
				System.out.println(productoCarrito);
			case 4:
				consultaCarrito(productoCarrito);
			case 5:
				cambioProducto(productoCarrito,productoVenta);
			case 6:
				System.out.println("has terminado la primera parte");
			default:
				System.out.println("Error. No existe esa opcion");
			}
		} while (numMenu >=5 && numMenu <=1);
	}
	public static void cambioProducto(TreeSet<String> productoCarrito,TreeSet<String> productoVenta) {
		System.out.println("Escribe producto que quieres sustituir  en el carrito");
		String ProductoCambio = src.nextLine();
				System.out.println("Escribe producto que quires cambiar en el carrito");
		String ProductoSacado = src.nextLine();
		if (productoVenta.contains(ProductoCambio)) {
			if (productoCarrito.contains(ProductoSacado)) {
				productoCarrito.remove(ProductoSacado);
				productoCarrito.add(ProductoCambio);
				System.out.println("cambio finalizado corectamente.");
			}
			else {
				System.out.println("Error. quieres sacar un producto que no esta en el carrito");
			}
		}
		else {
			System.out.println("Error. quieres meter un producto que no esta a la venta al carrito");
		}
	}
	public static void consultaCarrito(TreeSet<String> productoCarrito) {
		System.out.println("Ecribe producto que quieras cosultar:");
		String PalabraConsulta = src.nextLine();
		if (productoCarrito.contains(PalabraConsulta)) {
			System.out.println("El producto " + PalabraConsulta + " está en el carrito");
		}
		else {
			System.out.println("El producto " + PalabraConsulta + " no está en el carrito");
		}
	}
	public static void rellenarCarrito( TreeSet<String> productoCarrito, TreeSet<String> productoVenta) {
		String eleccion = src.nextLine();
		String arrayEleccion[] = eleccion.split(" ");
		productoCarrito.addAll(Arrays.asList(arrayEleccion));
		productoCarrito.retainAll(productoCarrito);
	}
	public static void imprimirMenu() {
		System.out.println("  ***********MENÚ*******");
		System.out.println(" ");
		System.out.println("1. Mostrar productos del supermercado");
		System.out.println("2. Añadir productos al carrito");
		System.out.println("3. Mostrar carrito de la compra ordenado");
		System.out.println("4. Consultar producto de carrito");
		System.out.println("5. Cambiar un producto por otro");
		System.out.println("6. salir");
	}
}
