package Innlevering;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB5 {

	public static void main(String[] args) {
		
	for (int i = 0; i<2; i++) {
		
				String poengtxt = showInputDialog("Skiv inn din poengsum: ");
				int poeng = parseInt(poengtxt);
			
			if((poeng <= 39) && (poeng > 0))
				showMessageDialog(null, "Poengsummen: " + poeng + "\nTilsvarer Karakteren: F");
			
			if((poeng <= 49) && (poeng >= 40))
				showMessageDialog(null, "Poengsummen: " + poeng + "\nTilsvarer Karakteren: E");

			if((poeng <= 59) && (poeng >= 50))
				showMessageDialog(null, "Poengsummen: " + poeng + "\nTilsvarer Karakteren: D");

			if((poeng <= 79) && (poeng >= 60))
				showMessageDialog(null, "Poengsummen: " + poeng + "\nTilsvarer Karakteren: C");

			if((poeng <= 89) && (poeng >= 80))
				showMessageDialog(null, "Poengsummen: " + poeng + "\nTilsvarer Karakteren: B");

			if((poeng <= 100) && (poeng >= 90))
				showMessageDialog(null, "Poengsummen: " + poeng + "\nTilsvarer Karakteren: A");
			
			if (poeng < 0 || poeng > 100)
				i--;
			showMessageDialog(null, "Error: Skriv en gyldig Poengsum");
			
				
				
	}
	}
	

}
