/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class Validations {

    public Validations() {
    }
       
    public boolean contaionsDigit(String s){
        return s.matches(".*\\d.*");
    }
    public boolean onlyDigits(String s){
        return s.matches("[0-9]+");
    }
    
    public boolean isEmpty(Object ob){
    //checking given object is not empty.
       if((ob.equals("")) || (ob == null)){
           return true;
       }
       else{
           return false;
       }
    }
    
    public boolean isFloat(String s){
        boolean r = true;
        for(int i = 0; i <s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) || (c == '.')){
                continue;
            }
            else{
                r = false;
                break;
            }
        }
        return r;
    }
    
public boolean isVallidYear(String s){
        boolean r = true;
        for(int i = 0; i <s.length(); i++){
            char c = s.charAt(i);
            if(Character.isDigit(c) || (c == '.') || (c == '/')){
                continue;
            }
            else{
                r = false;
                break;
            }
        }
        return r;
    }    
}
