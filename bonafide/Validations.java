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
    
    public boolean isEmpty(Object... ob){
    //checking given object is not empty.
        for(Object o : ob){
       if((o.equals("")) || (o == null)){
           return true;
       }
        }
           return false;
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

public boolean isVallidName(String s){
    if(s.length() < 6 || s.length() > 40){
        System.out.println("lenght problem");
        return false;
    }
    return s.matches("^[A-Za-z\\s.-]+");
}

public boolean isVallidRollnumber(String s){
    if(s.length() < 9 || s.length() > 15){
        return false;
    }
    //atleast one character
    if(s.matches(".*^[A-Za-z]+.*")){
        System.out.println("not a single character!!");
        return false;
    }
    //atleast one number
    if(!s.matches(".*\\d.*")){
        System.out.println("not a single digit!");
        return false;
    }
    if(s.matches("(.)\\1,2{3,}(\\b)")){
        return false;
    }
    return s.matches("^[A-Za-z0-9-/]+");
}


}
