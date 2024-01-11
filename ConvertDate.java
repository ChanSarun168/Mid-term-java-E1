/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.convertdate;
import java.util.Scanner;

public class ConvertDate {

    public static void main(String[] args) {
        String[] monthName = {"January" , "February" , "March" , "April" ,
                              "May" , "June" , "July" , "August" , "September" , "October" ,
                              "November" , "December"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a short date in the format YYYY-MM-DD: ");
        String shortDate = scanner.nextLine();
        String[] dateParts = shortDate.split("-");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        int i;
        String fullMonth = "";
         for(i=0;i<monthName.length;i++){
            if(month == i+1){
                fullMonth = monthName[i];
            }
        }
         System.out.print(fullMonth+' '+day+','+year);
    }
}
