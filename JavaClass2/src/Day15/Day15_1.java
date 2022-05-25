package Day15;
import java.util.*;

public class Day15_1 {

	public static void main(String[] args) {
		String str22 = "age : " + 17; // str22.concat(String.valueOf(17))
		System.out.println(str22);
//		String birth1 = "<양>" + 7+'.'+16;
//		System.out.println(birth1);
		
		String birth = new StringBuilder ("<양>").append(7).append('.').append(16).toString();  //toString() : 참조값을 반환을 하겠다
		System.out.print("birth : ");
		System.out.println(birth); //toString() : 참조값을 출력하겠다.
		String str1 = birth.toString();
		System.out.println(str1);
		//println의 인자로 인스턴스의 참조 값이 전달되면, 해당 인스턴스의 toString 메소드가 호출되면서 반환되는 문자열이 출력된다
		//toString 메소드는 인스턴스의 정보를 문자열의 형태로 반환하기 위한 메소드이다.
		StringBuilder stub = new StringBuilder("123");
		System.out.println(stub.toString());
		
		 StringBuilder stringBuilder = new StringBuilder();
	     stringBuilder.append("문자열 ").append("연결");
//	     String str = stringBuilder;   // String에 StringBuilder를 그대로 넣을 순 없다. toString()을 붙여야 한다
        String str = stringBuilder.toString();
        // 두 println()은 같은 값을 출력한다
        System.out.println(stringBuilder);
        System.out.println(str);
        
        System.out.println();
        String source = "1 3 5";
        Scanner sc = new Scanner(source);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        System.out.println(num1+" "+num2+" "+num3);
        
        System.out.println();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("3개의 숫자 입력: ");
        int num11 = sc1.nextInt();//대기상태
        int num22 = sc1.nextInt();
        int num33 = sc1.nextInt();
        int sum = num11+num22+num33;
        System.out.println(num11+" + "+num22+" + "+num33+" = "+sum);
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("문자열 입력 : ");
        String str12 = sc2.nextLine();
        System.out.println("입력된 문자열: "+str12);
        
        System.out.println();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("byte형 정수 입력 : ");
        byte num01 = sc3.nextByte();
        byte num02 = sc3.nextByte();
        byte num03 = sc3.nextByte();
        System.out.println("num01: "+num01+", num02: "+num02+", num03: "+num03);
        
        
        
	}

}
