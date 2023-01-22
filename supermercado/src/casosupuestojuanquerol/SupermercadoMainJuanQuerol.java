package casosupuestojuanquerol;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SupermercadoMainJuanQuerol {
	public static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		int numMenu = 0;
		int numMenu2 = 0;
		String[]arrayComida = {"tomate","lechuga","patata","leche","aceite",
				"pan","vino","queso","yogurt","jamón","manzana",
				"harina","melocoton","arroz","esparragos","lubina","merluza","cacahuetes","zanahoria","huevos"};
		TreeSet<String> productoVenta = new TreeSet<>();
		productoVenta.addAll(Arrays.asList(arrayComida));
		TreeSet<String>productoCarrito = new TreeSet<>();
		System.out.println("  ***********MENÚ*******");
		System.out.println(" ");
		System.out.println("1. Personal");
		System.out.println("2. Cliente");
		numMenu = src.nextInt();
		if (numMenu == 1) {
			contraseña(productoVenta,productoCarrito,numMenu2);
		} else if(numMenu==2){
			Cliente(productoVenta,productoCarrito,numMenu2);
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}
	public static void contraseña(TreeSet<String> productoVenta, TreeSet<String> productoCarrito, int numMenu2) {
		String clave = "";
		int cont =0;
		while(cont != 3 || !clave.equals("J4v4d0n4")) {
			
			System.out.println("Escriba la contraseña:");
			cont++;
			clave = src.nextLine();
			if (cont == 2 && cont ==3) {
				System.out.println("cotraseña incorecta intentelo de nuevo.");
			}
			
	}
	if (clave.equals("J4v4d0n4")) {
		Personal(productoVenta,productoCarrito,numMenu2);	
	}else {
		System.out.println("Error acceso denegado intentelo mas tar");
	}
	
}
	public static void Personal(TreeSet<String> productoVenta, TreeSet<String> productoCarrito, int numMenu2) {
		
		numMenu2 = 0;
		while (numMenu2 <=4 && numMenu2 >=0){
			imprimirMenuPersonal();
			numMenu2 = src.nextInt();
			if (numMenu2 ==1) {
				System.out.println("Estos son los productos que estan a la venta:" );
				System.out.println(productoVenta);
			}else if(numMenu2==2){
				productoVenta.add(src.nextLine());
			}else if(numMenu2==3){
				productoVenta.remove(src.nextLine());
			}else if(numMenu2==4){
				
			}else if(numMenu2==5){
				System.out.println("Has terminado la primera parte");
			}else {
				System.out.println("Error. No existe esa opcion");
			}
			
		} 
		
	}
	public static void ModificarProducto(TreeSet<String> productoCarrito,TreeSet<String> productoVenta) {
		System.out.println("Escribe producto que quires Modificar en el carrito");
		String ProductoSacado = src.nextLine();
		System.out.println("Escribe producto que quieres sustituir  en el carrito");
		String ProductoCambio = src.nextLine();
		
		if (productoVenta.contains(ProductoCambio)) {
			productoVenta.remove(ProductoSacado);
			productoVenta.add(ProductoCambio);
			System.out.println("cambio finalizado corectamente.");
		}else {
			System.out.println("el producto no esta");
		}
	}
	public static void Cliente (TreeSet<String> productoVenta, TreeSet<String> productoCarrito, int numMenu2) {
		numMenu2=0;
		while (numMenu2 >=0 && numMenu2<=5){
			imprimirMenu();
			numMenu2 = src.nextInt();
			if (numMenu2==1) {
				System.out.println("Estos son los productos que estan a la venta:" );
				System.out.println(productoVenta);
			}else if(numMenu2==2) {
				rellenarCarrito(productoCarrito,productoVenta);
			}else if(numMenu2==3) {
				System.out.println("Estos son los productos que tienes en el carrito:" );
				System.out.println(productoCarrito);
			}else if(numMenu2==4) {
				consultaCarrito(productoCarrito);
			}else if(numMenu2==5) {
				cambioProducto(productoCarrito,productoVenta);
			}else if(numMenu2==6) {
				System.out.println("Has terminado la primera parte");
			}else {
				System.out.println("Error. No existe esa opcion");
			}
			
		} 
	}
	public static void imprimirMenuPersonal() {
		System.out.println("  ***********MENÚ*******");
		System.out.println(" ");
		System.out.println("1. Mostrar productos del supermercado");
		System.out.println("2. Añadir productos");
		System.out.println("3. Eliminar producto");
		System.out.println("4. Modificar producto");
		System.out.println("5. salir");
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
