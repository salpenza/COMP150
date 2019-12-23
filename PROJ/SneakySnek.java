public class SneakySnek extends Piece {
    protected String name;
    int x, y;
    int moves = 0;
    int rest = 0;
    int fromX, fromY, toX, toY;
    public SneakySnek(String name, int x, int y) {
        super(Type.SNEAKY_SNEK, x, y, false);
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void act(Plane plane) {   
        Plane.Direction direction = plane.randomDirection();
        Piece p = plane.getPieceAt(x, y);
        fromX = p.getX();
        fromY = p.getY();
        switch(direction){      
        case NORTH:
            toX = p.getX();
            toY = p.getY() - 1;
            if(p.isTired() == false){            
                if(plane.move(fromX, fromY, toX, toY) == true){
                    p.setX(toX);
                    p.setY(toY);
                    moves++; 
                    if(moves == 3){
                        p.setTired(true);
                        moves = 0;
                    }               
                }
            }else{
                rest++;
                if(rest == 2){
                    p.setTired(false);
                }
            }               
            break;
        case SOUTH:
            toX = p.getX();
            toY = p.getY() + 1;
            if(p.isTired() == false){            
                if(plane.move(fromX, fromY, toX, toY) == true){
                    p.setX(toX);
                    p.setY(toY);
                    moves++; 
                    if(moves == 3){
                        p.setTired(true);
                        moves = 0;
                    }               
                }
            }else{
                rest++;
                if(rest == 2){
                    p.setTired(false);
                }
            }               
            break;
        case EAST:
            toX = p.getX() + 1;
            toY = p.getY();  
            if(p.isTired() == false){            
                if(plane.move(fromX, fromY, toX, toY) == true){
                    p.setX(toX);
                    p.setY(toY);
                    moves++; 
                    if(moves == 3){
                        p.setTired(true);
                        moves = 0;
                    }               
                }
            }else{
                rest++;
                if(rest == 2){
                    p.setTired(false);
                }
            }                             
            break;
        case WEST: 
            toX = p.getX() - 1;
            toY = p.getY(); 
            if(p.isTired() == false){            
                if(plane.move(fromX, fromY, toX, toY) == true){
                    p.setX(toX);
                    p.setY(toY);
                    moves++; 
                    if(moves == 3){
                        p.setTired(true);
                        moves = 0;
                    }               
                }
            }else{
                rest++;
                if(rest == 2){
                    p.setTired(false);
                }
            }               
            break;  
        }                          
    }
}
