package java03;

import java.util.Scanner;
public class TestBoolean {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("请输入张三成绩：");
		int zhangScore= in.nextInt();
		int liScore=80;
		System.out.println("张三成绩大于李四成绩？");
		System.out.println(zhangScore>liScore);
		
	}
}
