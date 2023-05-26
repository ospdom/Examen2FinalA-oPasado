package Ikea;

import java.util.Scanner;

public class Cortina extends Producto {
		
		private String tela;

		public Cortina() {
			super();
			this.tela = "";
		}
		public Cortina(Cortina c) {
			super();
			this.tela = c.tela;
		}
		public Cortina(int cod, String nombre, int stock, String color, double precio, String tela) {
			super(cod,nombre,stock,color,precio);
			this.tela = tela;
		}

		public String getTela() {
			return tela;
		}
		public void setTela(String tela) {
			this.tela = tela;
		}
		
		@Override
		public String toString() {
			return "Cortina:" + super.toString() + " [tela=" + tela + "]";
		}
		@Override
		public void leer(Scanner sc) {
			System.out.println("Ingresa el Nombre de la Cortina: ");
			this.nombre = sc.next();
			sc.next();

			System.out.println("Ingresa el Stock de la Cortina: ");
			this.stock = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Ingresa el Color de la Cortina: ");
			this.color = sc.next();
			
			System.out.println("Ingresa el Precio de la Cortina: ");
			this.precio = sc.nextDouble();
			sc.nextLine();
			
			System.out.println("Ingresa la Tela de la Cortina: ");
			sc.next();
			
		}

	}
