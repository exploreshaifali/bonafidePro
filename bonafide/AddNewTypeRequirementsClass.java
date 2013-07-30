/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class AddNewTypeRequirementsClass {
    //Constructors
    public AddNewTypeRequirementsClass() {
    }   
    public AddNewTypeRequirementsClass(String cgpa_sgpa, String address, String fee_structure, String year, String other_requirement1, String other_requirement2, String other_requirement3) {
        this.cgpa_sgpa = cgpa_sgpa;
        this.address = address;
        this.fee_structure = fee_structure;
        this.year = year;
        this.other_requirement1 = other_requirement1;
        this.other_requirement2 = other_requirement2;
        this.other_requirement3 = other_requirement3;
    }    
    
    
    //Getter methods
    public String getAddress() {
        return address;
    }

    public String getCgpa_sgpa() {
        return cgpa_sgpa;
    }

    public int getCount() {
        return count;
    }

    public String getFee_structure() {
        return fee_structure;
    }

    public String getOther_requirement1() {
        return other_requirement1;
    }

    public String getYear() {
        return year;
    }
     public String getOther_requirement2() {
        return other_requirement2;
    }

    public String getOther_requirement3() {
        return other_requirement3;
    }
    
    //Setter methods:

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCgpa_sgpa(String cgpa_sgpa) {
        this.cgpa_sgpa = cgpa_sgpa;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setFee_structure(String fee_structure) {
        this.fee_structure = fee_structure;
    }

    public void setOther_requirement1(String other_requirement1) {
        this.other_requirement1 = other_requirement1;
    }

    public void setOther_requirement2(String other_requirement2) {
        this.other_requirement2 = other_requirement2;
    }

    public void setOther_requirement3(String other_requirement3) {
        this.other_requirement3 = other_requirement3;
    }
    

    public void setYear(String year) {
        this.year = year;
    }
    
    
    
        
    //variables declaration
    private String cgpa_sgpa;
    private String address;
    private String fee_structure;
    private String year;
    private String other_requirement1;
    private String other_requirement2;
    private String other_requirement3;
    private int count = 0;
}
