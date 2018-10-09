package week4.task2;

public class Shape extends Circle{
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
}
