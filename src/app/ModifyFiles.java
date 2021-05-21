package app;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ModifyFiles {
	public void AddFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name of file you would like to create: ");
		String filename = scanner.nextLine();
		
		try {
			File myNewFile = new File(filename);
			if (myNewFile.createNewFile()) {
				System.out.println("File created: " + myNewFile.getName());
			} else {
				System.out.println("File already exists");
			}
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
	}
	
	public void DeleteFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Name of the file you would like to delete");
		String filename = scanner.nextLine();
		
		File myCurrentFile = new File(filename);
		if (myCurrentFile.delete()) {
			System.out.println("Deleted the file: " + myCurrentFile.getName());
			} else {
			System.out.println("Failed to delete the file. File Not Found.");
		}
		
	}
	
	public void SearchFile() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("What is the name of the file you would like to search for?");
		String filename = scanner.nextLine();
		
		File directory = new File("C:");
		FilenameFilter filter = new FilenameFilter() {

			public boolean accept(File dir, String name) {
				return name.contains(filename);
			}
			
		};
	    String[] children = directory.list(filter);
	    if (children == null) {
	       System.out.println("Either dir does not exist or is not a directory"); 
	    }if (children.length==0) {
		   System.out.println("No files were found matching your description."); 
		}else { 
	       for (int i = 0; i< children.length; i++) {
	          String file = children[i];
	          System.out.println("File retrieved: " + file);
	       } 
	    } 
	}
}
