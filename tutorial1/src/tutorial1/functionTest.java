package tutorial1;

public class functionTest {
	public static double add(double a, double b) {
		double resoult;
		resoult=a+b;
		return resoult; 
	}
	public static void fibo(int n) {
		//int num1=0, num2=1, num3;
		double num1=0, num2=1, num3;
		System.out.println("1- "+num1+"\n"+"2- "+num2);
		for(int i=2;i<n;i++) {
			num3= add(num1,num2);
			System.out.println(i+"- "+num3);
			num1=num2;
			num2=num3;
		}
		
	}

	public static void main(String[] args) {
		int count;
		count=100;
		fibo(count);
	}

}
