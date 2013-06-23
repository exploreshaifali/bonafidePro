/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author ishant0
 */
public class DynamicCheckboxes {
    //declare private fields
 private ArrayList<String> titles; //arraylist for titles
 private JFrame frame;
 private ArrayList<JCheckBox> checks; //array of checkboxes
 private JPanel panel;
 private JButton button;
 private JLabel result;
 private JCheckBox chk;
 
 //constructor that calls the methods
 //and initializes the checkbox array
 public DynamicCheckboxes(){
  fillArray();
  checks = new ArrayList();
  createCheckBoxes();
 }
 
 private void fillArray(){
  //this method populates the array
  //manually--you could do this
  //dynamically with user input
  titles=new ArrayList();
  titles.add("Foundation Trilogy");
  titles.add("lord of the Rings");
  titles.add("1@84");
  titles.add("The Martian Chronicles");
 }
 
 private void createCheckBoxes(){
  //set up the frame
  JFrame frame=new JFrame();
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  
  //call the method to create the panel
  createPanel();
  //add the panel to the frame and make it visible
  frame.add(panel);
  frame.setBounds(100,100,300,300);
  frame.setVisible(true);
 }
 
 private void createPanel(){
  //initialize the panel
  panel = new JPanel();
  panel.setLayout(new GridLayout(0,1,5,5));
  //loop through the title array
  for (String s:titles){
    //create a new checkbox 
   //for each string in the array
    chk=new JCheckBox(s);
    //add the checkbox to the panel
    panel.add(chk);
    //add the checkbox to the array
    //of checkboxes
    checks.add(chk);
  }
  
  //add a button
  button=new JButton("Test");
  //assign a listener
  button.addActionListener(new buttonListener());
  //add it to the panel
  panel.add(button);
  
  //add a label to show the results
  result = new JLabel();
  panel.add(result);
  
  
 }
 
 private class buttonListener implements ActionListener{
  /*
   * (non-Javadoc)
   * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
   * This class responds to the button click
   */
  @Override
  public void actionPerformed(ActionEvent arg0) {
   String s="";
   //loop through the array of checkboxes
   //and get the text of each checkbox
   //that is checked
   for (JCheckBox ck:checks){
    if(ck.isSelected()){
    s += ck.getText() + ", ";
    }
   }
   //display the results
   result.setText(s);
  }
  
 }

public static void main(String args[]){
    new DynamicCheckboxes();
}
}
