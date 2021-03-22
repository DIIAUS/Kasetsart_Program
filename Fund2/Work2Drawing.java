import java.awt.*;
import javax.swing.*;
public class Work2Drawing{
  public static void main(String[] args) {
    Lab92 panel = new Lab92();
    JFrame window = new JFrame("Draw");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.add(panel);
    window.setSize(400,400);
    window.setVisible(true);
  }
}
