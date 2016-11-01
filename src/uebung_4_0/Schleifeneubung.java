package uebung_4_0;

public class Schleifeneubung {

	public static void main(String[] args) {
		int maximum = 19;
		int summe = 0;
		
		for (int a = 1; a <=maximum; a++ )
		{
			System.out.print(summe+" + "+a+"=");
			summe=summe+a;
			
			System.out.print(summe);
			System.out.println("");
		}

	}

}
