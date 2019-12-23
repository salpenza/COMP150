public class Conversion{
     public static void main(String[] args) { 

        double constant = 1.75;
        int rackUnits[] = new int[3];
        rackUnits[0] = 10;
        rackUnits[1] = 50;
        rackUnits[2] = 100;
        
        for(int i = 0; i<rackUnits.length; i++)
        System.out.println(rackUnits[i] * constant);
    
    }
}