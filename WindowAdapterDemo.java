
package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class WindowAdapterExample extends JFrame{
    JFrame f1;
    
    public void setWindowAdapter(){
        f1 = new JFrame();
       f1.setVisible(true);
       f1.setSize(500,500);
       f1.setLayout(new FlowLayout());
       f1.setDefaultCloseOperation(3);
       
       
       f1.addWindowListener(new WindowAdapter(){
           
           @Override
           public void windowOpened(WindowEvent e){
               //When window is open and start working
               System.out.println("Window is opened");
               
           }
       
       });
        
    }
}


public class WindowAdapterDemo {
    public static void main(String[] args) {
        WindowAdapterExample w1 = new WindowAdapterExample();
        w1.setWindowAdapter();
        
    }
    
}
