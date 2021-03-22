import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class gui4  extends JFrame {
  private JButton b1,b2;
  private JTextField text;
  public gui4(){
    super("Calculator");

    JPanel panel1 = new JPanel();

    JPanel panel2 = new JPanel();
    panel2.setPreferredSize(new Dimension(60,40));
    JPanel panel3 = new JPanel();
    panel3.setPreferredSize(new Dimension(60,40));
    JPanel panel4 = new JPanel();
    panel4.setPreferredSize(new Dimension(60,40));
    JPanel panel5 = new JPanel();
    panel5.setPreferredSize(new Dimension(60,40));
    JPanel panel6 = new JPanel();
    panel6.setPreferredSize(new Dimension(250,150));
    setLayout(new FlowLayout());
    panel1.setPreferredSize(new Dimension(300,40));
    Container c = getContentPane();
    JTextField text = new JTextField("");
    text.setPreferredSize(new Dimension(250,30));
    JButton b1 = new JButton("Cls");
    JButton b2 = new JButton("Bck");
    JButton b3 = new JButton("Close");
    JButton b4 = new JButton("7");
    JButton b5 = new JButton("8");
    JButton b6 = new JButton("9");
    JButton b7 = new JButton("/");
    JButton b8 = new JButton("4");
    JButton b9 = new JButton("5");
    JButton b10 = new JButton("6");
    JButton b11 = new JButton("*");
    JButton b12 = new JButton("1");
    JButton b13 = new JButton("2");
    JButton b14 = new JButton("3");
    JButton b15 = new JButton("-");
    JButton b16 = new JButton("0");
    JButton b17 = new JButton(".");
    JButton b18 = new JButton("=");
    JButton b19 = new JButton("+");
    b1.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("");
      }
    });


    b2.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("Bck");
      }
    });
    b3.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("Close");
      }
    });
    b4.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("7");
      }
    });
    b5.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("8");
      }
    });
    b6.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("9");
      }
    });
    b7.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("/");
      }
    });
    b8.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("4");
      }
    });
    b9.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("5");
      }
    });
    b10.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("6");
      }
    });
    b11.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("*");
      }
    });
    b12.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("1");
      }
    });
    b13.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("2");
      }
    });
    b14.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("3");
      }
    });
    b15.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("-");
      }
    });
    b16.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("0");
      }
    });
    b17.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText(".");
      }
    });
    b18.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("=");
      }
    });
    b19.addActionListener(new ActionListener(){

      @Override
      public void actionPerformed(ActionEvent arg0) {
        text.setText("+");
      }
    });
    b1.setFont(new Font("TimesRoman", Font.PLAIN, 8));
    b2.setFont(new Font("TimesRoman", Font.PLAIN, 8));
    b3.setFont(new Font("TimesRoman", Font.PLAIN, 6));

    b1.setPreferredSize(new Dimension(50,30));
    b2.setPreferredSize(new Dimension(50,30));
    b3.setPreferredSize(new Dimension(50,30));

    panel1.add(text);
    panel2.add(b1);
    panel3.add(b2);
    panel5.add(b3);
    panel6.setLayout(new GridLayout(4,4,13,10));
    panel6.add(b4);
    panel6.add(b5);
    panel6.add(b6);
    panel6.add(b7);
    panel6.add(b8);
    panel6.add(b9);
    panel6.add(b10);
    panel6.add(b11);
    panel6.add(b12);
    panel6.add(b13);
    panel6.add(b14);
    panel6.add(b15);
    panel6.add(b16);
    panel6.add(b17);
    panel6.add(b18);
    panel6.add(b19);
    c.add(panel1,BorderLayout.NORTH);
    c.add(panel2,BorderLayout.CENTER);
    c.add(panel3,BorderLayout.CENTER);
    c.add(panel4,BorderLayout.CENTER);
    c.add(panel5,BorderLayout.CENTER);
    c.add(panel6,BorderLayout.CENTER);

    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setSize(300,300);
    setVisible(true);
  }
}
