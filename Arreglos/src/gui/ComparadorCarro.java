package gui;

public class ComparadorCarro <T> implements Comparable<T> {

	public int compare(T o1, T o2) {
		Carro carro1=(Carro)o1;
		Carro carro2=(Carro)o2;
		if (carro1.getAño() > carro2.getAño()) {
			return 1;
		}
		else if (carro1.getAño() < carro2.getAño()) {
			return -1;
		}
		else {
			int resultado = carro1.getNombre().compareTo(carro2.getNombre());
			if (resultado == 0) {
				int resultado2=carro1.getMarca().compareTo(carro2.getMarca());
				return resultado2;
			}
			else {
				return 0;
			}
		}
		
	}
}
