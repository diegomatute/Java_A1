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
    String outFile;
    
    
    //Scanner for user input 
    Scanner input = new Scanner(System.in);
    String filename; //"inputFile.txt";
   
    //User names input file
    //Prepare the input file
    System.out.printf("Enter input file name: \n");
    filename = input.nextLine(); //.trim();
    System.out.printf(filename);
    
    //Read from file
    FileReader fr = new FileReader(filename);
    Scanner infile = new Scanner(fr);
    //System.out.print(filename);
    
    /* Scanner inputScanner;
    inputScanner = new Scanner(new FileReader(filename));
    */

    fName = infile.nextLine();
    System.out.printf(fName);
    
    lName = infile.nextLine();
    System.out.printf(lName);
    //Scanner infile = new Scanner(fr);
    //File input = new File(inFile);
    
    //outfile
    String outfile;
    System.out.printf("Enter out file name: \n");
    outfile = input.nextLine();
    System.out.printf(outfile);
    PrintStream output = new PrintStream(outfile);
    //out.println(fName); 
    
     //outfile.printf("result = %d\n", result);
     
    /*
FirstName
LastName
Id
Payrate
ShiftCount
Month
Day
Year
HoursWorked
Month
Day
Year
HoursWorked

    */
}
}

//Writes to a file from main

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