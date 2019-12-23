public class Adventurer extends Piece {
    // Add necessary fields
    protected String name;
    int x, y;
    int hitpoints;
    int fromX, fromY, toX, toY;
    public Adventurer(String name, int x, int y) {
        super(Type.ADVENTURER, x, y, false);
        // default hitpoints should be 10.
        this.name = name;
        this.x = x;
        this.y = y;
        hitpoints = 10;
    }

    public String getName() {
        return name;
    }

    public int getHP() {
        return hitpoints;        
    }

    public void takeDamage(int damage) {
        // subtract damage from HP
        hitpoints -= damage;
    }

    public void act(Plane plane) {                                              //my guy only moves once :(
        
        Plane.Direction direction = plane.getDirection();
        Piece p = plane.getPieceAt(x, y);
        fromX = p.getX();
        fromY = p.getY();
        switch(direction){
        case NORTH:
            toX = p.getX();
            toY = p.getY() - 1;
            if(plane.move(fromX, fromY, toX, toY) == true){
               p.setX(toX);
               p.setY(toY);
               p.setActed(false);
            }else if(plane.attackPieceAt(toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
            }
            break;         
        case SOUTH:
            toX = p.getX();
            toY = p.getY() + 1;
            if(plane.move(fromX, fromY, toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
                p.setActed(false);
            }else if(plane.attackPieceAt(toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
            }
            break;
        case EAST:
            toX = p.getX() + 1;
            toY = p.getY();
            if(plane.move(fromX, fromY, toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
                p.setActed(false);
            }else if(plane.attackPieceAt(toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
            }         
            break;
        case WEST:
            toX = p.getX() - 1;
            toY = p.getY();
            if(plane.move(fromX, fromY, toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
                p.setActed(false);
            }else if(plane.attackPieceAt(toX, toY) == true){
                p.setX(toX);
                p.setY(toY);
            }         
            break; 
        }      
    }
}