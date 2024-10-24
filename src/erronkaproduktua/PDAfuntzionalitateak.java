package erronkaproduktua;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PDAfuntzionalitateak {

	private static Scanner sc = new Scanner(System.in);

	public static void kontsultaLangile() {
		System.out.print("Sartu langilearen kodea: ");
		String kodeaBilatu = sc.nextLine();
		boolean aurkituta = false;
		try {
			FileReader fr = new FileReader("src/erronkaproduktua/fitxategiak/LANGILE.txt");
			BufferedReader br = new BufferedReader(fr);
			String lerroa;
			lerroa = br.readLine();
			while (lerroa != null) {
				String[] lerroZatiak = lerroa.split("	");
				String kodea = lerroZatiak[0];
				if (kodea.equals(kodeaBilatu)) {
					String izena = lerroZatiak[1];
					String abizena = lerroZatiak[2];
//					String emaila = lerroZatiak[3];
					String telefonoa = lerroZatiak[4];
					String kontratazio_data = lerroZatiak[5];

					System.out.println("Izena: " + izena);
					System.out.println("Abizena: " + abizena);
//					System.out.println("Emaila: " + emaila);
					System.out.println("Telefonoa: " + telefonoa);
					System.out.println("Kontratazio data: " + kontratazio_data);
					aurkituta = true;
					break;
				}

				lerroa = br.readLine();
			}

			if (!aurkituta) {
				System.out.println("Ez da aurkitu langilerik hurrengo kodearekin: " + kodeaBilatu);
			}

			br.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("Errorea: fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: fitxategia irakurtzean arazoa.");
		}
		System.out.println("Langileen menura itzultzen...");
		PDAmenu.menuLangileak();
	}

	public static void erlazioakLangileNagusi() {
		System.out.println("Sartu nagusiaren kodea:");
		int nagusiKodea = sc.nextInt();
		System.out.println("Langileen zerrenda:");
		System.out.println("1. Iñigo Cabacas, RRPP, i.cbcs@gmail.com");
		System.out.println("2. Aitor Zabaleta, RRHH, a.zabaleta@gmail.com");
	}

	public static void kontsultaBezero() {
		System.out.print("Sartu bezeroaren kodea: ");
		String kodeaBilatu = sc.nextLine();
		boolean aurkituta = false;
		try {
			FileReader fr1 = new FileReader("src/erronkaproduktua/fitxategiak/BEZERO.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			FileReader fr2 = new FileReader("src/erronkaproduktua/fitxategiak/BEZERO_TELEFONO.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			String lerroa1, lerroa2;
			lerroa1 = br1.readLine();
			lerroa2 = br2.readLine();
			while (lerroa1 != null) {
				String[] lerroZatiak = lerroa1.split("	");
				String kodea = lerroZatiak[0];
				if (kodea.equals(kodeaBilatu)) {
					String izena = lerroZatiak[1];
					String abizena = lerroZatiak[2];
//					String helbidea = lerroZatiak[3];
					String emaila = lerroZatiak[4];

					System.out.println("Izena: " + izena);
					System.out.println("Abizena: " + abizena);
//					System.out.println("Helbidea: " + helbidea);
					System.out.println("Emaila: " + emaila);
					aurkituta = true;
					break;
				}

				lerroa1 = br1.readLine();
			}

			while (lerroa2 != null) {
				String[] lerroZatiak = lerroa2.split("	");
				String kodea = lerroZatiak[1];
				if (kodea.equals(kodeaBilatu)) {
					String telefonoa = lerroZatiak[2];

					System.out.println("Telefonoa: " + telefonoa);
					aurkituta = true;
					break;
				}

				lerroa2 = br2.readLine();
			}

			if (!aurkituta) {
				System.out.println("Ez da aurkitu bezerorik hurrengo kodearekin: " + kodeaBilatu);
			}

			br1.close();
			fr1.close();

			br2.close();
			fr2.close();

		} catch (FileNotFoundException e) {
			System.out.println("Errorea: fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: fitxategia irakurtzean arazoa.");
		}
		System.out.println("Bezeroen menura itzultzen...");
		PDAmenu.menuBezeroak();
	}

	public static void fakturaSortu() {
		System.out.print("Sartu eskariaren kodea: ");
		String kodeaBilatu = sc.nextLine();
		boolean aurkituta = false;
		try {
			FileReader fr1 = new FileReader("src/erronkaproduktua/fitxategiak/ESKARI.txt");
			BufferedReader br1 = new BufferedReader(fr1);
			FileReader fr2 = new FileReader("src/erronkaproduktua/fitxategiak/ESKARI_LERRO.txt");
			BufferedReader br2 = new BufferedReader(fr2);
			FileReader fr3 = new FileReader("src/erronkaproduktua/fitxategiak/BEZERO.txt");
			BufferedReader br3 = new BufferedReader(fr3);
			String lerroa1, lerroa2, lerroa3;
			lerroa1 = br1.readLine();
			lerroa2 = br2.readLine();
			lerroa3 = br3.readLine();
			while (lerroa3 != null) {
				String[] lerroZatiak = lerroa3.split("	");
				String kodea = lerroZatiak[0];
				if (kodea.equals(kodeaBilatu)) {
					String izena = lerroZatiak[1];
					String abizena = lerroZatiak[2];
					
					System.out.println("Bezeroa: " + izena + abizena);
					aurkituta = true;
					break;
				}

				lerroa3 = br3.readLine();
			}
			
			while (lerroa1 != null) {
				String[] lerroZatiak = lerroa1.split("	");
				String kodea = lerroZatiak[0];
				if (kodea.equals(kodeaBilatu)) {
					String bezeroId = lerroZatiak[1];
					String egoeraId = lerroZatiak[2];
					String eskaera_data = lerroZatiak[3];
					aurkituta = true;
					break;
				}

				lerroa1 = br1.readLine();
			}
			
			while (lerroa2 != null) {
				String[] lerroZatiak = lerroa2.split("	");
				String kodea = lerroZatiak[0];
				if (kodea.equals(kodeaBilatu)) {
					String lerroId = lerroZatiak[1];
					String produktuId = lerroZatiak[2];
					String kopurua = lerroZatiak[3];
					String salmenta = lerroZatiak[4];
					aurkituta = true;
					break;
				}

				lerroa2 = br2.readLine();
			}

			if (!aurkituta) {
				System.out.println("Ez da aurkitu eskaririk hurrengo kodearekin: " + kodeaBilatu);
			}

			br1.close();
			fr1.close();
			
			br2.close();
			fr2.close();
			
			br3.close();
			fr3.close();

			FileWriter fw = new FileWriter("faktura_" + "kodea" + ".txt");
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write("#" + "kodea" + " eskariaren faktura");
			bw.write("Ordaintzeko guztira: " + "totala" + "€");
			bw.close();
			System.out.println("Faktura fitxategian gordeta.");
		} catch (FileNotFoundException e) {
			System.out.println("Errorea: fitxategia ezin da aurkitu.");
		} catch (IOException e) {
			System.out.println("Errorea: fitxategia irakurtzean arazoa.");
		}
		System.out.println("Bezeroen menura itzultzen...");
		PDAmenu.menuBezeroak();
	}


	public static void fitxategienMenua() {
		System.out.println("Fitxategien menua bistaratzen");
		System.out.println("- LANGILE.txt");
		System.out.println("- BEZERO.txt");
		System.out.println("- BEZERO_TELEFONO.txt");
		System.out.println("- ESKARI.txt");
		System.out.println("- ESKARI_LERRO.txt");
	}
	
	public static void atzeraJoan() {
		PDAmenu.menua();
	}

	public static void saioaItxi() {
		System.out.println("=== SAIOA ITXI ===\nSaioa itxi nahi duzu? (Bai/Ez)");
		String erantzuna = sc.nextLine().toLowerCase();
		if (erantzuna.equals("bai")) {
			System.out.println("Saioa itxita.");
		} else {
			System.out.println("Hasierako menura itzultzen...");
			PDAmenu.menua();
		}
	}

}
