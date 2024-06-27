package unit1;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class controls_new extends JFrame{
    JLabel l1,l2,l3,l4,l5, l6,l7,l8;
    JTextField t1,t4;
    JPasswordField t2,t3;
    JButton b1;
    JRadioButton r1;
    JRadioButton r2;
    JCheckBox c1, c2, c3;
    JComboBox com1;
    
    
    
    public void setControls_new(){
        l1= new JLabel("Enter name");
        l2= new JLabel("Enter Password");
        l3= new JLabel("Confirm Password");
        l4= new JLabel("Enter Email");
        l5= new JLabel(""); 
        //----Radiobtn label
        l6= new JLabel("Gender");
        //----CheckBox label
        l7= new JLabel("Cource");
        //----DropDown// ComboBox label
        l8= new JLabel("Country");
        
        
        t1= new JTextField(20);
        t2= new JPasswordField(20);
        t3= new JPasswordField(20);
        t4= new JTextField(20);
        b1 = new JButton("Submit");
        
        //-------------------Radio Button------------------
        r1=new JRadioButton("Male");    
        r1.setBounds(100,50,100,30);      
        r2=new JRadioButton("Female");    
        r2.setBounds(100,100,100,30); 
        ButtonGroup bg=new ButtonGroup();   
        bg.add(r1);
        bg.add(r2);
        
        //----------------------checkBox------------------
        c1 = new JCheckBox("C++");    
        c2  = new JCheckBox("Java");  
        c3  = new JCheckBox("DotNet");  

        
        
        //-----------------Drop Down// JComboBox----------------
        String country[]={"Nepal","India","U.S.A","England"};        
         com1=new JComboBox(country);  
         
         
         
         //-------------------------Form Validation------------------         
         
    b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText().trim();
                String email = t4.getText().trim();
                String password = new String(t2.getPassword());
                String con_password = new String(t3.getPassword());

                if (name.isEmpty()) {
                    l5.setText("Name is required.");
                } else if (email.isEmpty()) {
                    l5.setText("Email is required.");
                } else if (password.isEmpty()) {
                    l5.setText("Password is required.");
                } else if (con_password.isEmpty()) {
                    l5.setText("Confirm Password is required.");
                } else if (!password.equals(con_password)) {
                    l5.setText("Passwords do not match.");
                } else if (!r1.isSelected() && !r2.isSelected()) {
                    l5.setText("Gender is required.");
                } else if (!c1.isSelected() && !c2.isSelected() && !c3.isSelected()) {
                    l5.setText("At least one course must be selected.");
                } else {
                    StringBuilder message = new StringBuilder();
                    message.append("Hi ").append(name).append(", Your email is ").append(email);
                    message.append(", Your password is ").append(password);

                    if (r1.isSelected()) {
                        message.append(", You are male");
                    } else if (r2.isSelected()) {
                        message.append(", You are female");
                    }

                    message.append(", Courses: ");
                    if (c1.isSelected()) {
                        message.append("C++ ");
                    }
                    if (c2.isSelected()) {
                        message.append("Java ");
                    }
                    if (c3.isSelected()) {
                        message.append("DotNet ");
                    }

                    message.append(", Country: ").append(com1.getSelectedItem());

                    l5.setText(message.toString());
                }
            }
        });
         

          
       
           
        

        setLayout(new GridLayout(19,16,0,-2));
        add(l1);add(t1);
        add(l2);add(t2);
        add(l3);add(t3);
        add(l4);add(t4);
        //-------radiobtn
        add(l6);
        add(r1);
        add(r2);
        //-------CheckBox
        add(l7);
        add(c1);add(c2);add(c3);
        //------dropdown/combobox
        add(l8);
        add(com1);
        //-------Submit btn
        add(b1);
        //------Display Label
        add(l5);
        

        



        
        
        setVisible(true);
        setTitle("MyForm");
        setSize(320,390);
        
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        
    }
}




public class SecondProgram {
    public static void main(String[] args) {
        controls_new c2 = new controls_new();
        c2.setControls_new();
    }
    
}
