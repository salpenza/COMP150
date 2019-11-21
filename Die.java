import java.util.Random;
public class Die{
    static int numberOfSides = 6;

    public Die(){

    }

    public Die(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int getNumberOfSides(){
        return numberOfSides;
    }

    public void setNumberOfSides(int numberOfSides){
        this.numberOfSides = numberOfSides;
    }

    public int roll(){       
        Random rand = new Random();
        int rollIt = 1 + rand.nextInt(numberOfSides);
        return rollIt;
        
    }
    public static void main(String[] args) {
        Die test = new Die(6);
        System.out.println(test.roll());
    }
}
