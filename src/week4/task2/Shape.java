package week4.task2;

public class Shape {
       private String color ;
      private   boolean filled;
    public Shape(){
        this.color = "red";
        this.filled = true;
    }

    public Shape(String _color,boolean _filled){
        this.setFilled(_filled);
        this.setColor(_color);
    }

    public void  setColor(String n){
        this.color = n;
    }
    public String getColor(){
        return this.color;
    }
    public boolean isFilled(){
        return this.filled;
    }
    public void setFilled(boolean n){
        this.filled = n;
    }

    @Override
    public String toString() {
        return super.toString() + this.getColor() + " filled? " +(this.isFilled());
    }
}
