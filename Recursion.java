package dsa;

public class Recursion {
	public static void fun(int n) {
		if (n == 0)
			return;
		System.out.println(n);
		fun(n-1);
	}
	
	public static void main() {
		// TODO Auto-generated method stub
		fun(3);
	}

}
