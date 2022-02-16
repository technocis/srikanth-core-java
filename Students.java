package com.technocis.students;


public class Students {
   
	int tam, eng, maths, social;

	public Students(int tam, int eng, int maths, int social) {
		this.tam = tam;
		this.eng = eng;
		this.maths = maths;
		this.social = social;
	}
    
	public int totalSum(int tam, int eng, int maths, int social)  
	{   
		int total = tam + eng + maths + social;
		return total;
	}
	
}
