package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;

public class OppgaveO2 {

	public static void main(String[] args) {

		for(int i=1; i<=1;i++) {//Legger det i en loop slik at det enkelt er mulig å endre til å kjøre flere ganger
			String sumlonn= showInputDialog("Skriv inn brutto inntekt");
			double lonn= Double.parseDouble(sumlonn);//Henter info fra brukeren og gjør om til tall/desimaltall
			
			//Trinnskatten til alle trinnene 
			double trinnskatt1=0.017;
			double trinnskatt2=0.04;
			double trinnskatt3=0.136;
			double trinnskatt4=0.166;
			double trinnskatt5=0.176;
			double sum1=(292850-208050)*trinnskatt1;
			double sum2=(670000-292850)*trinnskatt2+sum1;
			double sum3=(937900-670000)*trinnskatt3+sum2;
			double sum4=(1350000-937900)*trinnskatt4+sum3;
			double sum5=0;
			//Bruker double for å kunne benytte desimaltall
		    if (lonn>=208051 && lonn<=292850) {
		    	double total1=lonn-208050; //Lager en variabael for lønnen vi skal regne trinnskatt av
		    	double trinn1=total1*trinnskatt1; //Finner ut av hva trinnskatten blir for det trinnet
		    	sum1=trinn1; //Lager variabel for total trinnskatt
		      System.out.println("Din lønn er: "+lonn+"\n"+"Du er på lønnstrinn 1 \nDin trinnskatt er: "+sum1);
		    }
		    else if (lonn>=292851 && lonn<=670000) {//Gjør det samme som alle andre else setningene som er beskrevet ovenfor
		    	double total2=lonn-292850;
		    	double trinn2=total2*trinnskatt2;
		    	sum2=sum1+trinn2;
		      System.out.println("Din lønn er: "+lonn+"\n"+"Du er på lønnstrinn 2 \nDin trinnskatt er: "+sum2);
		    }
		    else if (lonn>=670001 && lonn<=937900) {//Gjør det samme som alle andre else setningene som er beskrevet ovenfor
		    	double total3=lonn-670000;
		    	double trinn3=total3*trinnskatt3;
		    	sum3=sum2+trinn3;
			      System.out.println("Din lønn er: "+lonn+"\n"+"Du er på lønnstrinn 3 \nDin trinnskatt er: "+sum3);
			    }
		    else if (lonn>=937901 && lonn<=1350000) {//Gjør det samme som alle andre else setningene som er beskrevet ovenfor
		    	double total4=lonn-937900;
		    	double trinn4=total4*trinnskatt4;
		    	sum4=sum3+trinn4;
			      System.out.println("Din lønn er: "+lonn+"\n"+"Du er på lønnstrinn 4 \nDin trinnskatt er: "+sum4);
			    }
		    else if (lonn>=1350001) { //Gjør det samme som alle andre else setningene som er beskrevet ovenfor
		    	double total5=lonn-1350000;
		    	double trinn5=total5*trinnskatt5;
		    	sum5=sum4+trinn5;
			      System.out.println("Din lønn er: "+lonn+"\n"+"Du er på lønnstrinn 5 \nDin trinnskatt er: "+sum5);
			    }		
		    else if (lonn<=208050 && lonn>=0) { //Lager en output hvis du tjener mindre enn grenseverdien
			      System.out.println("Du slipper trinnskatt");
			    }
		    
		    else {//Siste output blir jo hvis noen skriver negative tall
		    	System.out.println("Ugyldig, negativ inntekt");
		    }
		  }
		
		
	}

}
