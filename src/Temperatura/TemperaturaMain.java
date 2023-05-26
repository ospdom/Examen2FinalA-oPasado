package Temperatura;

public class TemperaturaMain {

	public static void main(String[] args) {

		String[] dias = new String[7];

		dias[0] = "Lunes";
		dias[1] = "Martes";
		dias[2] = "Miercoles";
		dias[3] = "Jueves";
		dias[4] = "Viernes";
		dias[5] = "Sabado";
		dias[6] = "Domingo";

		double[] grados = { 20, 21, 14, 0, 30, 6, -1 };

		int i = 0;
		double media = 0, fa = 0, mediaFinal = 0;

		while (i < grados.length) {
			media = media + grados[i];
			i++;
		}
		mediaFinal = (media / 7);
		System.out.println("Media C: " + mediaFinal);
		fa = (mediaFinal * 1.8 + 32);
		System.out.println("Media F: " + fa);

		// Encontrar el día más caluroso
		double maxTemperatura = grados[0];
		int diaMaxTemperatura = 0;

		for (int j = 1; j < grados.length; j++) {
			if (grados[j] > maxTemperatura) {
				maxTemperatura = grados[j];
				diaMaxTemperatura = j;
			}
		}
		System.out.println("Día más caluroso: " + dias[diaMaxTemperatura]);
		System.out.println("Temperatura del día más caluroso: " + maxTemperatura);

		// Encontrar el día más frío
		double minTemperatura = grados[0];
		int indiceMinTemperatura = 0;

		for (int k = 1; k < grados.length; k++) {
			if (grados[k] < minTemperatura) {
				minTemperatura = grados[k];
				indiceMinTemperatura = k;
			}
		}
		System.out.println("Día más frío: " + dias[indiceMinTemperatura]);
		System.out.println("Temperatura del día más frío: " + minTemperatura);

		// Encontrar los días más calurosos en relación a la media
		System.out.println("Días más calurosos en relación a la media:");
		for (int l = 0; l < grados.length; l++) {
			if (grados[l] > mediaFinal) {
				System.out.println(dias[l] + ": " + grados[l]);
			}
		}

		// Encontrar los días más fríos en relación a la media
		System.out.println("Días más fríos en relación a la media:");
		for (int m = 0; m < grados.length; m++) {
			if (grados[m] < mediaFinal) {
				System.out.println(dias[m] + ": " + grados[m]);
			}
		}
	}

}
