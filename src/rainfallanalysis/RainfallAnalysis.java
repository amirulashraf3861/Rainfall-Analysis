// Assignment 1 Object-Oriented Programming
// Developed by amirulashraf3861

package rainfallanalysis;

import java.util.Scanner; //import scanner

public class RainfallAnalysis {

    public static void main(String[] args) {
        
        int i=0, j=0, f=0;                                                          // Declare some variable
        int [ ][ ] u = new int[5][4];                                             // Declare a 2D array
        int [ ][ ] k = new int [5][4];
        int [] a = new int [5];                                                   // Declare a array
        
        RainfallDataQuarter s = new RainfallDataQuarter();     // Declare an object 
        Scanner input = new Scanner(System.in);                      // Declare scanner as an object
        
        //Reading data from user
       for(i=0; i<5 ; i++){
           
           System.out.println("*************************************************************");
           
        for( j=0; j<4; j++)
        {
           
            System.out.print("What is reading for ");
            System.out.print(j+1);
            System.out.print(" quarter in year ");
            System.out.print(i+1);
            System.out.print(" for rainfall, in inches?\n");
            int sQ_read = input.nextInt();
            u[i][j] = sQ_read;                                                          //Save scanned value into array
            k[i][j] = sQ_read;
            a[i] += u[i][j];                                                                //array a's function is to  contain sum all the reading for each year
            
            
        }
        
        // By Year addition
            System.out.println(" ");            
       }
            System.out.println("*************************************************************");
            System.out.println(" ");
          
          // Compute maximum reading
         for (i=0; i<5; i++){
             for (j=0; j<4; j++){
                 
                 if ( k[0][0] < k[i][j]){
                     k[0][0] = k[i][j];
                     s.setMax_read(k[0][0]);
                 }
             }
         }
            
            System.out.println(" ");
            System.out.println("RainfallAnalysis : ");
        
// To print average reading of each year
       for(i=0; i<5; i++){
           
           System.out.print("-Year ");
           System.out.print(i+1);
           System.out.print("'s total reading for rainfall,in inches is : ");  //To tell sum of each year
           System.out.print( a[i]);
           System.out.print(", Average reading for year ");
           System.out.print(i+1);
           System.out.print(", in inches is " + s.setAvg_year(a[i]) + "\n"); 
           f += a[i] ;  // To sum up all the reading
       }
       
            System.out.println(" ");
            System.out.println("****************************************");
            System.out.println(" ");
            System.out.println("Aditional info :");
            
       // To print average for overall 5 years reading for each quarter
            System.out.println("-Average reading for each year,in inches is : " + s.setAvg_all(f, i) );
            System.out.println("-Max reading in 5 years is " + s.setMax_read(k[0][0]));
            System.out.println(" ");
            System.out.println("*************************************************************");
       }
       }
    
   
    
