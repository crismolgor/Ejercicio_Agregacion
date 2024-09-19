package ClaseAgregracion;

public class Tarjeta {
	private int codigo;
	private double limite;
	
	public Tarjeta() {
		
	}
	public Tarjeta(int codigo, double limite) {
		super();
		this.codigo = codigo;
		this.limite = limite;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public double getLimite() {
		return limite;
	}
	public void setLimite(double limite) {
		this.limite = limite;
	}
	@Override
	public String toString() {
		return "Tarjeta [codigo=" + codigo + ", limite=" + limite + "]";
	}
	
}
