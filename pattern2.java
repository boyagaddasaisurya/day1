package javaday5;

public class pattern2 {

	public static void main(String[] args) {
		int max=80;
		
		for(int r=1;r<=8;r++) {
			for(int i=1;i<=max;i++) {
				System.out.print(" ");
			}
			for(int c=1;c<=r;c++) {
				System.out.print(r+"  ");
				}
			System.out.println();
			max=max-2;
		}
		

	}

}
