
package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//using delegation event(listener) we have to use all predefined method
//but using adapter class we can implement any  number predefined method
//ie if event contain 5 method we have choice like 1,2 or all.

//Example mouse adapter, here we will handle any two method out of 5.

class MouseAdapterExample extends JFrame{
    JTextArea t1;
    JLabel l1;
    
   
    public void setMouseAdapter(){
        t1 = new JTextArea(20,20);
        l1= new JLabel("Result");
        
        add(t1);add(l1);
        
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("MyForm");
        setSize(320,390);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //handling mouseevent using adapter class in t1
        
        t1.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                l1.setText("Mouse is pressed");
            }
        
            @Override
            public void mouseReleased(MouseEvent e){
                l1.setText("Mouse is Released");
            }
        });
        
        
    }
    
}

public class MouseAdapterDemo {
    public static void main(String[] args) {
        
        MouseAdapterExample m1 = new MouseAdapterExample();
        m1.setMouseAdapter();
        
    }
    
}
