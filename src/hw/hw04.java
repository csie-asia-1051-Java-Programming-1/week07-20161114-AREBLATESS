package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.print(gcd(m,n));
	}
	public static int gcd(int v1,int v2){
		int tank=0;
		if(v1%v2==0){
			return v2;
		}else{
			tank=v2;
			v2=v1%v2;
			v1=tank;
			return gcd(v1,v2);
			
	}
	
	}
}
