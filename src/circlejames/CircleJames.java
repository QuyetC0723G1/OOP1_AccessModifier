package circlejames;

public class CircleJames {
    private double radius;
    protected int x = 10;
    private String color;
    public CircleJames(){
    }
    public CircleJames(double radius){
        this.radius = radius;
    }
    protected double getRadius() {
        return radius;
    }
    protected String getColor() {
        return "Hello";
    }

    protected double getArea() {
        return radius*radius*3.14;
    }
}
