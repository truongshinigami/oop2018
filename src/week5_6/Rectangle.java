package week5_6;

public class Rectangle extends Shape{
   public double Width;
   public double Length;

    /**
     * Constructor
     * @param width
     * @param length
     *
     *
     */
    Rectangle (double width,double length){
        this.Width = width;
        this.Length = length;
        //this.setColor(color);
        //this.setFilled(filled);
    }
    // getter for width
    public double _getWidth(){
        return this.Width;
    }
    //setter for width
    public void set_Width(double width){
        this.Width = width;
    }
    //setter for length
    public void set_Lenght(double lenght){
        this.Length = lenght;
    }
    //getter for length
    public double _getLenght(){
        return this.Length;
    }


}
