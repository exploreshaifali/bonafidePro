/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;
import java.awt.*;

/**
 *
 * @author ishant0
 */
public class EventDemo extends Frame{
    EventDemo(){ initComponents();}
    void initComponents(){
        t1 = new TextField();
        t2 = new TextField();
        b1 = new Button("copy");
        b2 = new Button("clear");
        setLayout(new FlowLayout());
        setSize(500, 450);
        setVisible(true);
    }
    
    public static void main(String args[]){
        EventTest ob = new EventTest();  
    }
    
  private TextField t1;
  private TextField t2;
  private Button b1;
  private Button b2;
}
