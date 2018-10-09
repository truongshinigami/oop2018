package week4.task2;

/**
 * Viet Ham Circle
 */
public class Circle {
    String color;
    boolean filled;
    double radius;
    final double  PI = Math.PI;
    public void setRadius(double n){
        this.radius = n;
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return PI*Math.pow(radius,2);
    }
    public double getPerimeter(){
        return 2*PI*radius;
    }
}
