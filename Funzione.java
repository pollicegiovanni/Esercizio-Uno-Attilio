
public class Funzione {
	
	void printOddNumbers (int n)
	{
		while (n>0)
		{
			if (n % 2 == 0)
			{
				System.out.print(n + " ");
			}
		n--;
		}
	}
	
	void printMax (int a, int b, int c)
	{
		if (a>b && a>c)
		{
			System.out.println("Il numero " + a + " è maggiore di " + b + " e " + c);
		}
		else if (b>a && b>c)
		{
			System.out.println("Il numero " + b + " è maggiore di " + a + " e " + c);
		}
		else if (c>a && c>b)
		{
			System.out.println("Il numero " + c + " è maggiore di " + a + " e " + b);
		}
		else if (a==b && c>a)
		{
			System.out.println("Il numero " + c + " è maggiore di " + a + " e " + b);
		}
		else if (a==c && b>c)
		{
			System.out.println("Il numero " + b + " è maggiore di " + a + " e " + c);
		}
		else if (b==c && a>b)
		{
			System.out.println("Il numero " + a + " è maggiore di " + b + " e " + c);
		}
		else if (a==b && c<a)
		{
			System.out.println("I numeri " + a + " e " + b + " sono maggiori di " + c);
		}
		else if (a==c && b<c)
		{
			System.out.println("I numeri " + a + " e " + c + " sono maggiori di " + b);
		}
		else if (b==c && a<b)
		{
			System.out.println("I numeri " + b + " e " + c + " sono maggiori di " + a);
		}
		else
		{
			System.out.println("I numeri " + a + "," + b + "," + c + " sono uguali");
		}
	}

}
