package Day15;

public class Problem {

	public static void main(String[] args) {
		String str = "990925-1012999";
		System.out.println(str.substring(0,6)+" "+str.substring(7,13));
		
		StringBuilder sb = new StringBuilder("990925-101299");
		sb.replace(6,7," "); //'-'을 공백으로 대체한다. StringBuilder의 인스턴스 메소드 replace
		System.out.println(sb.toString());
		
	}
}
