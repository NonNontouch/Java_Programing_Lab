package Pro2;

public class Lab8_Pro2 {
    public static void main(String[] args) {
        Square squ1 = new Square(4, "Blue", true);
        Square squ2 = new Square(2, "Purple", true);
        Square squ3 = new Square(9, "Black", false);
        Square squ4 = new Square(5, "Brown", false);
        Square squ5 = new Square(7, "Red", false);
        System.out.print("Square 1 \n"+squ1.toString());
        squ1.howToColor();
        System.out.print("Square 2 \n"+squ2.toString());
        squ1.howToColor();
        System.out.print("Square 3 \n"+squ3.toString());
        squ1.howToColor();
        System.out.print("Square 4 \n"+squ4.toString());
        squ1.howToColor();
        System.out.print("Square 5 \n"+squ5.toString());
        squ5.howToColor();
    }

}
