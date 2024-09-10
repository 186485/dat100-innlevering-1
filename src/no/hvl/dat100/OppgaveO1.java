package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO1 {

	public static void main(String[] args) {

		for(int i=1; i<=10;i++) {
			String sumkarakter= showInputDialog("Skriv inn summen din");
			int karakter= Integer.parseInt(sumkarakter);
			
		    if (karakter>=90 && karakter<=100) {
		      System.out.println("A");
		    }
		    else if (karakter>=80 && karakter<=89) {
		      System.out.println("b");
		    }
		    else if (karakter>=60 && karakter<=79) {
			      System.out.println("c");
			    }
		    
		    else if (karakter>=50 && karakter<=59) {
			      System.out.println("d");
			    }
		    
		    else if (karakter>=40 && karakter<=49) {
			      System.out.println("e");
			    }
		    
		    else if (karakter>=0 && karakter<=39) {
			      System.out.println("f");
			    }
		    
		    else {
		    	i--;
		    	System.out.println("Svaret ditt er ikke gyldig, prøv på nytt");
		    }
		  }
		
		
	}

}
