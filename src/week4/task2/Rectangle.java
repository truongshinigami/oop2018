package week4.task2;

/**
 *  Khai bao lop Rectangle ke thua lop Square
 */
public class Rectangle extends Shape{

  private double Width;
  private double Length;
  public Rectangle(){

    this.Width =1.0;
    this.Length =1.0;

  }
  Rectangle(double width,double length){
    this.setWidth(width);
    this.setLenght(length);
  }
  Rectangle (double width,double length,String color,boolean filled){
    this.setWidth(width);
    this.setLenght(length);
    this.setColor(color);
    this.setFilled(filled);
  }
 public double getWidth(){
    return this.Width;
  }
  public void setWidth(double width){
    this.Width = width;
  }
  public void setLenght(double lenght){
    this.Length = lenght;
  }
  public double getLenght(){
    return this.Length;
  }
  public double getArea(){
    return Length*Width;
  }
  public double getPerimeter(){
    return 2*(Length+Width);
  }


  public String toString() {
    return super.toString() +"Width : " + this.Width + "Length : " + this.Length + "Area : " + this.getArea() + "Perimeter : " + this.getPerimeter();
  }
}

