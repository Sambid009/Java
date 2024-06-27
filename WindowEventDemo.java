package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

//windoe event is trigeerde wheneveer window (jframe , jpnel) is active (working
//, minimize back to active deactive close

class WindowExample{
    JFrame f1;
    public void setWindow(){
        f1 = new JFrame();
       f1.setVisible(true);
       f1.setSize(500,500);
       f1.setLayout(new FlowLayout());
       f1.setDefaultCloseOperation(3);
       
       // handling window event in j frame
       
            f1.addWindowListener(new WindowListener (){
           
           @Override
           public void windowOpened(WindowEvent e){
               //When window is open and start working
               System.out.println("Window is opened");
               
           }
           
           @Override
           public void windowClosed(WindowEvent e){
               //when window is exceptionaly closed
               System.out.println("window closed");
               
           }
           @Override
           public void windowClosing(WindowEvent e){
               //when window is closed using menu bar
               System.out.println("window closing");
               
           }
            @Override
           public void windowIconified (WindowEvent e){
               //when window in minimized
               System.out.println("WIndow minimized (iconofied)");
           }
            @Override
           public void windowDeiconified (WindowEvent e){
               //when window in minimized
               System.out.println("WIndow back to normal after minimized");
           }
           @Override
           public void windowActivated(WindowEvent e){
               //when window in aactivated
               System.out.println("WIndow Activated or Working");
           }
           @Override
           public void windowDeactivated (WindowEvent e){
               //when window  is deactivated
               System.out.println("WIndow in not working or deactivated");
           }

 
       });
        
    }
}
public class WindowEventDemo {
    public static void main(String[] args){
        WindowExample window = new WindowExample();
        window.setWindow();
    }
}