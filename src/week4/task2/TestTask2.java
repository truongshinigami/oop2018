package week4.task2;

/**
 * Test ke thua cua cac lop
 */
public class TestTask2 {
    public static void main(String [] abc){
        /**
        //rectangle
        Rectangle a = new Rectangle();
        a.Width = 1.0;
        a.Lenght = 1.0;
        a.setWidth(a.Width);
        a.setLenght(a.Lenght);
        System.out.println("Give rectangle with Width : " + a.getWidth() + "\t" + "Length : " + a.getWidth());
        System.out.println("Area : " +a.getArea() + "\t" + "Perimeter : " +a.getPerimeter() );
        // circle
        Circle b = new Circle();
        b.radius = 1.0;
        b.setRadius(b.radius);
        System.out.println("Give circle with Radius : " + b.getRadius() );
        System.out.println("Area : " +b.getArea() + "\t" + "Perimeter : " +b.getPerimeter() );
        //shape
        Shape c = new Shape();
        c.color = "red";
        c.filled = true;
        c.setColor(c.color);
        c.setFilled(c.filled);
        System.out.println("Shape have " + c.getColor() + " color");
        if (c.isFilled()){
            System.out.println("Shape is filled");
        }
        else
            System.out.print("Shape isn't be filled");
         */
        Circle a = new Circle();
        System.out.println(a.toString() +"\n");
        Rectangle b = new Rectangle();
        System.out.println(b.toString() + "\n");
        Shape c = new Shape();
        System.out.println(c.toString() + "\n");
        Square d = new Square();
        System.out.println(d.toString() + "\n");
    }
}
