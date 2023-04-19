import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import Products.Product;
import VendingMachines.VendingMachine;

public class MyWindow extends JFrame{
    

 
    MyWindow(String probe){
        super(probe);
        

        JTextArea label = new JTextArea(probe);
        getContentPane().add(label);
        pack();

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // setSize(250, 100);


        }


        }
    

        // http://www.rv-lab.ru/it/JAVA/lesson8.htm