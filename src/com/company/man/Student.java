package com.company.man;

public class Student extends Man {
    private int yearOfStudy=0;
    private static void yearOfStudy(){
        Student yearOfStudy=new Student();
    }
    public void increaseYearOfStudy (){
        if ( yearOfStudy == 0){
            yearOfStudy=1;
        }
        yearOfStudy++;
    }
}