package erronkaproduktua;

import java.util.Scanner;

public class PDAmenu {

	private static Scanner sc = new Scanner(System.in);

	public static void menua() {

		System.out.println("=== HASIERAKO MENUA ===\n 1. Langileak\n 2. Bezeroak\n 3. Kontsultak\n 4. Saioa itxi");
		int menua = sc.nextInt();

		switch (menua) {
		case 1:
			menuLangileak();
			break;
		case 2:
			menuBezeroak();
			break;
		case 3:
			PDAfuntzionalitateak.fitxategienMenua();
			break;
		case 4:
			PDAfuntzionalitateak.saioaItxi();
			break;
		default:
			System.out.println("Sartu behar duzu 1-4 arteko aukera bat.");
			break;
		}

	}

	public static void menuLangileak() {
		System.out.println(
				"=== LANGILEAK ===\n 1. Kontsultatu informazioa\n 2. Nagusien langile-zerrenda\n 3. Atzera joan");
		int aukera = sc.nextInt();
		switch (aukera) {
		case 1:
			PDAfuntzionalitateak.kontsultaLangile();
			break;
		case 2:
			PDAfuntzionalitateak.erlazioakLangileNagusi();
			break;
		case 3:
			PDAfuntzionalitateak.atzeraJoan();
			break;
		default:
			System.out.println("Sartu behar duzu 1-3 arteko aukera bat.");
		}
	}

	public static void menuBezeroak() {
		System.out.println("=== BEZEROAK ===\n 1. Kontaktuak kontsultatu\n 2. Fakturak sortu\n 3. Atzera joan");
		int aukera = sc.nextInt();
		switch (aukera) {
		case 1:
			PDAfuntzionalitateak.kontsultaBezero();
			break;
		case 2:
			PDAfuntzionalitateak.fakturaSortu();
			break;
		case 3:
			PDAfuntzionalitateak.atzeraJoan();
			break;
		default:
			System.out.println("Sartu behar duzu 1-3 arteko aukera bat.");
		}
	}

}
