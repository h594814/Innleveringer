package Innlevering;
import static java.lang.Math.*;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class OppgaveB4 {

	public static void main(String[] args) {
		
		String inntektønn = showInputDialog("Tast inn bruttoinntekt");
		
		double inntekt = parseInt(inntektønn);
		double sats1 = 0.0093;
		double sats2 = 0.0241;
		double sats3 = 0.1152;
		double sats4 = 0.1452;
		
		
				
				if((inntekt <= 164101) && (inntekt > 0)){
					showMessageDialog(null, "Du har ingen trinnskatt.");
				}
				
				else if ((inntekt >= 164101) && (inntekt <= 230950)) {
					showMessageDialog(null, "Trinnskatt = " + (inntekt*sats1));
				}
				
				else if ((inntekt >= 230951) && (inntekt <= 580650)) {
					showMessageDialog(null, "Trinnskatt = " + (inntekt*sats2));
				}
				
				else if ((inntekt >= 580651) && (inntekt <= 934050)) {
					showMessageDialog(null, "Trinnskatt = " + (inntekt*sats3));
				}
				
				else if ((inntekt >= 934051)) {
					showMessageDialog(null, "Trinnskatt = " + (inntekt*sats4));
				}
				
				else  {
					showMessageDialog(null, "Error: Tast inn en gyldig sum.");
					
				}
			}
			
			
		
		
		
		
		
		
		
		
		
	

}
