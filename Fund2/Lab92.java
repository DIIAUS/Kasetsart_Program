import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class Lab92 extends JPanel
{
private final ArrayList<Point> points = new ArrayList<>();
public Lab92()
{
addMouseListener(
new MouseAdapter() {
  @Override
  public void mouseClicked(MouseEvent event) {
    points.add(event.getPoint());
    repaint();
  }
});
}

public void paintComponent(Graphics g)
{
super.paintComponent(g);
for (int i = 0 ; i < points.size()-1;i++){
g.drawLine(points.get(i).x, points.get(i).y, points.get(i+1).x, points.get(i+1).y);

}
}
}
