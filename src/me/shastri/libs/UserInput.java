/**
 *
 * Author:              Shastri Harrinanan
 * Version:             1.0.1.0
 * Project Revision:    #001
 * Date Created:        22/10/2015
 * Date Modified:       25/10/2015
 * 
 * Commit Log:
 * #001 22/10/2015 0.0.0.0 - 0.1.0.0: Add date functionality
 * 
 * Current Status: Under Construction.
 * 
 */

package me.shastri.libs;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;


public class UserInput {
    public static String reqString(String prompt){
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(prompt + ": ");
        System.out.flush();
        try{
            return in.readLine();
        }catch(Exception e){
            return "The following error occurred: " + e.getMessage();
        }
    }
    
    public static int reqInt(String prompt){
        return Integer.parseInt(reqString(prompt));
    }
    
    public static double reqDouble(String prompt){
        return Double.parseDouble(reqString(prompt));
    }
    
    public static Date reqDate(String prompt){
        java.util.Date date = null;
        java.sql.Date sqlDate = null;
        String userDate = reqString(prompt + "\nPlease enter the date in the format dd-mm-yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = sdf.parse(userDate);
        } catch (ParseException e) {
            System.err.println(e);
        }
        if(date != null) sqlDate = new java.sql.Date(date.getTime());
        return sqlDate;
    }
}
