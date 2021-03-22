import java.awt.*;
import javax.swing.*;
public class Lab91 extends JPanel
{
public void paintComponent( Graphics g)
{
super.paintComponent(g);
g.setColor(Color.black);
g.fillOval(40,80,310,70);
g.setColor(Color.gray);
g.fillOval(45,80,300,60);
//draw face
g.setColor(Color.YELLOW);
g.fillOval(90, 90, 200, 200);
//draw eye
g.setColor(Color.BLACK);
g.fillOval(135, 145, 30, 30);
g.fillOval(215, 145, 30, 30);
//draw mouth
g.fillOval(130, 190, 120 , 60);
//draw smile
g.setColor(Color.YELLOW);
g.fillRect(130, 190, 120, 30);
g.fillOval(130, 200, 120, 40);

g.setColor(Color.gray);
g.fillOval(65,80,250,50);
g.fillOval(90,40,200,80);

g.setColor(Color.black);
g.fillOval(90,190,80,20);
g.fillOval(210,190,80,30);

g.setColor(Color.YELLOW);
g.fillOval(90,195,80,20);
g.fillOval(210,195,80,30);

}
}
