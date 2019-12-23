public class Log extends Piece {
    // Add necessary fields
    protected String name;
    int x, y;
    
    public Log(String name, int x, int y) {
        super(Type.LOG, x, y, false);
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public String getName() {
        return name;
    }

    public void act(Plane plane) {
    }
}