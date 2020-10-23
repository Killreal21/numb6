package ex3;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(new Point(4,6),new Point(5,2));

        System.out.println(rectangle);

        PointMovable pointMovable1 = new PointMovable(4,6);
        System.out.println(pointMovable1);
        pointMovable1.move(1,1);
        System.out.println(pointMovable1);

        PointMovable pointMovable2 = new PointMovable(5,2);
        System.out.println(pointMovable2);
        pointMovable2.move(1,1);
        System.out.println(pointMovable2);


    }

}
