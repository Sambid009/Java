
package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class setcontros2 extends JFrame{

    JTextArea t1;
    JLabel l1;
    public void setMouse1(){
        
        t1 = new JTextArea(20,20);
        l1=new JLabel("Result");
        
        
        setSize(400,400);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(3);
        
        
        add(t1);add(l1);
        setVisible(true);

        t1.addMouseMotionListener(new MouseMotionListener(){
        @Override
        public void mouseDragged(MouseEvent e){
            l1.setText("Mouse Dragged at "+ e.getX()+ ","+ e.getY());
            
        }
        
          @Override
        public void mouseMoved(MouseEvent e){           
            l1.setText("Mouse Moved at "+ e.getX()+ ","+ e.getY());
            
        }
        });
    }
    
    
}

public class MouseMotionAndWheelDemo {
    public static void main(String[] args) {
        setcontros2 c3 = new setcontros2();
        c3.setMouse1();
    }
    
}
