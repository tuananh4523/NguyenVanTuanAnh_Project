import java.util.Scanner;

public class Bai1 
{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Nhap vao so thu nhat: ");
	double so1 = sc.nextDouble();
	System.out.println("Nhap vao so thu hai: ");
	double so2 = sc.nextDouble();
	
	System.out.println("Tong cua hai so la: " + (so1+so2));
	System.out.println("Hieu cua hai so la: " + (so1-so2));
	System.out.println("Tich cua hai so la: " + (so1*so2));
	System.out.println("Thuong cua hai so la: " + (so1/so2));
	System.out.println("Chia lay du cua hai so la: " + (so1%so2));
	
	if(so1 > so2) {
		System.out.println(so1 + " lon hon " + so2);
	}else if(so1 < so2) {
		System.out.println(so1 + " nho hon " + so2);
	}else {
		System.out.println(so1 + " bang " + so2);
	}
	}
}

