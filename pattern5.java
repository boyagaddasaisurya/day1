package javaday5;
public class pattern5 {
    public static void main(String[] args) {
		for(int r =1 ;r<=4;r++) {
			if(r % 2 == 0) {
			for(int c=1,p=0;c<=r;c++) {
					System.out.print(p+" ");
					if(p==1) p=0;
					else p=1;
				}
			}
			else {
				
				for(int c=1,p=1;c<=r;c++) {
					
					System.out.print(p+" ");
					if(p==1) p=0;
					else p=1;
				}
			}
			System.out.println();
		}
	}
	
}
