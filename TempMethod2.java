package tempmethod2;

import java.util.Scanner;

public class TempMethod2 {
    
    double Ctemp = 0;
    double Ftemp = 0;
    double Ktemp = 0;
        
     void getTemperature(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj temperaturę: ");
        Ctemp = scan.nextDouble();
        
        if (Ctemp > 0)
        
        {
            System.out.println("Twoja temperatura to: " +  Ctemp + "." + " " + "Temperatura jest dodatnia."); 
        }
        
        else if (Ctemp < 0)

        {
            System.out.println("Twoja temperatura to: " + Ctemp + "." + " " + "Temperatura jest ujemna.");
        }
        
        else 
        {
            System.out.println("Twoja temperatura to: " + Ctemp + "." + " " + "Temperatura wynosi 0.");
        }
    }
     
     void getFahrenheitTemp(){
         Ftemp = (Ctemp * 1.8) + 32;
         
         System.out.println("Temperatura w Fahrenheit wynosi: " + Ftemp);
         
     }
     
     void getKelvinTemp(){
         
         Ktemp = Ctemp - 273.15;
         
         System.out.println("Temperatura w Kalvinach wynosi: " + Ktemp);
         
     }
     
     public double getDecimalTemperature(){
         
         return 5/9 * Ftemp - 32;
     }
    
        public static void main(String[] args) {
        
        TempMethod2 t = new TempMethod2();
        
        t.getTemperature();
        t.getFahrenheitTemp();
        t.getKelvinTemp();

    }
}
