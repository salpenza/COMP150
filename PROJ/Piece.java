public abstract class Piece {
    public static enum Type { LOG, ADVENTURER, SNEAKY_SNEK, SLOTH };

    int x;
    int y;
    boolean tired;
    boolean acted;
    Type type;

    public Piece(Type type, int x, int  y, boolean tired) {
        this.type = type;
        this.x = x;
        this.y = y;
        this.tired = tired;
    }

    public void setActed(boolean acted) {
        this.acted = acted;
    }

    public boolean hasActed() {
        return acted;
    }

    public Type getType() {
        // TODO: stub
        return type;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isTired() {
       return tired;
    }

    public void setTired(boolean tired) {
        this.tired = tired;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public abstract void act(Plane plane);
}