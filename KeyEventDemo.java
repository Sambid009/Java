package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class keyControls{
    JTextArea t1;
    JLabel l1;
    JFrame f1;
    
    public void setKey(){
        t1= new JTextArea (20,20);
        l1= new JLabel("Result");
        f1= new JFrame();
        f1.add(t1);
        f1.add(l1);
        f1.setVisible(true);
        f1.setSize(500,500);
        f1.setLayout(new FlowLayout());
        f1.setDefaultCloseOperation(3);
        
        t1.addKeyListener(new  KeyListener(){
            public void keyTyped(KeyEvent e){
                l1.setText("Key Is Continiously Pressed");
                
            }
            public void keyPressed(KeyEvent e){
                l1.setText("Key is Pressed & Released");
            }
            
            public void keyReleased(KeyEvent e){
                l1.setText("Key Released");
                
            }
            
        });
    }
}
public class keyEventDemo{
    public static void main(String[] args){
        keyControls keys = new keyControls();
        keys.setKey();
    }
    
}