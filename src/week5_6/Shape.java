package week5_6;

/**
 * Class Shape
 */
public class Shape {

        private String color ;
        private  boolean filled;
        public Shape(){
            this.color = "red";
            this.filled = true;
        }

    /**
     * Constructor 1
     * @param _color
     * @param _filled
     */
        public Shape(String _color,boolean _filled){
            this.setFilled(_filled);
            this.setColor(_color);
        }
        //setter cho Color
        public void  setColor(String n){
            this.color = n;
        }
        //getter cho Color
        public String getColor(){
            return this.color;
        }
        //setter cho fill
        public boolean isFilled(){
            return this.filled;
        }
        //getter cho fill
        public void setFilled(boolean n){
            this.filled = n;
        }
}
