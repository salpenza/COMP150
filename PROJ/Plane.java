import java.util.Random;

public class Plane {
    public enum Direction
    {
        NORTH, SOUTH, EAST, WEST
    };

    private Piece[][] plane;
    private int height;
    private int width;

    private Adventurer adventurer;
    private Direction chosenDirection;
    private int sloths;
    private int sneks;

    private Random random = new Random();

    private static final int DEFAULT_HEIGHT = 20;
    private static final int DEFAULT_WIDTH = 20;
    private static final int DEFAULT_SNEAKY_SNEKS = 10;
    private static final int DEFAULT_SLOTHS = 10;
    private static final int DEFAULT_LOGS = 20;
    private static final String DEFAULT_NAME = "Jennifernia";

    private static final int ENEMY_DAMAGE = 2;
    private static final int LOG_DAMAGE = 1;

    public Plane() {
        this(DEFAULT_NAME, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_LOGS, DEFAULT_SNEAKY_SNEKS, DEFAULT_SLOTHS);
    }

    public Plane(String name) {
        this(name, DEFAULT_WIDTH, DEFAULT_HEIGHT, DEFAULT_LOGS, DEFAULT_SNEAKY_SNEKS, DEFAULT_SLOTHS);
    }

    public Plane(String name, int width, int height, int logs, int sneks, int sloths) {
        this.width = width;
        this.height = height;
        plane = new Piece[width][height];
        adventurer = new Adventurer(name, 0, 0);
        setupPlane(logs, sneks, sloths);
    }

    public void setDirection(Direction direction) {
        chosenDirection = direction;
    }

    public Direction getDirection() {
        return chosenDirection;
    }

    public boolean isEmpty(int x, int y) {
        return plane[x][y] == null;
    }

    public boolean isOnPlane(int x, int y) {
        return (x >= 0 && x < width && y >= 0 && y < height);
    }

    public Piece getPieceAt(int x, int y) {
        return plane[x][y];
    }

    public boolean attackPieceAt(int x, int y) {
        boolean retVal = false;

        // Get the Piece at x,y
        // Make sure it is not null before continuing 
        // If it a Log, apply log damage.
        // If it is a Snek or Sloth, then
            // If it is tired, it dies (become null on the plane)
            // If it is tired and died, subtract one from either sloths or sneks. 
            // If it is tired and died, make sure you change the retval as well.
            // If it is not tired, the adventurer takes damage to the amount of ENEMY_DAMAGE.
            Piece p = plane[x][y];
            if(isEmpty(x, y)){
                return false;
            }else{
                switch(p.getType()) {
                case LOG:
                    adventurer.takeDamage(LOG_DAMAGE);
                    break;
                case SNEAKY_SNEK:
                    if(p.isTired() == true){
                        plane[x][y] = null;
                        retVal = true;
                        sneks -= 1;
                    }else{
                        adventurer.takeDamage(ENEMY_DAMAGE);
                    }
                    break;
                case SLOTH:
                    if(p.isTired() == true){
                        plane[x][y] = null;
                        retVal = true;
                        sloths -= 1;
                    }else{
                        adventurer.takeDamage(ENEMY_DAMAGE);  
                    }
                    break;       
                }
            }
            if(sneks == 0 && sloths == 0){         //FEATURE #2
                System.exit(0);
            }
        return retVal;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setupPlane(int logs, int sneks, int sloths) {
        placePiece(Piece.Type.ADVENTURER, 0, 0);

        for (int i = 0; i < logs; i++) {
            int x = rand(width);
            int y = rand(height);
            if (isEmpty(x, y)) {
                placePiece(Piece.Type.LOG, x, y);
            }
        }

        for (int i = 0; i < sneks; i++) {
            int x = rand(width);
            int y = rand(height);
            if (isEmpty(x, y)) {
                placePiece(Piece.Type.SNEAKY_SNEK, x, y);
                this.sneks++;
            }
        }

        for (int i = 0; i < sloths; i++) {
            int x = rand(width);
            int y = rand(height);
            if (isEmpty(x, y)) {
                placePiece(Piece.Type.SLOTH, x, y);
                this.sloths++;
            }
        }
    }

    public int rand(int max) {
        return random.nextInt(max);
    }

    public Direction randomDirection() {
        int dir = rand(4);
        return Direction.values()[dir];
    }

    public void placePiece(Piece.Type type, int x, int y) {
        switch(type){
        case ADVENTURER:
            plane[x][y] = adventurer;
            break;
        case LOG:
            Log log = new Log("log", x, y);
            plane[x][y] = log;
            break;
        case SNEAKY_SNEK:
            SneakySnek sneakysnek = new SneakySnek("sneakysnek", x, y);
            plane[x][y] = sneakysnek;
            break;
        case SLOTH:
            Sloth sloth = new Sloth("sloth", x, y);
            plane[x][y] = sloth;
            break;
        }
    }
    
    public void act() {
        adventurer.act(this);
        adventurer.setActed(true);

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Piece p = plane[i][j];
                if (p != null && !p.hasActed()) {
                    p.act(this);
                    // Take the time to understand why we have this pre-condition of "acted"
                    p.setActed(true);
                }
            }
        }

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                Piece p = plane[i][j];
                if (p != null) {
                    p.setActed(false);
                }
            }
        }
    }

    public boolean move(int fromX, int fromY, int toX, int toY) {
        boolean retVal = false;
        Piece p = plane[fromX][fromY];
        if (p != null) {
            if (isOnPlane(toX, toY) && isEmpty(toX, toY)) {
                plane[fromX][fromY] = null;
                plane[toX][toY] = p;
                retVal = true;
            }
        }
        return retVal;
    }

    public String toString() {
        String retVal = "";

        for (int i = 0; i < width; i++) {
            retVal += " ";
            for (int j = 0; j < height; j++) {
                Piece p = plane[i][j];
                if (p != null) {
                    switch (p.getType()) {
                    case ADVENTURER:
                        retVal += "@";
                        break;
                    case LOG:
                        retVal += "=";
                        break;
                    case SNEAKY_SNEK:
                        retVal += "$";
                        break;
                    case SLOTH:
                        retVal += "&";
                        break;
                    }
                    if (p.isTired()) {
                        retVal += "!";
                    } else {
                        retVal += " ";
                    }
                } else {
                    retVal += ". ";
                }
            }
            if (i == 0) {
                retVal += "\t" + adventurer.getName() + "\n";
            } else if (i == 1) {
                if(adventurer.getHP() < 0){     //FEATURE #1                               
                    System.exit(0);
                }else{
                    retVal += "\tHP: " + adventurer.getHP() + "\n";
                }
            } else if (i == 3) {
                retVal += "\tSneaky Sneks: " + sneks + "\n";
            } else if (i == 4) {
                retVal += "\tSloths: " + sloths + "\n";
            } else {
                retVal += "\n";
            }
        }

        return retVal;
    }
}