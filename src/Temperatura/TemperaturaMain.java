package Temperatura;

public class TemperaturaMain {

	public static void main(String[] args) {

		    String[] dias = { "Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo" };
		    double[] grados = { 20, 21, 14, 0, 30, 6, -1 };
		    double mediaFinal = 0;

		    for (double temperatura : grados) {
		        mediaFinal += temperatura;
		    }
		    mediaFinal /= grados.length;

		    double maxTemperatura = grados[0];
		    int diaMaxTemperatura = 0;
		    double minTemperatura = grados[0];
		    int diaMinTemperatura = 0;

		    for (int i = 1; i < grados.length; i++) {
		        if (grados[i] > maxTemperatura) {
		            maxTemperatura = grados[i];
		            diaMaxTemperatura = i;
		        }
		        if (grados[i] < minTemperatura) {
		            minTemperatura = grados[i];
		            diaMinTemperatura = i;
		        }
		    }

		    System.out.println("Media C: " + mediaFinal);
		    double fa = mediaFinal * 1.8 + 32;
		    System.out.println("Media F: " + fa);
		    System.out.println("Día más caluroso: " + dias[diaMaxTemperatura]);
		    System.out.println("Temperatura del día más caluroso: " + maxTemperatura);
		    System.out.println("Día más frío: " + dias[diaMinTemperatura]);
		    System.out.println("Temperatura del día más frío: " + minTemperatura);

		    System.out.println("Días más calurosos en relación a la media:");
		    for (int i = 0; i < grados.length; i++) {
		        if (grados[i] > mediaFinal) {
		            System.out.println(dias[i] + ": " + grados[i]);
		        }
		    }

		    System.out.println("Días más fríos en relación a la media:");
		    for (int i = 0; i < grados.length; i++) {
		        if (grados[i] < mediaFinal) {
		            System.out.println(dias[i] + ": " + grados[i]);
		        }
		    }
		}
}

