package casosupuestojuanquerol;

public class Cliente {
	private String nombre;
	private String apellidos;
	private String nombreCompleto;
	private double saldo;
	private Carrito carrito;
	
	public Cliente(String nombre, String apellidos, String nombreCompleto, double saldo, Carrito carrito) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.nombreCompleto = nombreCompleto;
		this.saldo = saldo;
		this.carrito=carrito;
	}
	
	public Carrito getCarrito() {
		return carrito;
	}

	public void setCarrito(Carrito carrito) {
		this.carrito = carrito;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void restaSaldo(Producto producto) {
		this.saldo= this.saldo-carrito.precioTotal();
	}
}
