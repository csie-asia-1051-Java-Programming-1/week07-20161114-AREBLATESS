package hw;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int z=scn.nextInt();
		System.out.print(lcm(x,y,z));
	}
	public static int lcm(int v1,int v2,int v3){
		int tank=0;
		int GCD1=0;
		int GCD2=0;
		if(tank!=1 && tank!=0 ){
		v1=v1%v2;
		tank=v1;
		v1=v2;
		v2=tank;
		GCD1=v1/v2;
		}
		if(tank!=1 && tank!=0 ){
			v3=v3%GCD1;
			tank=v3;
			v3=GCD1;
			GCD1=tank;
			GCD2=v3/GCD1;
			}
		return GCD2;
	}

}
