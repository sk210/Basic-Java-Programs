
public class CoutOfDigits {

	public static void main(String[] args) {
		int n= 34525687;
		int count=0;
		while(n!=0) {
			n/=10;
			count++;
		}
		System.out.println("The cout of number is " + count);

	}

}
