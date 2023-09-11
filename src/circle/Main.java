package circle;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(4.5);
        Circle circle2 = new Circle(5.5);
        Circle circle3 = new Circle(7);
        Circle.getSoluongId();
        System.out.println(circle1);
        System.out.println(circle2);
        System.out.println(circle3);
        System.out.println(Circle.getMaxradius());
        System.out.println(Circle.getSumDientich());
        System.out.println("circle3 co id la : "+circle3.getId());

    }
}
