package Empwage;

public class salary {

	public static void main(String[] args) {
		int Present = 1;
		int EmpRatePerhrs = 20;
		
		int emphrs = 0;
		int empwage = 0;
		
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == Present )
		emphrs = 8;
		else
		emphrs = 0;
		empwage = emphrs*EmpRatePerhrs;
		System.out.println("empwage > " + empwage);

	}

}
