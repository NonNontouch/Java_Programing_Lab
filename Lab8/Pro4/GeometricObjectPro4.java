package Pro4;

public abstract class GeometricObjectPro4 {
    private String color;
    private boolean filled;
    private java.util.Date dateCreate;

    public GeometricObjectPro4() {

    }

    public GeometricObjectPro4(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        this.dateCreate = new java.util.Date();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public java.util.Date getDateCreated() {
        return dateCreate;
    }

    public String toString() {
        return "Color :  "+getColor()+"\nFilled : "+isFilled();
    }

    public abstract double getArea();

    public abstract double getPerimeter();

}
