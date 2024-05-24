package unit1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



 class controls extends JFrame{
      
     
    JLabel l1, l2, l3;
    JTextField t1,t2;
    JButton b1, b2, b3;
    
    public void setControls(){
        l1 = new JLabel("Enter 1st number");
        l2 = new JLabel ("Enter 2nd number");
        l3 = new JLabel("");
        t1 = new JTextField(20);
        t2 = new JTextField(20);
        b1 = new JButton(" Sum");
        
        b2 = new JButton("Clear");
        b3 = new JButton("Prime");
       
        
        add(l1);//1st
        add(t1);//1st num
        add(l2);//2nd
        add(t2);//2nd num
        add(b1);//add btn
        add(b2);//clear btn
        add(b3);
        add(l3);//result
        
// ----------------------------------Add action listener to the button-----------
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse numbers from text fields
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    int sum = num1 + num2;
                    

                    // Display the result
                    l3.setText("Result: " + sum);
                } catch (NumberFormatException ex) {
                    // Handle invalid input
                    l3.setText(ex.getMessage());
                    System.out.println(ex.getMessage());
                }
            }
        });
        
//---------------------------------Prime---------------------------        
             b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Parse numbers from text fields
                    int num1 = Integer.parseInt(t1.getText());
                    int num2 = Integer.parseInt(t2.getText());
                    
                    if (num1 > num2) {
                            int temp = num1;
                            num1 = num2;
                            num2 = temp;
                        }

                    int sum = 0;
                    for (int i = num1; i <= num2; i++) {
                        if (isPrime(i)) {
                            sum += i;
                        }
                    }

        l3.setText("The sum of prime numbers between " + num1 + " and " + num2 + " is: " + sum);
    }               
        catch (NumberFormatException ex) {
                    // Handle invalid input
                    l3.setText(ex.getMessage());
                    System.out.println(ex.getMessage());
                }
            }
        });

        //-----------------------clear screen-----------------------
         b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                t1.setText("");
                t2.setText("");
            }
            
        });
        
        setVisible(true);
        setSize(400,400);
        setLayout(new FlowLayout());
        setTitle("Calculation");
        setLocationRelativeTo(null);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }    
    public static boolean isPrime(int n) {
        if (n < 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
 



public class FirstProgram {
    public static void main(String[] args) {
        controls c1 = new controls();
        c1.setControls();
    }
    
    
}
        
