//Program 12_05: using the Math class

import java.util.*
        
public class Prog12_05{
        public static void main ( String args []){
            double sphereVolume, rad;
            
            Scanner cin= new Scanner (System.in);
            
            System.out.print ("Enter the radius of the sphere:");
            
            rad = cin.nextDouble();
            
            sphereVolume = 4 * Math.Pi * Math.pow ( rad, 3)
        }
}