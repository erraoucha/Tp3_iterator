package com.erraoucha;

import java.time.LocalDate;

public class Person {
    
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    

    public Person(String firstname, String lastname, LocalDate birthdate) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthdate = birthdate;
    }
    public Person (){

    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
 
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

   

    
    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }
    
    


    public int calculateAge(){
        return LocalDate.now().getYear()-birthdate.getYear();
    }
    

}
