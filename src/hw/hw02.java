package hw;
import java.util.Scanner;
public class hw02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a=scn.nextInt();
		System.out.print(ofdigits(a));
	}
	public static int ofdigits(int v1){
		if(v1/10==0){
			return 1;
		}else{
			return 1+ofdigits(v1/10);
		}
	}

}
