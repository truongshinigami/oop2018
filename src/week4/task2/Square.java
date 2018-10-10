package week4.task2;

/**
 * Khai bao ham square
 */
public class Square extends Rectangle {
    public Square(){
        this.side = 1.0;
    }
    public Square(double _side,String _color,boolean _filled){

    }
    private String color;
    private boolean filled;
    double side;
    double getSide(){
        return this.side;
    }

    void setSide(double n){
        this.side = n;
    }

    /**
     *
     * @param n
     *
    void setSide(double n){
        this.side = n;
    }
    void setWidth(double n){
        this.Width = n;
    }
    void setLenght(double n){
        this.Lenght = n;
    }
    double getSide(){
        return this.side;
    }*/


    @Override
    public String toString() {
        return super.toString() + this.getSide();

    }

}
