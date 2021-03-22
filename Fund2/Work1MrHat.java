import javax.swing.*;
public class Work1MrHat {
  public static void main(String[] args) {
    Lab91 panel = new Lab91();
    JFrame window = new JFrame("Mr.Smile");
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.add(panel);
    window.setSize(400,400);
    window.setVisible(true);
  }
}
