package week4.task2;

/**
 * Viet Ham Circle
 */
public class Circle extends Shape{

    private double radius;
    final double  PI = 3.14;
    public Circle(){
        this.radius = 1.0;
    }
    public Circle(double radius,String color,boolean filled){
        this.setColor(color);
        this.setFilled(filled);
        this.radius = radius;
    }
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

    @Override
    public String toString() {
        return super.toString() + "Radius :" + this.getRadius() + "Area : " + this.getArea() + " Perimeter : " + this.getPerimeter();
    }
}
