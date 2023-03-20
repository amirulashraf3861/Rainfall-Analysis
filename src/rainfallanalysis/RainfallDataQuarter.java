
package rainfallanalysis;

public class RainfallDataQuarter 
{
     public static int Q_read, Total_read , Avg_year, Avg_all, Max_read;
     
     public int setQ_read( int newQ_read){
         Q_read = newQ_read;
         return Q_read;
     }

public  int setAvg_year ( int d){
        Avg_year = d/4;
    return Avg_year;
     }

public int setTotal_read (int newTotal_read){
        Total_read = newTotal_read;
        return Total_read;
}

public int setAvg_all(int f, int g){
        Avg_all = f/g;
        return Avg_all;
}

public int setMax_read(int newMax_read){
         Max_read = newMax_read;
         return Max_read;
}
    
}


