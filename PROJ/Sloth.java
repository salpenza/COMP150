import java.util.Random;
public class Sloth extends Piece {
    // Add necessary fields
    protected String name;
    int x, y;
    int fromX, fromY, toX, toY;
    public Sloth(String name, int x, int y) {
        super(Type.SLOTH, x, y, true);
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void act(Plane plane) {
        
        Random rand = new Random();
        int chance = rand.nextInt((3 - 1) + 1) + 1;
        Piece p = plane.getPieceAt(x, y);
        fromX = p.getX();
        fromY = p.getY();
        if(chance == 1){
            Plane.Direction direction = plane.randomDirection();
            switch(direction){
            case NORTH:
                toX = p.getX();
                toY = p.getY() - 1;
                if(plane.move(fromX, fromY, toX, toY)){           
                    p.setX(toX);
                    p.setY(toY); 
                }         
                break;
            case SOUTH:
                toX = p.getX();
                toY = p.getY() + 1;
                if(plane.move(fromX, fromY, toX, toY)){           
                    p.setX(toX);
                    p.setY(toY); 
                }                
                break;
            case EAST:
                toX = p.getX() + 1;
                toY = p.getY();
                if(plane.move(fromX, fromY, toX, toY)){           
                    p.setX(toX);
                    p.setY(toY); 
                }                  
                break;
            case WEST:
                toX = p.getX() - 1;
                toY = p.getY();
                if(plane.move(fromX, fromY, toX, toY)){           
                    p.setX(toX);
                    p.setY(toY); 
                }                   
                break;
            }
        }
    }
}