package week5_6;

public class Square extends  Shape{

    private double side;

    /**
     * Constructor
     * @param _side
     * @param _color
     * @param _filled
     */
    public Square(double _side,String _color,boolean _filled){
        this.side = _side;
        this.setColor(_color);
        this.setFilled(_filled);
    }

    //getter for Side
    double getSide(){
        return this.side;
    }
    //setter for side
    void setSide(double n){
        this.side = n;
    }

}
