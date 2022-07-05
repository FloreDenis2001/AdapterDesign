package com.company;

//import java.util.List;

public class Pupil {
    private String firstName;
    private String lastName;
    private String email;
    private Integer age;
    private Integer finalGrade;

    public Pupil(String firstName, String lastName, String email, Integer age, Integer finalGrade) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.finalGrade = finalGrade;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public String getEmail() {
        return email;
    }


    public Integer getAge() {
        return age;
    }


    public Integer getFinalGrade() {
        return finalGrade;
    }


}
