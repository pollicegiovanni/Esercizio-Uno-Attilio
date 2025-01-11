import java.util.Scanner;
public class Avvio 
{
	public static void main(String[] args) {
		
		Scanner input = new Scanner (System.in);
		Funzione fz = new Funzione();
		String risposta = "si";
		
		while (risposta.equals("si"))
		{		
			System.out.println("1) STAMPA TUTTI I NUMERI PARI INFERIORI O UGUALI A N");
			System.out.println("2) SCEGLI 3 NUMERI E STAMPA IL MAGGIORE");
			System.out.println("3) EXIT");
			System.out.print("Scelta: ");
			int scelta = Integer.parseInt(input.nextLine());
			
				if (scelta==1)
				{
					System.out.print("Inserisci un valore per il calcolo: ");
					int n = Integer.parseInt(input.nextLine());
					fz.printOddNumbers(n);		
				}
				else if (scelta==2)
				{
					System.out.print("Inserisci primo numero: ");
					int a = Integer.parseInt(input.nextLine());
					System.out.print("Inserisci secondo numero: ");
					int b = Integer.parseInt(input.nextLine());
					System.out.print("Inserisci terzo numero: ");
					int c = Integer.parseInt(input.nextLine());
					fz.printMax(a, b, c);
				}
				else if (scelta==3)
				{
					break;
				}
				else if (scelta>3 || scelta<1)
				{
					System.out.println("Scelta non valida. Riprova.");
				}
		
		System.out.println();
		System.out.print("Vuoi continuare: si/no --->");
		risposta = input.nextLine();
		}	
	System.out.println("Grazie per aver usato il mio fantastico programma");
	}
}
