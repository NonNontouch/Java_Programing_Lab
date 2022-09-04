package Pro2;

import java.lang.Math;

public  class Triangle extends GeometricObjectPro2 implements Colorable {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(double side1, double side2, double side3, String color, boolean filled) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getPerimeter()
    {
        return side1+side2+side3;
    }

    public double getArea()
    {
        double s=(side1+side2+side3)/2;
        s=Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
        return s;
    }
    public void howToColor()
    {
        if (isFilled() == false)
        {
            System.out.print("\nColor it with color pencil\n");
        }
        else{
            System.out.print("\nIt can't be colored\n");
        }
        
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nArea : "+getArea()+"\nPerimeter : "+getPerimeter();
    }
    
}
