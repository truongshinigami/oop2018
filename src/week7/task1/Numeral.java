package week7.task1;

public class Numeral extends Expression{
    int value;
    public Numeral(int x){
        this.value = x;
    }
    Numeral(){
        this.value = 1;
    }

    @Override
    public int evaluate() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.toString();
    }
}
