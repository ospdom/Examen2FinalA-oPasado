package Ikea;

import java.util.ArrayList;
import java.util.Scanner;

public class IkeaMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Catalogo catalogo = new Catalogo();

		ArrayList<String> compra = new ArrayList<String>();

		catalogo.fillData();

		int opcion = 0, cantidad = 0;
		double precio = 0, precioFinal = 0;
		String producto;

		do {
			opcion = 1;

			catalogo.stockPositivo();

			boolean productoEncontrado = false;
			while (!productoEncontrado) {
				System.out.println("Qué producto quieres comprar?: ");
				producto = sc.next();

				Producto posicionProducto = null;
				for (Producto p : catalogo.getLista()) {
					if (p.getNombre().equalsIgnoreCase(producto)) {
						productoEncontrado = true;
						posicionProducto = p;
					}

				}
				if (!productoEncontrado) {
					System.out.println("Ese producto no existe, intentelo nuevamente");
				} else {
					System.out.println("Qué cantidad quieres comprar?: ");
					cantidad = sc.nextInt();

					if (posicionProducto.getStock() < cantidad) {
						System.out.println("No puedes comprar esa cantidad, el Stock actual de este producto es: "
								+ posicionProducto.getStock());
					} else {
						precio = posicionProducto.getPrecio() * cantidad;
						precioFinal = precioFinal + precio;
						compra.add(posicionProducto.getNombre());

						System.out.println("Quieres realizar más compras? \n SI = 1 \n NO = 0 ");
						opcion = sc.nextInt();
						if (opcion == 0) {
							System.out.println(compra);
							System.out.println("El precio de tu compra es: " + precioFinal);
						}
					}
				}
			}

		} while (opcion != 0);
	}
}
