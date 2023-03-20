package casosupuestojuanquerol;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SupermercadoMainJuanQuerol {
	public static Scanner src = new Scanner(System.in);
	public static void main(String[] args) {
		Supermercado s1 = new Supermercado();
		Carrito miCarrito = new Carrito();
		Cliente pepe = new Cliente("Pepe", "Gonzalez", "Pepe Gonzalez", 1000.0, miCarrito);
		int numMenu = 0;
		int numMenu2 = 0;
		//creo una lista de los productos que estan a la venta.
		
		/*creo un menu fucional que cuando escribes  
		*el numero de la opcion te lleva a la funcion de esa opcion*/
		
		//menu persona
		System.out.println("  ***********MENÚ*******");
		System.out.println(" ");
		System.out.println("1. Personal");
		System.out.println("2. Cliente");
		numMenu = src.nextInt();
		if (numMenu == 1) {
			contraseña(numMenu2, s1);
		} else if(numMenu==2){
			Clientes(numMenu2, s1, pepe);
		}else {
			System.out.println("Error");
		}
		
		
		
		
	}
	public static void contraseña( int numMenu2, Supermercado s1) {
		String clave = "";
		int cont =0;
		while(cont != 3 || !clave.equals(s1.getContraseña())) {
			
			System.out.println("Escriba la contraseña:");
			cont++;
			clave = src.nextLine();
			if (cont == 2 && cont ==3) {
				System.out.println("cotraseña incorecta intentelo de nuevo.");
			}
			
	}
	if (clave.equals(s1.getContraseña())) {
		Personal(numMenu2,s1);	
	}else {
		System.out.println("Error acceso denegado intentelo mas tar");
	}
	
}
	/*este es el menu que le aparece a un personal de la tienda
	 * y lo que pueden hacer es modificar  añadir o sar productos
	 * que estan a la venta y al darle a la opcion salir se termina el programa*/
	public static void Personal( int numMenu2, Supermercado s1) {
		
		numMenu2 = 0;
		while (numMenu2 <=4 && numMenu2 >=0){
			imprimirMenuPersonal();
			numMenu2 = src.nextInt();
			if (numMenu2 ==1) {
				System.out.println("Estos son los productos que estan a la venta:" );
				MostrarProducto(s1);
			}else if(numMenu2==2){
				System.out.println("Escribe el nombre del productos");
				String nombre=src.nextLine();
				System.out.println("Escribe el precio del productos");
				int precio = src.nextInt();
				System.out.println("Escribe el stock del productos");
				int stock = src.nextInt();
				s1.AñadirProducto(nombre, numMenu2, Secciones.FRUTERIA, stock);
			}else if(numMenu2==3){
				System.out.println("Escribe el nombre del productos");
				String nombre=src.nextLine();
				System.out.println("Escribe el precio del productos");
				int precio = src.nextInt();
				s1.ModificarProducto(nombre, precio);
			}else if(numMenu2==4){
				System.out.println("Escribe el nombre del productos");
				String nombre=src.nextLine();
				s1.EliminarProducto(nombre);
			}else if(numMenu2==5){
				System.out.println("Has terminado la primera parte");
			}else {
				System.out.println("Error. No existe esa opcion");
			}
			
		} 
		
	}
	public static void MostrarProducto(Supermercado s1){
			
			for (int i = 0; i < s1.Tamaño(); i++) {
				System.out.println("Articulo: " + s1.getProductos(i).getNombre()
				+"Precio: "+s1.getProductos(i).getPrecio()+"Seccion: "+s1.getProductos(i).getSeccion());
			}
			
		
	}
	//cuando le das a modificar  lo que hace es sacar un producto por otro
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
	/*este es el menu que le aparece a un cliente 
	 * y lo que puede hacer es modificar  ,añadir o sacar productos
	 * que estan en su carrito y al darle a la opcion salir se termina el programa*/
	public static void Clientes (int numMenu2, Supermercado s1, Cliente pepe) {
		numMenu2=0;
		while (numMenu2 >=0 && numMenu2<=5){
			imprimirMenu();
			numMenu2 = src.nextInt();
			if (numMenu2==1) {
				System.out.println("Estos son los productos que estan a la venta:" );
				MostrarProducto(s1);
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
