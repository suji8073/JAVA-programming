import java.util.*; //모든 패키지 참조

class Location{ //도시, 경도, 위도를 표현하는 클래스
	String city;
	int longitude, latitude;
	Location (String city, int longitude, int latitude)
	{
		this.city = city;
		this.longitude = longitude;
		this.latitude = latitude;
	}
	public int getlongitude() {
		return longitude;
	}
	public int getlatitude() {
		return latitude;
	}
}

public class ch7_06 {

	public static void main(String[] args) {
		HashMap <String, Location> h = new HashMap<String, Location>(); 
		//도시와 위도 객체를 쌍으로 저장하는 HashMap 컬랙션 생성
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("도시, 경도, 위도를 입력하세요. ");
		
		for(int i=0; i<4; i++)//4개의 도시 입력
		{
			System.out.print(">>");
			String s = scanner.nextLine();//문자열을 s에 저장
			StringTokenizer st = new StringTokenizer(s,",");//s문자열을 ,구분 문자로 분리
			String city = st.nextToken().trim();//trim(): 공백을 제거하는 함수
			int longitude = Integer.parseInt(st.nextToken().trim());//문자열을 정수로 변환
			int latitude = Integer.parseInt(st.nextToken().trim());//문자열을 정수로 변환
			
			Location loc = new Location(city, longitude, latitude);
			h.put(city, loc);
		}
		
		System.out.println("------------------------------------------");
		
		Set<String> keys = h.keySet();//keys 문자열을 가진 집합 set 컬렉션 리턴
		Iterator<String> it = keys.iterator();//key 문자열을 순서대로 접근할 수 있는 Iterator 리턴
		
		while(it.hasNext()) {
			String city = it.next();
			Location loc = h.get(city);
			System.out.println(city+"\t"+loc.getlongitude()+"\t"+loc.getlatitude());
		}
		System.out.println("------------------------------------------");
		
		while(true) {//무한루프
			System.out.print("도시 이름>> ");
			String text = scanner.nextLine();
			if (text.contentEquals("그만"))
				return;//while문을 벗어나 프로그램 종료
			
			Location loc = h.get(text);//도시에 해당하는 Location 객체 검색
			if (loc==null)
				System.out.println(text+"는 없습니다.");

			else { //존재할 경우
				System.out.println(text+"\t"+loc.getlongitude()+"\t"+loc.getlatitude());
			}
			
		}
	}
}
	
