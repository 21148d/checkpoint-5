import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import java.lang.Number;

/**
 * 
 * CSCU9T4 Java strings and files exercise.
 * Solution for First Part of Practical T4 Practical 4
 *
 */
public class FilesInOut {

	public static void main(String[] args) throws FileNotFoundException {
		
		//Right Click on Java File -->Show in Terminal 
		//Command Line  "java FilesInOut input.txt formatted.txt"
		
		
		// Replace this with statements to set the file name (input) and file name
		// (output).
		// Initially it will be easier to hardcode suitable file names.

		// Set up a new Scanner to read the input file.
		// Processing line by line would be sensible here.
		// Initially, echo the text to System.out to check you are reading correctly.
		// Then add code to modify the text to the output format.

		// Set up a new PrintWriter to write the output file.
		// Add suitable code into the above processing (because you need to do this line
		// by line also.
		// That is, read a line, write a line, loop.

		// Finally, add code to read the filenames as arguments from the command line.

		// System.out.println("You need to add your own code to do anything");

		int Option = 2;

		String inputFile = "2";
		String outputFileName = "2";
		//input file name
		inputFile = args[0];
		//output file name from the argument
		outputFileName = args[1];
		File inputFileN = new File(inputFile);

		Scanner in = new Scanner(inputFileN);

		PrintWriter out = new PrintWriter(outputFileName);

		System.out.println("Output is sent to file... Please check the folder");

		while (in.hasNextLine()) {
			String Line = in.nextLine();

			StringTokenizer st;
			st = new StringTokenizer(Line);

			while (st.hasMoreTokens()) {
				String Word1 = st.nextToken();
				String Word2 = st.nextToken();
				String Word3 = st.nextToken();

				String W1="";
				String W2="";
				// For Word 1 - First Letter Capital Letter
				String W11 = Word1.substring(0, 1);
				String W12 = W11.toUpperCase();				
				String W14 = Word1.substring(1);
				 W1 = W12 + W14;
				
				// For Word 2 -First Letter Capital Letter
				String W21 = Word2.substring(0, 1);
				String W22 = W21.toUpperCase();					
				String W24 = Word2.substring(1);
				W2 = W22 + W24;
				//for date format
				String W31 = Word3.substring(0, 2);
				String W32 = Word3.substring(2, 4);
				String W33 = Word3.substring(4);
				String W3 = W31 + "/" + W32 + "/" + W33;

				out.printf("%s %s %s\n", W1, W2, W3);
			}

		}

		in.close();
		out.close();

	} // main

	} // FilesInOut
