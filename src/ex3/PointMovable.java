package ex3;

public class PointMovable extends Point implements Movable {

    public PointMovable(int x, int y) {
        super(x, y);
    }

    @Override
    public void move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
    }

    /*public int prov (int x, int y){
        if (getX()-x==getY()-y)
            return 1;
        return 0;
    }*/
}
