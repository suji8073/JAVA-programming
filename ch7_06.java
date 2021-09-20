import java.util.*; //��� ��Ű�� ����

class Location{ //����, �浵, ������ ǥ���ϴ� Ŭ����
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
		//���ÿ� ���� ��ü�� ������ �����ϴ� HashMap �÷��� ����
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("����, �浵, ������ �Է��ϼ���. ");
		
		for(int i=0; i<4; i++)//4���� ���� �Է�
		{
			System.out.print(">>");
			String s = scanner.nextLine();//���ڿ��� s�� ����
			StringTokenizer st = new StringTokenizer(s,",");//s���ڿ��� ,���� ���ڷ� �и�
			String city = st.nextToken().trim();//trim(): ������ �����ϴ� �Լ�
			int longitude = Integer.parseInt(st.nextToken().trim());//���ڿ��� ������ ��ȯ
			int latitude = Integer.parseInt(st.nextToken().trim());//���ڿ��� ������ ��ȯ
			
			Location loc = new Location(city, longitude, latitude);
			h.put(city, loc);
		}
		
		System.out.println("------------------------------------------");
		
		Set<String> keys = h.keySet();//keys ���ڿ��� ���� ���� set �÷��� ����
		Iterator<String> it = keys.iterator();//key ���ڿ��� ������� ������ �� �ִ� Iterator ����
		
		while(it.hasNext()) {
			String city = it.next();
			Location loc = h.get(city);
			System.out.println(city+"\t"+loc.getlongitude()+"\t"+loc.getlatitude());
		}
		System.out.println("------------------------------------------");
		
		while(true) {//���ѷ���
			System.out.print("���� �̸�>> ");
			String text = scanner.nextLine();
			if (text.contentEquals("�׸�"))
				return;//while���� ��� ���α׷� ����
			
			Location loc = h.get(text);//���ÿ� �ش��ϴ� Location ��ü �˻�
			if (loc==null)
				System.out.println(text+"�� �����ϴ�.");

			else { //������ ���
				System.out.println(text+"\t"+loc.getlongitude()+"\t"+loc.getlatitude());
			}
			
		}
	}
}
	
