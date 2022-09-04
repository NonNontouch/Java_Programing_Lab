package Pro2;
public class RegularPolygon {
    private int n;// number of side
    private double side;// length of the side
    private double x;// x-coordinate
    private double y;// y-coordinate

    public RegularPolygon() {
        n = 3;
        side = 1.0;
        x = 0.0;
        y = 0.0;
    }
    public RegularPolygon(int INn, double INside) {
        n = INn;
        side = INside;
        x=0.0;
        y=0.0;
    }

    public RegularPolygon(int INn, double INside, double INx, double INy) {
        n = INn;
        side = INside;
        x = INx;
        y = INy;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n*(side*side))/(4*Math.tan(Math.PI/n));
    }
}
