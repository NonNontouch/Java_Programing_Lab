package Pro2;

public class Square extends GeometricObjectPro2 implements Colorable {
    private double side;

    public Square() {

    }

    public Square(double side, String color, boolean filled) {
        super(color, filled);
        this.side = side;

    }

    public double getPerimeter() {
        return side*4;
    }

    public double getArea() {

        return side*side;
    }
    
    public void howToColor() {
        if (isFilled())
        {
            System.out.print("\nColor it with water color\n");
        }
        else{
            System.out.print("\nIt can't be colored\n");
        }
    }
    @Override
    public String toString(){
        return super.toString()+"\nArea: "+getArea()+"\nPerimeter : "+getPerimeter();
    }
}
