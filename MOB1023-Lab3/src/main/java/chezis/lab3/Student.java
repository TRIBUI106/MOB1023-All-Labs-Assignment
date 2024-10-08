/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chezis.lab3;

/**
 *
 * @author Chezis P
 */
public class Student {
    
    public String name, major;
    public double marks;
    
    public String getGrade() {
        if(this.marks < 3){
            return "Kém";
        }
            if(this.marks < 5){
            return "Yếu";
        }
            if(this.marks < 6.5){
            return "Trung bình";
        }
            if(this.marks < 7.5){
            return "Khá";
        }
            if(this.marks < 9){
            return "Giỏi";
        }
            return "Xuất sắc";
    }
    
    public boolean isBonus(){
        return this.marks >= 7.5;
    }

    public Student(String name, String major, double marks) {
        this.name = name;
        this.major = major;
        this.marks = marks;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }
    
}
