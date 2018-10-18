package week5_6;

public class Circle extends Shape{
    private double radius;
    final double  PI = 3.14;

    Circle(double _radius){
        this.radius = _radius;
    }
    public Circle(double radius,String color,boolean filled){
        this.setColor(color);
        this.setFilled(filled);
        this.radius = radius;
    }
    //setter for radius
    public void setRadius(double n){
        this.radius = n;
    }
    //getter for radius
    public double getRadius(){
        return radius;
    }

}
