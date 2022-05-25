package Day14;

public class Person {
	private int regiNum; //주민등록 번호
	private int passNum; //여권 번호
	
	public Person(int rnum, int pnum){
		regiNum = rnum;
		passNum = pnum;
	}
	
	public Person(int rnum){
		this(rnum, 0); //오버로딩된 다른 생성자를 사용함.
	}
//	this 키워드를 이용한 다른 생성자의 호출 방법으로
//	Person(int rnum){ this(rnum, 0);} 도 가능하다.
//	this의 의미 : 인스턴스를 가리킴. 생성자 안에 쓰일 경우, 이 인스턴스의 다른 생성자을 뜻함.
	
	void showPersonalInfo() {}
	
}
