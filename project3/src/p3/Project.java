package p3;

import java.util.Arrays;
import java.util.Scanner;

public class Project {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner t =new Scanner(System.in);
		float[] tab1 = new float[15];
		float[] tab2 = new float[5];
		float[] tab3 = new float[5];
		float suma=0;
	    float diferenta;
		
		System.out.println("Introduceti cele 15 numere: ");
		for(int i = 0; i<15; i++)
		{
			tab1[i]=t.nextFloat();
			
		}
		
		for( int i =0; i<15; i+=2)	
		{
				suma += tab1[i];
				
		}
		diferenta=tab1[1];
		for( int i=3; i<15; i+=2)
		{
			  diferenta -= tab1[i];
		}
		
		System.out.println("Suma indexilor pari =" +suma);
		System.out.println("Diferenta indexilor impari este: " +diferenta);
		
	   int contor=0;
	   System.out.println("Elemente nule: ");
       for( int i=0; i<15; i++)
       {
    	   if( tab1[i] == 0)
    	   {
    		   
    		   System.out.print(i+", ");
    		   contor++;
    	   }
       }
       if(contor != 0 )
       {
       System.out.println(" - " +contor +" elemente.");
       }
       else 
       {
    	System.out.println("Nu exista elemente nule!");
       }
       contor=0;
       for( int i=0; i<15; i++)
       {
    	   if( tab1[i] == 0)
    	   {    
    		   contor +=1;
    		   for( int j=i; j<15-contor; j++)
    			  tab1[j]=tab1[j+1];
    	   }
       }
       System.out.println("Tabloul dupa eliminarea elementelor nule: " +(15-contor));
       for( int i=0; i<15-contor; i++)
       {
    	   System.out.print(tab1[i]+", ");
       }
       
       float produs=1;
       for( int i=0; i<15-contor; i++)
       {
    	  produs *= tab1[i];
       }
       System.out.println("Produsul= " +produs);
       
       
       Arrays.fill(tab2, -1);
       
       for( int i =0; i<3; i++)
       {
    	   tab2[4-i]=tab1[i];
    	   
       }
       System.out.println("Elementele tabloului 2: ");
       for(int i=0; i<5; i++)
       {
    	   System.out.print(tab2[i] + ", ");
       }
       
       Arrays.sort(tab2);
       System.out.println("Tablou 2 sortat: ");
       for(int i=0; i<5; i++)
       {
    	   System.out.print(tab2[i] + ", ");
       }
       
       
       
       System.out.println("\nIntroduceti cele 5 numere: ");
		for(int i = 0; i<5; i++)
		{
			tab3[i]=t.nextFloat(); 
			
		}
       contor=0;
		for(int i = 0; i<5; i++)
		{
			if(tab3[i] == tab2[i])
			{
				contor++;
			}
			
		}
		System.out.println("Numarul de elemente comune tab2 si tab3:  " +contor);
	}

}
