package week7.task1;

/**
 * Created by CCNE on 31/10/2018.
 */
public class Division extends BinaryExpression{
    Expression left;
    Expression right;
    Division(Expression _left,Expression _right){
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
        try {
            return this.left.evaluate() / this.right.evaluate();
        }catch (Exception e){
            System.out.println("can't divide to 0");
        }
        return 0;
    }

    @Override
    public String toString() {
        return this.left.toString() + "/" + this.right.toString();
    }
}
