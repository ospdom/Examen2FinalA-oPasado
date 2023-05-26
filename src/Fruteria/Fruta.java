package Fruteria;

import java.io.Serializable;
import java.util.Objects;
import java.util.Scanner;

public class Fruta implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 9076523075603768689L;
	private int cod;
	private String nombre;

	public Fruta() {
		this.cod = 0;
		this.nombre = "";
	}
	public Fruta(Fruta f) {
		this.cod = f.cod;
		this.nombre = f.nombre;
	}
	public Fruta(int cod, String nombre) {
		this.cod = cod;
		this.nombre = nombre;
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
	@Override
	public int hashCode() {
		return Objects.hash(cod, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Fruta other = (Fruta) obj;
		return cod == other.cod && Objects.equals(nombre, other.nombre);
	}
	@Override
	public String toString() {
		return "Fruta [cod=" + cod + ", nombre=" + nombre + "]";
	}
	
	public void print() {
		
		System.out.println("----------------- Datos de la Fruta ");
		System.out.println("Código:" + this.cod);
		System.out.println("Nombre:" + this.nombre);	
		System.out.println("-----------------");
		
	}

	public void read(Scanner sc) {

		System.out.println("Ingresa el Nombre de la Fruta: ");
		this.nombre = sc.next();

	}

}


