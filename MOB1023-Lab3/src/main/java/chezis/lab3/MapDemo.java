/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package chezis.lab3;


import chezis.lab3.view.QuanLySinhVien;
import java.util.*;

/**
 *
 * @author Chezis P
 */
public class MapDemo {

    public static void main(String[] args) {
        // Tạo Map để chứa các cặp tên và đối tượng Student
        Map<String, Student> map = new HashMap<>();

        // Tạo và bổ sung 3 sinh viên vào map
        Student sv1 = new Student();
        sv1.name = "Tuấn";
        sv1.major = "Ứng dụng phần mềm";
        sv1.marks = 7.0;
        map.put(sv1.name, sv1);

        Student sv2 = new Student();
        sv2.name = "Cường";
        sv2.major = "Phát triển phần mềm";
        sv2.marks = 8.5;
        map.put(sv2.name, sv2);

        Student sv3 = new Student();
        sv3.name = "Hậu";
        sv3.major = "Thiết kế trang web";
        sv3.marks = 5.0;
        map.put(sv3.name, sv3);

        // Duyệt qua các phần tử trong Map và xuất thông tin sinh viên ra màn hình
        Set<String> keys = map.keySet();
        for (String name : keys) {
            Student sv = map.get(name);
            System.out.println("> Họ và tên: " + sv.name);
            System.out.println("> Ngành học: " + sv.major);
            System.out.println("> Điểm     : " + sv.marks);
            System.out.println("> Học lực  : " + sv.getGrade());
            System.out.println();
        }
        
        System.out.println("\n\tchezis file running...\n");
        QuanLySinhVien panel = new QuanLySinhVien();
        panel.setVisible(true);
        
    }
}