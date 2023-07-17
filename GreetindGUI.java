/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

/**
 *
 * @author game
 */
public class GreetindGUI extends JFrame{

        private JPanel namePnl;
        private JPanel surnamePnl;
        private JPanel nameAndSurnamePnl;
        private JPanel greetingsAreaPnl;
        private JPanel btnPnl;
        private JPanel mainPnl;
        private JPanel headingPnl;
        
        private JLabel headingLbl;
        private JLabel nameLbl;
        private JLabel surnameLbl;
        
        private JTextField nameTxtFld;
        private JTextField surnameTxtFld;
        
        private JTextArea greetingdTxtArea;
        
        private JButton greetBtn;
        private JButton clearBtn;
        private JButton exitBtn;
        
    public GreetindGUI(){
        
        //configure the GUI
        setLayout(new BorderLayout());
        setTitle("Greetings UI");
        setSize(700, 750);
        setBackground(Color.yellow);
        
        //create the panels
        namePnl = new JPanel(new FlowLayout());
        surnamePnl = new JPanel(new FlowLayout());
        
        nameAndSurnamePnl = new JPanel(new GridLayout(2,1));
        
        greetingsAreaPnl = new JPanel(new FlowLayout());
        greetingsAreaPnl.setBorder(new TitledBorder(new LineBorder(Color.BLACK, 1), "Greetings"));
        
        btnPnl = new JPanel(new FlowLayout());
        mainPnl = new JPanel(new BorderLayout());
        
        headingPnl = new JPanel(new FlowLayout(FlowLayout.CENTER));
        headingPnl.setBorder(new BevelBorder(BevelBorder.RAISED));
        
        //creating the labels
        headingLbl = new JLabel("Greetings App");
        nameLbl = new JLabel("Name: ");
        surnameLbl = new JLabel("Surname: ");
        
        //create the text area
        nameTxtFld = new JTextField(20);
        surnameTxtFld = new JTextField(20);
        
        //create text area
        greetingdTxtArea = new JTextArea(40, 50);
        greetingdTxtArea.setEditable(false);
        greetingdTxtArea.setText("Hello [name] [surname]");
        
        //create the buttons
        greetBtn = new JButton("Greet");
        clearBtn = new JButton("Clear");
        exitBtn = new JButton("Exit");
        
        //add name label n textfield to the name panel
        namePnl.add(nameLbl);
        namePnl.add(nameTxtFld);
        
        //add name label n textfield to the name panel
        
        surnamePnl.add(surnameLbl);
        surnamePnl.add(surnameTxtFld);
        
       //add name n surname panel to the collective panel
        nameAndSurnamePnl.add(namePnl);
        nameAndSurnamePnl.add(surnamePnl);
        
        //add the greetingd area to its panel
        greetingsAreaPnl.add(greetingdTxtArea);
        
        //add buttons to their panel
        btnPnl.add(greetBtn);
        btnPnl.add(clearBtn);
        btnPnl.add(exitBtn);
        
        //add all the panels to the main panel
        mainPnl.add(nameAndSurnamePnl, BorderLayout.NORTH);
        mainPnl.add(greetingsAreaPnl, BorderLayout.CENTER);
        mainPnl.add(btnPnl, BorderLayout.SOUTH);
        
        //add the main panel to the frame's panel
        add(headingPnl, BorderLayout.NORTH);
        add(mainPnl, BorderLayout.CENTER);
        
        //make the frame visible
        setVisible(true);
        
        
        
        
        
    }
    
    
}
