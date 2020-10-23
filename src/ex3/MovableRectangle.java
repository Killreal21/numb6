package ex3;

public class MovableRectangle extends Rectangle implements Movable {

    public MovableRectangle(Point A, Point B) {
        super(A, B);
    }

    @Override
    public void move(int x, int y) {
        try {
            ((PointMovable) this.getA()).move(x, y);
        } catch (ClassCastException e) {
            e.printStackTrace();
            System.out.println("Я упаль");
        }
    }
}
