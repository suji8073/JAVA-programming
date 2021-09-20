import java.util.Vector;
import java.util.Scanner;

public class ch7_04 {
	
	public static void main(String[] args) {
		Vector <Integer>v = new Vector<Integer>(); //정수 값만 다루는 제네릭 벡터 생성
		Scanner scanner = new Scanner(System.in);
		
		
		while(true)//무한루프
		{
			System.out.print("강수량 입력 (0 입력시 종료)>> ");
			int num = scanner.nextInt();
			
			if (num==0)
				break;
			v.add(num); //num 삽입
			int sum=0; //평균 값 구하는 변수
			
			
			for (int i=0; i<v.size(); i++) {//모든 요소 정수 출력하기
				System.out.print(v.get(i)+" ");
				sum +=v.get(i);
			}
			System.out.println();
			System.out.println("현재 평균 "+sum/v.size());//평균 출력
				
		}
		scanner.close();
		
	}
}
