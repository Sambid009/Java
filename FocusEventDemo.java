
package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//focus event is triggered when any component gets focus of mouse or keyboard
//to handle focus event focus listener is used
//it has two method, focusGained and focusLost


class FocusExample extends JFrame{
    JButton b1,b2;
    JLabel l1;
    
    public void setFocus(){
        b1 = new JButton("button1");
        b2 = new JButton("button2");
        l1 = new JLabel("Result");
        
        add(b1);add(b2);add(l1);
        
        setVisible(true);
        setLayout(new FlowLayout());
        setTitle("MyForm");
        setSize(320,390);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //handling focusevent in b1
        
        b1.addFocusListener(new FocusListener(){
            @Override
            public void focusGained(FocusEvent e){
                l1.setText("b1 get focus");
                
            }
            @Override
            public void focusLost(FocusEvent e){
                l1.setText("b1 lost focus");
            }
        
        
        });
        
    }
}


public class FocusEventDemo {
    public static void main(String[] args) {
        FocusExample f1 = new FocusExample();
        f1.setFocus();
               
        
    }
    
}
