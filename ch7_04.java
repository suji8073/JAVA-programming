import java.util.Vector;
import java.util.Scanner;

public class ch7_04 {
	
	public static void main(String[] args) {
		Vector <Integer>v = new Vector<Integer>(); //���� ���� �ٷ�� ���׸� ���� ����
		Scanner scanner = new Scanner(System.in);
		
		
		while(true)//���ѷ���
		{
			System.out.print("������ �Է� (0 �Է½� ����)>> ");
			int num = scanner.nextInt();
			
			if (num==0)
				break;
			v.add(num); //num ����
			int sum=0; //��� �� ���ϴ� ����
			
			
			for (int i=0; i<v.size(); i++) {//��� ��� ���� ����ϱ�
				System.out.print(v.get(i)+" ");
				sum +=v.get(i);
			}
			System.out.println();
			System.out.println("���� ��� "+sum/v.size());//��� ���
				
		}
		scanner.close();
		
	}
}
