package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class OppgaveO3 {

	public static void main(String[] args) {
int f = 1;
int n;


		String inputN= showInputDialog("Skriv inn et tall du ønsker å regne fakultet av");
		int i= Integer.parseInt(inputN);
		

while (i > 0) {
 n=i;
 f=f*n;
    i--;
  }  
showMessageDialog(null,f);
	}
	    
	

}


