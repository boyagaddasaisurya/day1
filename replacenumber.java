package thirdday;


public class replacenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,p=1,res=0;
		int n=89649;
		System.out.println("enter number");
	    while(n!=0) {	
		r=n%10;
		if(r==9)r=3;
		n=n/10;
		res=res+r*p;
				p=p*10;
	}
	System.out.println(res);
	}
}



