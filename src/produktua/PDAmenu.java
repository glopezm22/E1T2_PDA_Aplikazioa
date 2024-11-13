package produktua;

import java.util.Scanner;

public class PDAmenu {
	
	private static Scanner sc = new Scanner(System.in);

	public static void menua() {
		boolean intDa = false;

		while (!intDa) {
			System.out.println("=== HASIERAKO MENUA ===\n 1. Langileak\n 2. Bezeroak\n 3. Saioa itxi");
			String menua = sc.nextLine();

			try {
				int zbk = Integer.parseInt(menua);
				switch (zbk) {
				case 1:
					menuLangileak();
					intDa = true;
					break;
				case 2:
					menuBezeroak();
					intDa = true;
					break;
				case 3:
					PDAfuntzionalitateak.saioaItxi();
					intDa = true;
					break;
				default:
					System.out.println("Sartu behar duzu 1-3 arteko aukera bat.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Hori ez da zenbaki bat. Saiatu berriz.");
			}
		}

	}

	public static void menuLangileak() {
		boolean intDa = false;

		while (!intDa) {
			System.out.println(
					"=== LANGILEAK ===\n 1. Kontsultatu informazioa\n 2. Nagusien langile-zerrenda\n 3. Atzera joan");
			String aukera = sc.nextLine();

			try {
				int zbk = Integer.parseInt(aukera);
				switch (zbk) {
				case 1:
					PDAfuntzionalitateak.kontsultaLangile();
					intDa = true;
					break;
				case 2:
					PDAfuntzionalitateak.erlazioakLangileNagusi();
					intDa = true;
					break;
				case 3:
					PDAfuntzionalitateak.atzeraJoan();
					intDa = true;
					break;
				default:
					System.out.println("Sartu behar duzu 1-3 arteko aukera bat.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Hori ez da zenbaki bat. Saiatu berriz.");
			}
		}

	}

	public static void menuBezeroak() {
		boolean intDa = false;

		while (!intDa) {
			System.out.println("=== BEZEROAK ===\n 1. Kontaktuak kontsultatu\n 2. Fakturak sortu\n 3. Atzera joan");
			String aukera = sc.nextLine();

			try {
				int zbk = Integer.parseInt(aukera);
				switch (zbk) {
				case 1:
					PDAfuntzionalitateak.kontsultaBezero();
					intDa = true;
					break;
				case 2:
					PDAfuntzionalitateak.fakturaSortu();
					intDa = true;
					break;
				case 3:
					PDAfuntzionalitateak.atzeraJoan();
					intDa = true;
					break;
				default:
					System.out.println("Sartu behar duzu 1-3 arteko aukera bat.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Hori ez da zenbaki bat. Saiatu berriz.");
			}
		}

	}
}
