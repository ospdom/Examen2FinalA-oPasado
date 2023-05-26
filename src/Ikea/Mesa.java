package Ikea;

import java.util.Scanner;

public class Mesa extends Producto {
	
	private String forma;

	public Mesa() {
		super();
		this.forma = "";
	}
	public Mesa(Mesa m) {
		super();
		this.forma = m.forma;
	}
	public Mesa(int cod, String nombre, int stock, String color, double precio, String forma) {
		super(cod,nombre,stock,color,precio);
		this.forma = forma;
	}

	public String getForma() {
		return forma;
	}
	public void setForma(String forma) {
		this.forma = forma;
	}
	
	@Override
	public String toString() {
		return "Mesa:" + super.toString() + " [forma=" + forma + "]";
	}
	@Override
	public void leer(Scanner sc) {
		System.out.println("Ingresa el Nombre de la Mesa: ");
		this.nombre = sc.next();
		sc.next();

		System.out.println("Ingresa el Stock de la Mesa: ");
		this.stock = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Ingresa el Color de la Mesa: ");
		this.color = sc.next();
		
		System.out.println("Ingresa el Precio de la Mesa: ");
		this.precio = sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Ingresa la Forma de la Mesa: ");
		sc.next();
		
	}

}
