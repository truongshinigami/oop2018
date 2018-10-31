package week7.task1;

public class Square extends Expression{
    Expression expression;
    public Square(Expression _expression){
    this.expression = _expression;
    }
    @Override
    public int evaluate() {
        return this.expression.evaluate()*this.expression.evaluate();
    }

    @Override
    public String toString() {
        return this.expression.toString()+"^2";
    }
}
