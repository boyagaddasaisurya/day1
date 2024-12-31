package javaday5;

public class pattern4 {

	public static void main(String[] args) {
for(int rows=1;rows<=20;rows++) {
			System.out.print("\t");
			if(rows == 1 || rows == 30) {
				for(int cols=1;cols<=55;cols++) {
					System.out.print("*");
				}
			}
			else {
				for(int cols=1;cols<=55;cols++) {
					if(cols== 1 || cols == 55) {
						System.out.print("*");	
					}
					else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}
