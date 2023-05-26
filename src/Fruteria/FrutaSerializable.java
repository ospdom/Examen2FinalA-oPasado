package Fruteria;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class FrutaSerializable {

	public static void main(String[] args) {

	    ArrayList<Fruta> aFrutas = new ArrayList<>();

	    aFrutas.add(new Fruta(1, "Manzana"));
	    aFrutas.add(new Fruta(2, "Pera"));
	    aFrutas.add(new Fruta(3, "Sandía"));

	    try {
	        FileOutputStream fos = new FileOutputStream("frutas.dat");
	        ObjectOutputStream oos = new ObjectOutputStream(fos);

	        for (Fruta f : aFrutas) {
	            oos.writeObject(f);
	            System.out.println(f);
	        }

	        oos.close();
	        fos.close();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
    }
}