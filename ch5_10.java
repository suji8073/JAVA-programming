abstract class PairMap{
	 protected String keyArray[]; // key ���� �����ϴ� �迭
	 protected String valueArray[]; // value ���� �����ϴ� �迭
	 abstract String get(String key); // key ���� ���� value ����, ������ null ����
	 abstract void put(String key, String value); // key�� value�� ������ ����. ������ key�� ������, ���� value�� ����
	 abstract String delete(String key); // key ���� ���� ������ (value�� �Բ�) ����, ������ value �� ����
	 abstract int length(); // ���� ����� �������� ���� ����
}
class Dictionary extends PairMap{
	private int set; //���� ����� �������� ����
	public Dictionary(int num) {//������
		keyArray = new String[num];
		valueArray = new String[num];
		this.set = 0 ;
	}
	
	public String get(String key) {
		for(int i=0; i<keyArray.length; i++) {//���� �迭�� ����� ���� ���� ��ŭ �ݺ�
			if (key.equals(keyArray[i]))
				return valueArray[i];
		}
		return null;//key�� �������� �ʴ� ���
	}
	
	public void put(String key, String value) {
		for(int i=0; i<keyArray.length; i++) {//���� �迭�� ����� ���� ���� ��ŭ �ݺ�
			if (key.equals(keyArray[i])) {
				keyArray[i] = key;
	            valueArray[i] = value;
	            return;
			}
		}
			
		  keyArray[set] = key;
	      valueArray[set] = value;
	      set++;
	}
	
	public String delete(String key) {
		for (int i=0; i<keyArray.length; i++) {//���� �迭�� ����� ���� ���� ��ŭ �ݺ�
			if (key.equals(keyArray[i])) {
				String s = valueArray[i];
				keyArray[i]=null;
				valueArray[i]=null;
				return s;
			}
		}
		return null;//�������� ���� ���
	}
	public int length() {
		return set; 
	}
	
}

public class ch5_10 {

	public static void main(String[] args) {
		Dictionary dic = new Dictionary(10);
	    dic.put("Ȳ����", "�ڹ�");
	    dic.put("���繮", "���̼�");
	    dic.put("���繮", "C++"); // ���繮�� ���� C++�� ����
	    System.out.println("���繮�� ���� "+dic.get("���繮"));
	    System.out.println("Ȳ������ ���� "+dic.get("Ȳ����"));
	    dic.delete("Ȳ����"); // Ȳ���� ������ ����
	    System.out.println("Ȳ������ ���� "+dic.get("Ȳ����")); //������ ������ ����
	}

}
