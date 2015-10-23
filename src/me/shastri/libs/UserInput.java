/**
 *
 * Author:              Shastri Harrinanan
 * Version:             1.0.0.0
 * Project Revision:    N/A
 * Date Created:        22/10/2015
 * Date Modified:       N/A
 * 
 */

package me.shastri.libs;

import java.io.BufferedReader;
import java.io.InputStreamReader;


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
}
