package Day14;

public class AAA {
	//Person Ŭ���� ���� ����
	int number;
	Person p;
	public AAA(int x, int y, int num) {
		p = new Person(x, y);
		number = num;
	}
	
	public AAA() {}
	
	void md1() {p.showPersonalInfo();}
	
	void simple(int p1, int p2) {System.out.println("p2 :int");}
	void simple(int p1, double p2) {System.out.println("p2 : double");}
	
	public static void main(String[] args) {
		AAA a = new AAA();
		a.simple(7, 'A'); //�̷� ��� �������� ���� ���� ����ȯ�� �ϴ� ���� ����. (int)'A' or (double) 'A'
		//char�� ������ double������ int���� �������� ������ ����� ������ ����ȯ�� �̷������. -> ����õ 	
		a.simple(7, (double)'B');
		
		
		//String Ŭ���� �޼ҵ� ����
		System.out.println();
		System.out.println("String Ŭ���� �޼ҵ� ����");
		String str3 = "RR".concat("AA");
		System.out.println("\"RR\".concat(\"AA\") : "+str3);
		String str = "abcdefg"; 
		String str1 = str.substring(2);
		System.out.println("str.substring(2) : "+str1);
		String str2 = str.substring(2, 4);
		System.out.println("str.substring(2, 4) : "+str2);
		System.out.println("str.equals(str1) : "+str.equals(str1));
		System.out.println("str1.compareTo(str2) : "+str1.compareTo(str2));
		System.out.println("str.compareToIgnoreCase(str1) : "+str.compareToIgnoreCase(str1));
		double e = 2.7;
		String se = String.valueOf(e);
		System.out.println(se);
		String str11 = "funny"; 
		str11 += " camp"; //str = str+"camp"
		System.out.println(str11);
		String str22 = "age : " + 17; // str22.comcat(String.valueOf(17))
		System.out.println(str22);
	}
}