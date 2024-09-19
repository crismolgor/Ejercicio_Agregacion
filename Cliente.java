package ClaseAgregracion;

public class Cliente {
	private int codigo;
	private String nombre;
	//Variable agregacion 
	private Tarjeta tarjeta;
	// Variable Composicion}
	private Vendedor vendedor;
	public Cliente() {
		vendedor = new Vendedor();
	}
	
	public Cliente(int codigo, String nombre, Tarjeta tarjeta, Vendedor vendedor) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.tarjeta = tarjeta;
		//aplicacion de composicion 
		vendedor = new Vendedor();
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Tarjeta getTarjeta() { //aplicacion de la agregacion 
		return tarjeta;
	}
	public void setTarjeta(Tarjeta tarjeta) {
		this.tarjeta = tarjeta;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", tarjeta=" + tarjeta + ", vendedor=" + vendedor
				+ "]";
	}

	
	
}
