package mentoring2;

public class IfElse {

	
	public static void main(String[] args) {
		
		int testScore =70;
		String grade;
		
		if (testScore >90) {
			grade= "A";
		}else if (testScore> 80) {
			grade ="B";
		}else if (testScore> 70) {
				grade ="C";
		}else if (testScore >60) {
			 grade= "D";
		}else if (testScore <65) {
			grade= "E";
		}else {
			grade= "F";
		}
		System.out.println(" your grade is :" +grade);
	
	}
	}
		
		
		
		
	
	

