package Ikea;

import java.util.Objects;
import java.util.Scanner;

public abstract class Producto {

	protected int cod;
	protected String nombre;
	protected int stock;
	protected String color;
	protected double precio;

	public Producto() {
		this.cod = 0;
		this.nombre = "";
		this.stock = 0;
		this.color = "";
		this.precio = 0;
	}

	public Producto(Producto p) {
		this.cod = p.cod;
		this.nombre = p.nombre;
		this.stock = p.stock;
		this.color = p.color;
		this.precio = p.precio;
	}

	public Producto(int cod, String nombre, int stock, String color, double precio) {
		this.cod = cod;
		this.nombre = nombre;
		this.stock = stock;
		this.color = color;
		this.precio = precio;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cod, color, nombre, precio, stock);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return cod == other.cod && Objects.equals(color, other.color) && Objects.equals(nombre, other.nombre)
				&& Double.doubleToLongBits(precio) == Double.doubleToLongBits(other.precio) && stock == other.stock;
	}

	@Override
	public String toString() {
		return "Producto [cod=" + cod + ", nombre=" + nombre + ", stock=" + stock + ", color=" + color + ", precio="
				+ precio + "]";
	}

	public abstract void leer(Scanner sc);

}
