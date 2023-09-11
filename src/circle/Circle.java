package circle;

public class Circle {
    private int id = 0;

    private double radius;
    public static int soluongCircle = 0;
    public static final double PI = 3.14;
    public static double maxRadius;
    public static double sumDientich;
    public Circle(double radius) {
        ++soluongCircle;
        id = soluongCircle;
        this.radius = radius;
        if (radius > maxRadius) {
            maxRadius = this.radius;
        }
        sumDientich += getDientich();
    }
    //    public void setId(){
//        System.out.println();
//    }
    public int getId() {
       return this.id = id;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id=" + id +
                ", radius=" + radius +
                '}';
    }

    public static double getMaxradius() {
        System.out.println("Max radius sẽ là : ");
        return maxRadius;
    }

    public static double getSumDientich() {
        System.out.println("Tổng diện tích các Circle là : ");
        return sumDientich;
    }

    public static void getSoluongId() {
        System.out.println("Số lượng hình tròn đã được tạo ra là : " + soluongCircle);
    }

    public double getDientich() {
        return Math.pow(radius, 2) * PI;
    }

    public double getChuvi() {
        System.out.println("Chu vi cua Circle la : ");
        return radius * 2 * PI;
    }

}


