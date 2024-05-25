package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class controls extends JFrame{
    JLabel l1;
    JTable t1;
    
    public void setControls_new2(){
        l1 = new JLabel("Language");
        String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};   
        t1 = new JTable(data,column);
        
        
        DefaultListModel<String> list1 = new DefaultListModel<>();
        list1.addElement("Java");
        list1.addElement("JavaScript");
        list1.addElement("Python");
        list1.addElement("Dotnet");
        
         JList<String> list = new JList<>(list1);  
        
        
        add(l1);
        add(list);
        add(t1);
        
        setVisible(true);
        setTitle("Extra Form");
        setSize(210,240);
        setLayout(new FlowLayout());
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
public class extras {
    public static void main(String[] args) {
        controls c44 = new controls();
        c44.setControls_new2();
    }
    
}
