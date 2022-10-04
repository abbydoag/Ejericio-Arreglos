package gui;

public class Carro implements Comparable {

		private int año;
		private String nombre;
		private String marca;
		
		public Carro (int año, String nombre, String marca) {
			setAño(año);
			setNombre(nombre);
			setMarca(marca);
		}
		
		public int getAño() {
			return año;
		}
		public void setAño(int año) {
			this.año = año;
		}
		
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String getMarca() {
			return marca;
		}
		public void setMarca(String marca) {
			this.marca = marca;
		}
		
		public String toString() {
			return "Carro: "+getNombre()+"Año:"+getAño()+"Marca: "+getMarca();
		}
	

	@Override
	public int compareTo(Object o) {
		Carro Carrito = (Carro)o;
		if (this.getAño() < Carrito.getAño()) {
			return 1;
		} 
		else if (this.getAño()> Carrito.getAño()) {
			return -1;
		}
		else {
			int resultado = this.getNombre().compareTo(Carrito.getNombre());
			if (resultado == 0) {
				this.getMarca().compareTo(Carrito.getMarca()); 
				}
			return resultado;
			}
		}
			
}
