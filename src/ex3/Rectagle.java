package ex3;

class Rectangle {
    public Point A;
    public Point B;
    //public double diagonal;

    public Rectangle(Point A, Point B){
        this.A= A;
        this.B= B;
    }

    public Point getA() {
        return A;
    }

    public Point getB() {
        return B;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "Pount A=" + A +
                ", Point B=" + B +
                '}';
    }
}