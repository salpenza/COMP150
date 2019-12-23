import java.util.Scanner;

public class AdventureTime {
    private Plane plane;

    public AdventureTime() {
        plane = new Plane();
    }

    public AdventureTime(String name) {
        plane = new Plane(name);
    }

    public void displayPlane() {
        System.out.println(plane);
    }

    public void setDirection(Plane.Direction direction) {
        plane.setDirection(direction);
    }

    public void act() {
        plane.act();
    }

    public static void main(String [] args) {
        System.out.println(",.~'`'~.,.~'`'~.,.~'`'~.,.~'`'~.,.~'`'~..~'`'~.");
        System.out.println("Welcome to the amazing world of Adventure Time!!");
        System.out.println("One of the greatest games in active development.");
        System.out.println(",.~'`'~.,.~'`'~.,.~'`'~.,.~'`'~.,.~'`'~..~'`'~.");
        System.out.println("");
        System.out.println("Say, I used to be an adventurer like you... then I took an arrow in the knee.");
        System.out.print("What is your name? ");
        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        // Create a new instance of the game.
        AdventureTime at = new AdventureTime(name);

        int menu;
        for(;;) {
            // Displays the map
            at.displayPlane();

            System.out.println("Choose your destiny, adventurer.");
            System.out.println("\t1 - North");
            System.out.println("\t2 - South");
            System.out.println("\t3 - East");
            System.out.println("\t4 - West");
            System.out.println("\t5 - Over adventuring.");
            System.out.println("What shall it be? [1-5] ");
            menu = scan.nextInt();
            switch(menu) {
                case 1:
                // Look at what field is changed by this method
                at.setDirection(Plane.Direction.NORTH);
                break;
                case 2:
                at.setDirection(Plane.Direction.SOUTH);
                break;
                case 3:
                at.setDirection(Plane.Direction.EAST);
                break;
                case 4:
                at.setDirection(Plane.Direction.WEST);
                break;
                case 5:
                System.out.println("Would you like to save?");
                System.out.println("Hmm not implemented yet... Farewell adventurer.");
                break;
            }
            // quit if 5 is selected
            if(menu == 5) break;

            // Tell the Plane to act on all the Pieces
            at.act();
        }
    }
}