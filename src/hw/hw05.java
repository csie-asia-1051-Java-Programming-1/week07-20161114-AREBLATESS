package hw;
import java.util.Scanner;
public class hw05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		long n=scn.nextInt();
		System.out.print(list(n));
	}
	public static long list(long v1){
		long a=0;
		if(v1==0){
			return ;
		}else{
			a=v1%10;
			v1=v1/10;
			System.out.print(a);
			return list(v1);
		}
	}
}
