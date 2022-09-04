package Pro3;

import Pro1.Triangle;

public class Rectangle extends GeometricObjectPro3 implements Comparable<GeometricObjectPro3>{
    private double width;
    private double height;

    public Rectangle() {

    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height)
    {
        this.height=height;
    }
    public double getArea()
    {
        return height*width;
    }
    public double getPerimeter()
    {
        return (height*2)+(width*2);
    }
    @Override
    public String toString()
    {
        return super.toString()+"\nArea : "+getArea()+"\nPerimeter : "+getPerimeter();
    }
   @Override
    public boolean equals(Object o){
        if(!(o instanceof GeometricObjectPro3)){
            return false;
        }
        return getArea() == ((GeometricObjectPro3)o).getArea();
    }
    @Override
    public int compareTo(GeometricObjectPro3 o ){
        double dif = getArea() - o.getArea();
        return (Math.abs(dif)<1&&dif != 0)?(int)(dif/Math.abs(dif)):(int)dif;
    }
}

