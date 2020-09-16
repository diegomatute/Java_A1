/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.diegomatute.assignment1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * Contains main program code. This class generates a report of
 * a worker's pay.
 *
 * @author Diego Matute
 * @version 1.0
 * @since 9/8/2020
 * 
 */
public class Main { 
    /**
     * This method reads in data from a file and outputs data to a new file.
     * 
     * @param args Contains the supplied command-line arguments as an
     * array of string.
     * @throws FileNotFoundException  Throws an exception FileNotFoundException.
     */
    public static void main(String args[]) throws FileNotFoundException
{
    
    String fName, lName, outfile;
    
    int id, shiftCount, month, day, year;
    
    double payRate, hoursWorked, pay;

    
    
    
    //Scanner for user input 
    Scanner input = new Scanner(System.in);
    String filename; 
   
    //Prepare the input file
    System.out.printf("Enter input file name: \n");
    //Users input is now "filename" string
    filename = input.nextLine(); 
    
    
    //Prepare output file
    System.out.printf("Enter output file name: \n");
    outfile = input.nextLine();
    
    
    //******************************************************
    //PrintStream enables data to be written to 
    // a new file. 
    //******************************************************
    PrintStream output = new PrintStream(outfile);
     
    
    
    
    //Read from file
    FileReader fr = new FileReader(filename);
    //Obtains data from a file
    Scanner infile = new Scanner(fr);
    
    
    //Reads data from input file 
    
    fName = infile.nextLine();
    
    
    lName = infile.nextLine();
    
    
    id = infile.nextInt();
    
    payRate = infile.nextDouble();
    
    shiftCount = infile.nextInt();
 
    
    //Outputs to a file
    
    output.println("Payroll Report");
    
    output.println("--------------");
    
    //Prints First: Rose
    output.printf("First: %4s\n", fName);
    
    //Prints Last: Diaz
    output.printf("Last: %4s\n", lName);
    
    //Prints Id: 1
    output.printf("Id: %1d\n", id);
    
    //Prints Pay Rate: 20.00
    output.printf("Pay Rate: %4.2f\n", payRate);
    
    //Prints empty line
    output.println(" ");
    
    //Prints Header
    output.printf("%8s %8s %8s %16s %10s", "Month", "Day", "Year", 
            "Hours Worked", "Pay\n");
    
    output.printf("%8s %8s %8s %16s %11s", "-----", "---", "----", 
            "------------", "--- \n");
    
    
    //During loop 
   
    //Global variables sumHrs and sumPay
    double sumHrs = 0, sumPay = 0;
    
    //*********************************************************
    // For loop processes one record at a time from the file  
    // as long as integer i is less than or equal to the 
    // number of shifts (shiftCount)+2. Double "pay" is then
    // calculated by multiplying hoursWorked by payRate. 
    // Doubles hoursWorked and totalPay are continuously added
    // The data stored is then displayed on the outfile in 
    // column form.
    // 
    //*********************************************************
    for(int i =0; i <= shiftCount+2; i++)
    {
        
        month = infile.nextInt();
        
        day = infile.nextInt();
        
        year = infile.nextInt();
        
        hoursWorked = infile.nextDouble();

        pay = hoursWorked * payRate; 
         sumHrs += hoursWorked;
         sumPay += pay;
       
        output.printf("%8d %8d %8d %16.2f %10.2f\n", month, day, year,
                hoursWorked, pay);
        i++;
        
        
    }
    
    output.printf("%8s %8s %8s %16s %12s", "-----", "---", "----", 
            "------------", "-------- \n");
    
    //Prints final line of report.
    output.printf("%8s %34.2f %10.2f", "Total", sumHrs, sumPay);
 
    
}
}