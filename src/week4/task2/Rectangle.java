package week4.task2;

/**
 *  Khai bao lop Rectangle ke thua lop Square
 */
public class Rectangle extends Square{
  public double getWidth(){
    return this.Width;
  }
  public void setWidth(double width){
    this.Width = width;
  }
  public void setLenght(double lenght){
    this.Lenght = lenght;
  }
  public double getLenght(){
    return this.Lenght;
  }
  public double getArea(){
    return Lenght*Width;
  }
  public double getPerimeter(){
    return 2*(Lenght+Width);
  }
}
