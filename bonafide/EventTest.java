/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  


/**
 *
 * @author ishant0
 */
public class EventTest {
    
   
//ACTION EVENT

private JTextField inputField = new JTextField(10);  
private JButton appendButton = new JButton("append");  
private JTextArea logArea = new JTextArea(10, 30);  
private ActionListener listener = new ActionListener() {  
public void actionPerformed(ActionEvent evt) {  
String line = inputField.getText().trim();  
inputField.setText("");  
if (line.length()>0){  
logArea.append(line);  
logArea.append("\n");  
}  
inputField.requestFocusInWindow();  
}  
};  
   
public EventTest() {  
inputField.addActionListener(listener);  
appendButton.addActionListener(listener);  
logArea.setEditable(false);  
}  
   
public void launchGUI() {  
JPanel p = new JPanel();  
p.add(new JLabel("Enter text:"));  
p.add(inputField);  
p.add(appendButton);  
JFrame f = new JFrame("ActionListenerExample");  
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
f.getRootPane().setDefaultButton(appendButton);  
Container cp = f.getContentPane();  
cp.add(new JScrollPane(logArea), BorderLayout.CENTER);  
cp.add(p, BorderLayout.SOUTH);  
f.pack();  
f.setLocationRelativeTo(null);  
f.setVisible(true);  
}  
   
public static void main(String[] args) {  
EventQueue.invokeLater(new Runnable(){  
public void run() {  
new EventTest().launchGUI();  
}  
});  
    }  
}     

