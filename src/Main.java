import garage.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Garage g = new Garage();
		
		int input;
		Scanner in = new Scanner(System.in);
		
		// variabili in comune
		int annoImmatricolazione, cilindrata, postoAssegnato;
		String marca, tipoAlimentazione;
		
		do
		{
			System.out.println("MENU GARAGE PUBBLICO");
			System.out.println("1 - inserimento automobile");
			System.out.println("2 - inserimento moto");
			System.out.println("3 - inserimento furgone");
			System.out.println("4 - libera un posto");
			System.out.println("5 - visualizza situazione dei posti");
			System.out.println("0 - esci dal programma");
			
			System.out.print("> digitare un comando: ");
			input = in.nextInt();
			
			in.nextLine();
			
			switch(input)
			{
				case 1:
					// inserimento automobile
					System.out.print("Inserire anno di immatricolazione: ");
					annoImmatricolazione = in.nextInt();
					in.nextLine();
					System.out.print("Inserire marca: ");
					marca = in.nextLine();
					System.out.print("Inserire tipo di alimentazione: ");
					tipoAlimentazione = in.nextLine();
					System.out.print("Inserire cilindrata del motore: ");
					cilindrata = in.nextInt();
					
					int numeroPorte;
					System.out.print("Inserire numero di porte: ");
					numeroPorte = in.nextInt();
					
					Automobile a = new Automobile (annoImmatricolazione, marca, tipoAlimentazione, cilindrata, numeroPorte);
					postoAssegnato = g.immettiNuovoVeicolo(a);
					
					if (postoAssegnato == -1)
						System.out.println("Garage pieno - impossibile inserire l'automobile.");
					else
						System.out.println("Automobile inserita nel posto " + postoAssegnato);
					
					break;
				case 2:
					// inserimento moto;
					System.out.print("Inserire anno di immatricolazione: ");
					annoImmatricolazione = in.nextInt();
					in.nextLine();
					System.out.print("Inserire marca: ");
					marca = in.nextLine();
					System.out.print("Inserire tipo di alimentazione: ");
					tipoAlimentazione = in.nextLine();
					System.out.print("Inserire cilindrata del motore: ");
					cilindrata = in.nextInt();
					
					int numeroTempiMotore;
					String tipologia;
					System.out.print("Inserire numero di tempi del motore: ");
					numeroTempiMotore = in.nextInt();
					in.nextLine();
					System.out.print("Inserire la tipologia: ");
					tipologia = in.nextLine();
					
					Motocicletta m = new Motocicletta (annoImmatricolazione, marca, tipoAlimentazione, cilindrata, tipologia, numeroTempiMotore);
					postoAssegnato = g.immettiNuovoVeicolo(m);
					
					if (postoAssegnato == -1)
						System.out.println("Garage pieno - impossibile inserire la motocicletta.");
					else
						System.out.println("Motocicletta inserita nel posto " + postoAssegnato);
					
					break;
				case 3:
					// inserimento furgone;
					System.out.print("Inserire anno di immatricolazione: ");
					annoImmatricolazione = in.nextInt();
					in.nextLine();
					System.out.print("Inserire marca: ");
					marca = in.nextLine();
					System.out.print("Inserire tipo di alimentazione: ");
					tipoAlimentazione = in.nextLine();
					System.out.print("Inserire cilindrata del motore: ");
					cilindrata = in.nextInt();
					
					int capacitaCarico;
					System.out.print("Inserire capacita' di carico: ");
					capacitaCarico = in.nextInt();
					
					Furgone f = new Furgone (annoImmatricolazione, marca, tipoAlimentazione, cilindrata, capacitaCarico);
					postoAssegnato = g.immettiNuovoVeicolo(f);
					
					if (postoAssegnato == -1)
						System.out.println("Garage pieno - impossibile inserire il furgone.");
					else
						System.out.println("Furgone inserito nel posto " + postoAssegnato);
					
					break;
				case 4:
					// libera un posto
					int postoDaLiberare;
					System.out.print("Inserire il posto da liberare: ");
					postoDaLiberare = in.nextInt();
					
					VeicoloAMotore oggettoLiberato = g.estraiVeicolo(postoDaLiberare);
					if (oggettoLiberato == null)
						System.out.println("Nessun oggetto e' stato liberato nel posto " + postoDaLiberare);
					else
						System.out.println("Oggetto liberato al posto " + postoDaLiberare + ":\n" + oggettoLiberato.toString());
					
					break;
				case 5:
					// visualizza situazione dei posti
					System.out.println(g.stampaSituazionePosti());
					break;
			}
		} while (input != 0);
	}

}
