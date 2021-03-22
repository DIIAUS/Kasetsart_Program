import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class gui2 extends JFrame{
  public static int checkBox1,checkBox2;
  public static void main(String[] args) {
    checkBox1 = 0;
    checkBox2 = 0;
    JFrame frame = new JFrame("Swap");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    panel.setPreferredSize(new Dimension(300,150));
    panel3.setPreferredSize(new Dimension(200,100));
    panel4.setPreferredSize(new Dimension(200,100));
    JTextField text1 = new JTextField(30);
    JTextField text2 = new JTextField(30);
    JCheckBox c1 = new JCheckBox("Swap");
    JCheckBox c2 = new JCheckBox("Modify on Swap");
    JLabel label = new JLabel("TEXT",SwingConstants.CENTER);
    JButton btn1 = new JButton("Submit");
    JButton btn2 = new JButton("CLEAR");

    label.setForeground(Color.black);
    label.setPreferredSize(new Dimension(500,60));
    text1.setPreferredSize(new Dimension(320,30));
    text2.setPreferredSize(new Dimension(320,30));
    btn1.setPreferredSize(new Dimension(100,30));
    btn2.setPreferredSize(new Dimension(100,30));
    panel.add(text1);
    panel.add(text2);
    panel.add(label);
    panel4.add(c1);
    panel4.add(c2);
    panel2.add(btn1);
    panel2.add(btn2);
    c1.addItemListener( new ItemListener() {
  public void itemStateChanged(ItemEvent e){
  if (e.getStateChange() == e.SELECTED){

  checkBox1 = 1;
  }
  else
  checkBox1 = 0;
  }
  }
  );   c2.addItemListener( new ItemListener() {
  public void itemStateChanged(ItemEvent e){
  if (e.getStateChange() == e.SELECTED){
  checkBox2 = 1;
  }
  else
  checkBox2 = 0;
  }
  }
  );
  btn1.addActionListener( new ActionListener(){

  @Override
  public void actionPerformed(ActionEvent arg0) {

  if ((checkBox1 == 0) && (checkBox2 == 0)){
    label.setText(text1.getText()+text2.getText());
  }
  if ((checkBox1 == 1) && (checkBox2 == 0)){
    label.setText(text2.getText()+text1.getText());
  }
  if ((checkBox1 == 1) && (checkBox2 == 1)){
    String check;
    label.setText(text2.getText()+text1.getText());
    check = text1.getText();
    text1.setText(text2.getText());
    text2.setText(check);
    }
  }
  }
  );

  btn2.addActionListener( new ActionListener(){
  @Override
  public void actionPerformed(ActionEvent arg0) {
  text1.setText("");
  text2.setText("");
  label.setText("");
  }
  }

  );
    frame.add(panel,BorderLayout.NORTH);
    frame.add(panel3,BorderLayout.CENTER);
    frame.add(panel4,BorderLayout.CENTER);
    frame.add(panel2,BorderLayout.SOUTH);
    frame.setSize(400,300);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
  }
}
