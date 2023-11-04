import javax.swing.*;
import java.awt.*;
public class Demo1 {
public static void main(String[] args) {
    JFrame obj= new JFrame("Demo Class");
    obj.setLayout(null);
    obj.setVisible(true);
    obj.setSize(800, 600);
    obj.setLocation(500,200);
    obj.getContentPane().setBackground(Color.LIGHT_GRAY );
    JLabel j1= new JLabel("Enter Your Name");
   
    j1.setFont(new Font("",Font.BOLD, 40));
    j1.setBounds(200, 100, 400, 200);
     obj.add(j1);

    JTextField jt= new JTextField();
    jt.setBounds(100, 100, 400, 40);
    jt.setFont(new Font("",Font.BOLD,30));
    
    obj.add(jt);


}
    
}
