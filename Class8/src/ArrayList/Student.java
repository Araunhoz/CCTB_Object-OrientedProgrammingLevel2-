package ArrayList;

import java.util.Collections;
import java.util.ArrayList;

public class Student {
	
	public static void main(String[] args) {
		
		
		System.out.println("-----ClassList-----");
        System.out.println("          .,\n"
        	    + ".      _,'f----.._\n"
        		+ "|\\ ,-'\"/  |     ,'\n"
        		+ "|,_  ,--.      /\n"
        		+ "/,-. ,'`.     (_\n"
        		+ "f  o|  o|__     \"`-.\n"
        		+ ",-._.,--'_ `.   _.,-`\n"
        		+ "`\"' ___.,'` j,-'\n"
        		+ "  `-.__.,--'"
        		);
        System.out.println("-------------------");
		ArrayList<String> studentNames = new ArrayList<String>();
		addStudents(studentNames);
		showStudents(studentNames);
		Collections.sort(studentNames);
		System.out.println("");
		System.out.println("____Sorted Names____\n");
		showStudents(studentNames);
		
	}
    
	public static void addStudents(ArrayList<String> studentNames) {
		
		studentNames.add("Luciano Kikao do Forro");
		studentNames.add("Nego do Borel Tum Tum");
		studentNames.add("Mc Catra");
		studentNames.add("Thiaguinho do Pagode");
		studentNames.add("Markinho Ka Tchau");

	}

	public static void showStudents(ArrayList<String> studentNames) {
		
		for (String student : studentNames)
			System.out.println("Student Name: " + student);
		
	}
}