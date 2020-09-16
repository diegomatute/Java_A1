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
 *
 * @author diegomatute
 */
public class Main { 
    public static void main(String args[]) throws FileNotFoundException
{
    //System.out.printf("Hello world\n");
    String fName;
    String lName;
    int id, shiftCount, month, day, year;
    double payRate, hoursWorked;
    String outfile;
    double pay; // hours worked * pay rate 
    
    
    
    //Scanner for user input 
    Scanner input = new Scanner(System.in);
    String filename; //"inputFile.txt";
   
    //User names input file
    //Prepare the input file
    System.out.printf("Enter input file name: \n");
    filename = input.nextLine(); //.trim();
    //System.out.printf(filename);
    
    //outfile
    System.out.printf("Enter output file name: \n");
    outfile = input.nextLine();
    //System.out.printf(outfile);
    PrintStream output = new PrintStream(outfile);
    //out.println(fName); 
    
    //outfile.printf("result = %d\n", result);
    
    //Read from file
    FileReader fr = new FileReader(filename);
    Scanner infile = new Scanner(fr);
    //System.out.print(filename);
    
    //Read data from input file 
    //Before loop
    fName = infile.nextLine();
    //System.out.printf(fName);
    
    lName = infile.nextLine();
    //System.out.printf(lName);
    //Scanner infile = new Scanner(fr);
    //File input = new File(inFile);
    
    id = infile.nextInt();
    payRate = infile.nextDouble();
    
 
    //During loop 
    shiftCount = infile.nextInt();
   /* 
    for(int i =0; i<shiftCount; i++)
    {
        
        month = infile.nextInt();
        day = infile.nextInt();
        year = infile.nextInt();
        //System.out.printf("%d\n", year);
        hoursWorked = infile.nextDouble();
        //System.out.printf("%f\n", hoursWorked);
        pay = hoursWorked * payRate; 
        output.printf("%10d %10d %6d %18f %6f", month, day, year, hoursWorked, pay);
        
        i++;
    }
    */
    
    //output to a file
    output.println("Payroll Report");
    
    output.println("---------------");
    
    //Prints First: Rose
    output.printf("First: %4s\n", fName);
    
    //Prints Last: Diaz
    output.printf("Last: %4s\n", lName);
    
    output.printf("Id: %3d\n", id);
    
    output.printf("Pay Rate: %4.2f\n", payRate);
    //outfile.printf("result = %d\n", result);
    
    //Prints empty line
    output.println(" ");
    
    
    output.printf("%8s %8s %8s %16s %10s", "Month", "Day", "Year", "Hours Worked", "Pay\n");
    
    output.printf("%8s %8s %8s %16s %11s", "-----", "---", "----", "------------", "--- \n");
    
    
    
   double sumHrs = 0, sumPay = 0;
    for(int i =0; i <= shiftCount+2; i++)
    {
        
        month = infile.nextInt();
        day = infile.nextInt();
        year = infile.nextInt();
        //System.out.printf("%d\n", year);
        hoursWorked = infile.nextDouble();
        //System.out.printf("%f\n", hoursWorked);
        pay = hoursWorked * payRate; 
         sumHrs += hoursWorked;
         sumPay += pay;
       
        output.printf("%8d %8d %8d %16.2f %10.2f\n", month, day, year, hoursWorked, pay);
        i++;
        
        
    }
    
    output.printf("%8s %8s %8s %16s %12s", "-----", "---", "----", "------------", "-------- \n");
    

  
         output.printf("%8s %34.2f %10.2f", "Total", sumHrs, sumPay);
 
    
    //output.printf("%8s %30f %10f", "Total" );
    
}
}

//Rewrites contents from a file from main

   /* PrintStream ps = null;
    
    try
    {
        ps = new PrintStream(filename);
    }
    catch (Exception e)
    {
        System.out.println("Error could not open file \n");
    }
    
    ps.println("Hello, Diego \n");
    */