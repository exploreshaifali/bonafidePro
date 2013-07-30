/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bonafide;

/**
 *
 * @author ishant0
 */
public class AllRequiredClass{

    public AllRequiredClass() {
    }
    
    public AllRequiredClass(String by_replace1) {        
        this.by_replace1 = by_replace1;
    }

    public AllRequiredClass(int admission_year, int completion_year, float cgpa, float sgpa, int in_sem, int pursuing_sem, String local_address, String permanent_address, String birth_date, String birth_place) {
        this.admission_year = admission_year;
        this.completion_year = completion_year;
        this.cgpa = cgpa;
        this.sgpa = sgpa;
        this.in_sem = in_sem;
        this.pursuing_sem = pursuing_sem;
        this.local_address = local_address;
        this.permanent_address = permanent_address;
        this.birth_date = birth_date;
        this.birth_place = birth_place;
    }

    public AllRequiredClass(float cgpa, float sgpa, int in_sem, int pursuing_sem) {
        this.cgpa = cgpa;
        this.sgpa = sgpa;
        this.in_sem = in_sem;
        this.pursuing_sem = pursuing_sem;
    }

    public AllRequiredClass(String local_address, String permanent_address) {
        this.local_address = local_address;
        this.permanent_address = permanent_address;
    }

    public AllRequiredClass(int admission_year, int completion_year, int pursuing_sem) {
        this.admission_year = admission_year;
        this.completion_year = completion_year;
        this.pursuing_sem = pursuing_sem;
    }
    
    
    
    //getter methods

    public int getAdmission_year() {
        return admission_year;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public float getCgpa() {
        return cgpa;
    }

    public int getCompletion_year() {
        return completion_year;
    }

    public int getIn_sem() {
        return in_sem;
    }

    public String getLocal_address() {
        return local_address;
    }
    

    public String getPermanent_address() {
        return permanent_address;
    }

    public int getPursuing_sem() {
        return pursuing_sem;
    }

    public float getSgpa() {
        return sgpa;
    }

    public String getOther_reqiurement1() {
        return other_reqiurement1;
    }

    public String getTo_replace1() {
        return to_replace1;
    }

    public String getBy_replace() {
        return by_replace1;
    }
 //Setter methods
    public void setBy_replace1(String by_replace1) {
        this.by_replace1 = by_replace1;
    }

    
    
        
    //Variable declarations.
    private int admission_year;
    private int completion_year;
    private float cgpa;
    private float sgpa;
    private int in_sem;
    private int pursuing_sem;
    private String local_address;
    private String permanent_address;
    private String birth_date;
    private String birth_place;   
    private String other_reqiurement1;
    private String to_replace1;
    private String by_replace1;
}
