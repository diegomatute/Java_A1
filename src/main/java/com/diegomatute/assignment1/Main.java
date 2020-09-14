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
    String outFile;
    
    
    //Scanner for user input 
    Scanner input = new Scanner(System.in);
    String filename; //"inputFile.txt";
   
    //User names input file
    //Prepare the input file
    System.out.printf("Enter input file name: \n");
    filename = input.nextLine(); //.trim();
    
    FileReader fr = new FileReader(filename);
    Scanner infile = new Scanner(fr);
    System.out.print(filename);
    
    /* Scanner inputScanner;
    inputScanner = new Scanner(new FileReader(filename));
    */

    
 
    //Scanner infile = new Scanner(fr);
    //File input = new File(inFile);
    
    
    
    
    
    
    
}
    
    
    
}
