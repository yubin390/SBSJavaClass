package Day14;

public class Person {
	private int regiNum; //�ֹε�� ��ȣ
	private int passNum; //���� ��ȣ
	
	public Person(int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
	}
	
	public Person(int rnum){
		this(rnum, 0); //�����ε��� �ٸ� �����ڸ� �����.
	}
//	this Ű���带 �̿��� �ٸ� �������� ȣ�� �������
//	Person(int rnum){ this(rnum, 0);} �� �����ϴ�.
//	this�� �ǹ� : �ν��Ͻ��� ����Ŵ. ������ �ȿ� ���� ���, �� �ν��Ͻ��� �ٸ� �������� ����.
	
	void showPersonalInfo() {}
	
}
