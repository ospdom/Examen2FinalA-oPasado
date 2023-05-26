package Fruteria;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FruteriaMain {

	public static void main(String[] args) {

		ArrayList<Fruta> aFrutas = new ArrayList<Fruta>();
		Fruta f = new Fruta();

		boolean modificadof = false;
		int posicion;
		int parar = 0;

		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis = new FileInputStream("frutas.dat");
			ois = new ObjectInputStream(fis);
			while (fis.available() > 0) {
				f = (Fruta) ois.readObject();
				aFrutas.add(f);
//				f.print();
			}
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		Scanner sc = new Scanner(System.in);

		int opcion = 0;
		do {

			System.out.println("Por favor seleccione una opción: ");
			System.out.println("0. Salir ");
			System.out.println("1. Visualizar Frutas ");
			System.out.println("2. Añadir Fruta ");
			System.out.println("3. Eliminar Fruta");

			opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				if (aFrutas.isEmpty()) {
					System.out.println("No hay frutas disponibles.");
				} else {
					for (posicion = 0; posicion < aFrutas.size(); posicion++) {
						aFrutas.get(posicion).print();
					}
				}
				break;
			case 2:
				parar = 1;
				System.out.println("Añadir Fruta: ");
				System.out.println("------------------------------");

				do {
					Fruta f2 = new Fruta();
					f2.read(sc);

					boolean frutaExistente = false;
					for (Fruta fruta : aFrutas) {
						if (fruta.getNombre().equalsIgnoreCase(f2.getNombre())) {
							frutaExistente = true;
							break;
						}
					}

					if (frutaExistente) {
						System.out.println("La fruta ya existe.");
					} else {

						int nuevoCodigo = aFrutas.size() + 1;
						f2.setCod(nuevoCodigo);

						aFrutas.add(f2);
						System.out.println("La fruta ha sido añadida correctamente.");
						modificadof = true;
					}

					System.out.println("Pulsa 0 para parar o pulsa 1 para seguir añadiendo frutas: ");
					parar = sc.nextInt();
				} while (parar != 0);
				break;
			case 3:
				String nomEliminar = "";
				boolean frutaEliminar = false;

				for (posicion = 0; posicion < aFrutas.size(); posicion++) {
					aFrutas.get(posicion).print();
				}

				System.out.println("Ingresa el Nombre de la Fruta que quieres eliminar");
				nomEliminar = sc.next();

				Fruta frutaEliminada = null;
				for (posicion = 0; posicion < aFrutas.size(); posicion++) {
					Fruta fruta = aFrutas.get(posicion);
					if (fruta.getNombre().equalsIgnoreCase(nomEliminar)) {
						frutaEliminada = fruta;
						frutaEliminar = true;
						aFrutas.remove(posicion);
						System.out.println("La Fruta ha sido eliminada correctamente.");
						modificadof = true;
						break;
					}
				}

				if (!frutaEliminar) {
					System.out.println("Fruta no encontrada, intente de nuevo.");
				}

				if (frutaEliminada != null) {
					int nuevaPosicion = posicion; 
					for (int i = 0; i < aFrutas.size(); i++) {
						Fruta fruta = aFrutas.get(i);
						if (i == nuevaPosicion) {
							System.out.println("Se ha modificado el código de la fruta: " + fruta.getNombre());
						}
						fruta.setCod(i + 1);
					}
				}
				break;
			case 0:
				System.out.println("Hasta pronto!");
				break;
			default:
				System.out.println("Opción no válida.");
			}

		} while (opcion != 0);
		sc.close();
		System.out.println("Fin del programa");
		if (modificadof) {
			try {
				FileOutputStream fos = new FileOutputStream("frutas.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos);

				for (Fruta f1 : aFrutas) {
					oos.writeObject(f1);
				}
				System.out.println("La información del fichero ha sido actualizada");
				oos.close();
				fos.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
}
