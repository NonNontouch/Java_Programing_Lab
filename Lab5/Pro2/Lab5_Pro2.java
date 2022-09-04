package Pro2;
public class Lab5_Pro2 {
    public static void main(String[] args) {
        RegularPolygon Poly1 = new RegularPolygon();
        RegularPolygon Poly2 = new RegularPolygon(6, 4);
        RegularPolygon Poly3 = new RegularPolygon(10, 4, 5.6, 7.8);
        System.out.println("/////////////Polygon 1/////////////");
        System.out.println("Perimeter is : " + Poly1.getPerimeter());
        System.out.println("Area is : " + Poly1.getArea());
        System.out.println("/////////////Polygon 2/////////////");
        System.out.println("Perimeter is : " + Poly2.getPerimeter());
        System.out.println("Area is : " + Poly2.getArea());
        System.out.println("/////////////Polygon 3/////////////");
        System.out.println("Perimeter is : " + Poly3.getPerimeter());
        System.out.println("Area is : " + Poly3.getArea());
    }
}
