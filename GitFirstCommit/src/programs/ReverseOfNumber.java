package programs;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int num=1234,rev=0;
		while(num!=0) {
			int rem=num % 10;
			rev =rev *10 +rem;
			num=num/10;
		}
		System.out.println("Reverse of Number:"+rev);
	}
}
