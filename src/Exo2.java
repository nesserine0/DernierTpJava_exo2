import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//scanner that reads an input from the user
		Scanner scanner=new Scanner(System.in);
		
		DecimalFormatSymbols decimalFormatSymbols = new DecimalFormatSymbols(Locale.FRANCE);
		decimalFormatSymbols.setDecimalSeparator(',');
		decimalFormatSymbols.setGroupingSeparator(' ');

		String formatPattern1 = "#,##0.##";
		DecimalFormat df2 = new DecimalFormat(formatPattern1, decimalFormatSymbols);
		
		
		System.out.println("Entrez le Prix hors Taxe : \n");
		
		//read the value 
		double ht=scanner.nextDouble();
		
		scanner.close();
		
		//TTC = HT + HT * t / 100  t=20
		
		System.out.println("\n\n**************************\n\n");
		System.out.println("Prix Hors Taxe : "+df2.format(ht)+"\n");
		System.out.println("TVA : 20% \n");
		System.out.println("Prix TTC: "+df2.format(ht+(ht*0.2))+"\n");

		
			
	}

}
