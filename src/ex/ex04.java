package ex;
/*
 * Date: 2016/11/14
 * Author: 105021008 ³¯Ú­µ{ 
 */
import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		System.out.print(fac(a));
		}
	public static int fac(int v1){
		if(v1==1){
			return 1;
		}else{
			return v1 * fac(v1-1);
		}
	}
	
}
