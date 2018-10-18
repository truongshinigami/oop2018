package week5_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.*;

/**
 * drawing object and make it move
 */
public class Layer extends JPanel implements ActionListener {
    Timer t = new Timer(5,this);
    // location of circle + velocity of moving circle

    Rectangle a = new Rectangle(50,50);
    Circle b = new Circle(20);
    double _width = a._getWidth();
    double _height = a._getLenght();
    double radius = b.getRadius();
    double diameter = radius*2;
    // set tọa độ của hình tròn + vận tốc (2)
    double x1 = radius,y1=radius,velX1 = 2,velY1 = 2;
    // set tọa độ của hình vuông + vận tốc (5)
    double x2 = _width,y2=_height,velX2 = 1,velY2 = 1;
    // hàm vẽ vào frame
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        //Khởi tạo hình vuông
        Rectangle2D rectangle = new Rectangle2D.Double(x2-_width,y2-_height,_width,_height);
        // Khởi tạo hình tròn
        Ellipse2D oval = new Ellipse2D.Double(x1-radius,y1-radius,diameter,diameter);

        g2.setPaint(Color.red);
        g2.fill(rectangle);
        g2.setPaint(Color.black);
        g2.fill(oval);
        // bắt đầu chạy
        t.start();

    }
    public void actionPerformed(ActionEvent e){
        // lấy chiều rộng màn hình
        int width = getWidth();
        // lấy chiều dài màn hình
        int height = getHeight();
        // move spd of circle(x1,y1)
        x1+=velX1;
        y1+=velY1;
        // move spd of rectangle(x2,y2)
        x2+=velX2;
        y2+=velY2;
        //Bouncing ball condition
        // thay đổi trục x
        if (x1-radius<0 ){
            velX1=-velX1;
            //x=radius;
        }
        // thay đổi trục x
        else if (x1+radius>width){
            //x=width-radius;
            velX1=-velX1;
        }
        // thay đổi trục y
        if (y1-radius<0) {
            //y=radius;
            velY1 = -velY1;
        }else if (y1+radius>height)
        // thay đổi trục y
            {
            //x=height-radius;
            velY1=-velY1;
        }
        //Bouncing rectangle condition
        // thay đổi trục x
        if(x2-_width<0){
            velX2=-velX2;
        }
        // thay đổi trục x
        else if (x2>width){
            velX2=-velX2;
        }
        // thay đổi trục y
        if (y2-_height<0){
            velY2=-velY2;
        }
        // thay đổi trục y
        else if(y2>height){
            velY2=-velY2;
        }
        repaint();
    }
}
