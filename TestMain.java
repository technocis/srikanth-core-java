package com.technocis.students;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter Tamil Mark: ");
        int tam = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter English Mark: ");
        int eng = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter Maths Mark: ");
        int maths = Integer.parseInt(scan.nextLine());
        
        System.out.println("Enter social Mark: ");
        int social = Integer.parseInt(scan.nextLine());
        
        Students s1 = new Students(tam, eng, maths, social);
        
        int total = s1.totalSum(tam, eng, maths, social);
        System.out.println("Total: "+total);
        
	}

}
