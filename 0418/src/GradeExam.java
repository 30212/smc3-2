import java.util.Scanner;

public class GradeExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1000 ������ �ڿ����� �Է��ϼ���.");
		int num1 = scan.nextInt();
		int sum=0;
		int i=1;
		while(i<=num1) {
			if(i%4==0) {
				System.out.println(i);
				sum+=1;
			}
			i++;
		}
		System.out.println("1~"+num1+"���� 4�� ����� ���� "+sum+"�Դϴ�.");

	}

}
