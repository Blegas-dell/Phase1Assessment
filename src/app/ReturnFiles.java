package app;

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ReturnFiles {
	public void userInput(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the file path: ");
		String path = scanner.nextLine();
		
		File folder = new File(path);
		if (folder.isDirectory())
		{
			File[] list = folder.listFiles();
			
			Arrays.sort(list);
			
			for(File file:list) {
				System.out.println(file.getName());
			}
			
		}
		
	}
}
