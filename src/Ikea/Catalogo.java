package Ikea;

import java.util.ArrayList;

public class Catalogo {

	ArrayList<Producto> lista;
	
	

	public Catalogo() {
		this.lista = new ArrayList<Producto>();
	}

	public ArrayList<Producto> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Producto> lista) {
		this.lista = lista;
	}

	public void fillData() {

		lista.add(new Mesa(1, "lack", 5, "negro", 100, "redonda"));
		lista.add(new Mesa(2, "top", 4, "rojo", 101, "redonda"));
		lista.add(new Mesa(3, "studio", 3, "verde", 99, "cuadrada"));
		lista.add(new Mesa(4, "super", 2, "blanco", 40, "cuadrada"));
		lista.add(new Mesa(5, "elegance", 0, "amarillo", 349, "redonda"));
		lista.add(new Cortina(1, "cocina", 5, "blanco", 33, "algodon"));
		lista.add(new Cortina(2, "habitacion", 100, "blanco", 466, "algodon"));
		lista.add(new Cortina(3, "servicio", 0, "blanco", 77, "algodon"));
		lista.add(new Cortina(4, "dormitorio", 4, "blanco", 55, "algodon"));
		lista.add(new Cortina(5, "outdoor", 5, "blanco", 100, "algodon"));

	}

	// Dado el nombre de un producto, devuelve su posición dentro del Arraylist. Si
		// no existe devuelve -1.
	public int posicionProducto(String nombre) {
		for(int i = 0; i<lista.size(); i++) {
			if(lista.get(i).nombre.equals(nombre)) {
				return i;
			}
		}
		return -1;
	};

	// Lista en pantalla los productos con stock positivo.
	public void stockPositivo() {
	    for (Producto producto : lista) {
	        if (producto.getStock() > 0) {
	            System.out.println(producto);
	        }
	    }
	}
}

