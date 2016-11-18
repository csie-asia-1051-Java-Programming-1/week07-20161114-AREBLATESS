package hw;

import java.util.Scanner;

public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.print(C(m)/C(n)/C(m-n));
		}
	public static int C(int v1){
		if(v1==1){
			return 1;
		}else{
			return v1 * C(v1-1);
		}
	}
	
}
