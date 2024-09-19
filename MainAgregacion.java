package ClaseAgregracion;

public class MainAgregacion {
	private Cliente cliente;
	
	public MainAgregacion() {
		this.cliente= new Cliente();
	}
	public void cargar() {
		cliente.setCodigo(1152408);
		cliente.setNombre("Cristian");
		//cargar correspondiente a la agregacion 
		Tarjeta tarjeta= new Tarjeta();
		tarjeta.setCodigo(2);
		tarjeta.setLimite(2D);
		cliente.setTarjeta(tarjeta);
		
		//carga correspondiente a la composicion
		cliente.getVendedor().setCodigo(5);
		cliente.getVendedor().setNombre("Carlos");
	}
	public void imprimir () {
		System.out.println(cliente.toString());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainAgregacion a = new MainAgregacion();
		a.cargar();
		a.imprimir();
	}

}
