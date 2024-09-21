/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4.lib;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Chezis P
 */
public class XDate {
    
    private static SimpleDateFormat dateFormat = new SimpleDateFormat();
    
    public static Date parse(String text, String pattern) throws ParseException {
        dateFormat.applyPattern(pattern);
        return dateFormat.parse(text);
    }
    
    public static Date parse(String text) throws ParseException {
        return XDate.parse(text, "dd-mm-yyyy");
    }
    
}
