package week7.task1;

public class Addition extends BinaryExpression{
      Expression left;
      Expression right;
    Addition(Expression _left,Expression _right){
        this.left = _left;
        this.right = _right;
    }

    @Override
    public Expression left() {
        return this.left;
    }

    @Override
    public Expression right() {
        return this.right;
    }


    @Override
    public int evaluate() {
        return this.left.evaluate() + this.right.evaluate();
    }

    @Override
    public String toString() {
        return this.left.toString() + "+" + this.right.toString();
    }
}
