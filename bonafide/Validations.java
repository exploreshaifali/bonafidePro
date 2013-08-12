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

public boolean isVallidName(String name, StringBuilder error){
    if(name.trim().length() < 4 || name.trim().length() > 40){
        error.append(" Name length must be in between 4-40.");
        return false;
    }
    if(!name.matches("^[A-Za-z\\s.-]+")){
        error.append(" Name can have only characters.");
        return false;
    }
    return true;
}

public boolean isVallidRollnumber(String rollnum, StringBuilder error){    
    if(rollnum.trim().length() < 8 || rollnum.trim().length() > 15){ 
        error.append(" Rollnumber length must be greater than 8 and smaller than 15");
        return false;        
    }
    //atleast one character
    if(!rollnum.matches(".*^[A-Za-z]+.*")){
        error.append(" Rollnumber must start with alphabate.");
        return false;    
    }
    //atleast one number
    if(!rollnum.matches(".*\\d.*")){        
        error.append(" Rollnumber must contain digits also.");
        return false;
    }
    if(rollnum.matches("(.)\\1,2{3,}(\\b)")){  
        error.append("Error####");
        return false;
    }  
    //Cannot have ant special character other than '-'.
    if (!rollnum.matches("^[A-Za-z0-9-/]+")){
        error.append(" Rollnumber cannot have any special character other than '-'.");
        return false;
    }
    return true;
     
}


}
