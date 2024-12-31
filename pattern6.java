package javaday5;

public class pattern6 {

	public static void main(String[] args) {
		int mc=4,sp=20;
		for(int t=1,i=1;t<=4;t++,i++) {
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			for(int c=i;c<=mc;c++) {
				System.out.print(c+"   ");
			}
			System.out.println();
				sp = sp+2;	
		}
		sp = sp-4;
		// lower
		for(int r=1,v=3;r<=3;r++) {//
			for(int k=1;k<=sp;k++) {
				System.out.print(" ");
			}
			for(int c=v;c<=4;c++) {
				System.out.print(c+"   ");
			}
			System.out.println();
			v--;
			sp = sp-2;
		}
		
		
		
	}



	}


