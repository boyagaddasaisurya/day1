package day6;
import java.util.Scanner;
public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter long number");
		long num = sc.nextLong();
		long r;
		int[] count = {
				0,0,0,
				0,0,0,
				0,0,0,0
				};
		while(num != 0) {
			r = num % 10;
			num = num /10;
			count[(int)r]++;
		}
		for(int c=0;c<10;c++) {
			if(count[c] > 0)
			System.out.println(c+" of elements--->"+count[c]);
		}	
	}
}


