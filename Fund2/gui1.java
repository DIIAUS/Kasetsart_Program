import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class gui1 extends JFrame
{
private JTextField textField1;
public gui1()
{
super( "GUI1" );
Container c = getContentPane();
c.setLayout( new FlowLayout() );

Font font1 = new Font("Courier New", Font.BOLD, 20);
textField1 = new JTextField(25);
textField1.setFont(font1);
c.add(textField1);
textField1.addActionListener(new ActionListener(){
  @Override
  public void actionPerformed(ActionEvent e) {
    JOptionPane.showMessageDialog(null, textField1.getText());
  }
});

JButton btn = new JButton("Clear");
btn.addActionListener(new ActionListener(){
  @Override
  public void actionPerformed(ActionEvent arg0) {

    textField1.setText("");
  }
});
textField1.setPreferredSize(new Dimension(300, 60));
btn.setBackground(Color.white);
btn.setPreferredSize(new Dimension(150, 80));
c.add(btn);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

setSize(480,360);
setVisible(true);
}
public static void main(String[] args)
{
new gui1() ;
}
}
