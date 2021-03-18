import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class TextBut extends JFrame
{
private JTextField textField1;
public TextBut(){
    Container c = getContentPane();
    c.setLayout( new FlowLayout());
    Font font1 = new Font("Courier New", Font.BOLD, 20);
    JLabel label1 = new JLabel();
    textField1 = new JTextField(25);
    textField1.setFont(font1);
    c.add(label1);
    c.add(textField1);
    textField1.addActionListener(  new ActionListener(){
        public void actionPerformed(ActionEvent c){
          JOptionPane.showMessageDialog(null,textField1.getText());}
        }
      );
      JButton btn1 = new JButton("Clear");
      c.add(btn1);
      btn1.addActionListener(  new ActionListener()
        {
            public void actionPerformed(ActionEvent x)
            {
              textField1.setText(" ");
            }
        });
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(480,360);
      setVisible(true);
      }
}

class Swap extends JFrame
{
  private JTextField textField1;
  private JTextField textField2;
  private int swapbox = 0;
  private int modifybox = 0;
  public Swap()
      {
      Container c = getContentPane();
      c.setLayout( new FlowLayout());
      JPanel panel3 = new JPanel();
      panel3.setLayout( new BoxLayout(panel3, BoxLayout.Y_AXIS));
      JCheckBox check1 = new JCheckBox("Swap");
      JCheckBox check2 = new JCheckBox("Modify on Swap");
      panel3.add(check1);
      panel3.add(check2);
      JPanel panel1 = new JPanel();
      panel1.setLayout( new BoxLayout(panel1,BoxLayout.Y_AXIS));
      Font font1 = new Font("Courier New", Font.BOLD, 20);
      JLabel label1 = new JLabel();
      textField1 = new JTextField(25);
      textField1.setFont(font1);
      panel1.add(label1);
      panel1.add(textField1);
      textField2 = new JTextField(25);
      textField2.setFont(font1);
      panel1.add(textField2);
      JPanel panel2 = new JPanel();
      panel2.setLayout( new BoxLayout(panel2,BoxLayout.Y_AXIS));
      JButton btn1 = new JButton("Clear");
      JButton btn2 = new JButton("Submit");
      panel2.add(btn2);
      panel2.add(btn1);
      String word = textField1.getText();
      panel1.setLayout( new BoxLayout(panel1,BoxLayout.Y_AXIS));
      JLabel label4 = new JLabel(word);
      panel1.add(label4);
      c.add(panel3, BorderLayout.WEST);
      c.add(panel1, BorderLayout.CENTER);
      c.add(panel2, BorderLayout.EAST);
      btn1.addActionListener(  new ActionListener()
        {
            public void actionPerformed(ActionEvent x)
            {
              textField1.setText(" ");
              textField2.setText(" ");
              label4.setText(" ");
            }
        });
      btn2.addActionListener(  new ActionListener()
        {
            public void actionPerformed(ActionEvent c)
            {
              if (swapbox == 1 && modifybox == 0) {
                label4.setText(textField2.getText()+textField1.getText());
            }
              if (swapbox == 0 && modifybox == 0) {
                label4.setText(textField1.getText()+textField2.getText());
            }
              if (swapbox == 1 && modifybox == 1) {
                String a = textField1.getText();
                textField1.setText(textField2.getText());
                textField2.setText(a);
                label4.setText(textField1.getText()+textField2.getText());
            }
          }
        });
      check1.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent z){
          if(z.getStateChange() == z.SELECTED){
            swapbox = 1;
          }
          else {
            swapbox = 0;
          }
        }
      });
      check2.addItemListener(new ItemListener(){
      public void itemStateChanged(ItemEvent z){
        if(z.getStateChange() == z.SELECTED){
          modifybox = 1;
          if (swapbox == 1) {
          }
        }
        else {
          modifybox = 0;
        }
      }
    });
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(800,300);
      setVisible(true);
      }
}

public class Main {
   public static void main(String[] args) {
      new TextBut();
      new Swap();
   }
}
