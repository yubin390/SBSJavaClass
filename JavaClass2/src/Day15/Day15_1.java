package Day15;
import java.util.*;

public class Day15_1 {

	public static void main(String[] args) {
		String str22 = "age : " + 17; // str22.concat(String.valueOf(17))
		System.out.println(str22);
//		String birth1 = "<��>" + 7+'.'+16;
//		System.out.println(birth1);
		
		String birth = new StringBuilder ("<��>").append(7).append('.').append(16).toString();  //toString() : �������� ��ȯ�� �ϰڴ�
		System.out.print("birth : ");
		System.out.println(birth); //toString() : �������� ����ϰڴ�.
		String str1 = birth.toString();
		System.out.println(str1);
		//println�� ���ڷ� �ν��Ͻ��� ���� ���� ���޵Ǹ�, �ش� �ν��Ͻ��� toString �޼ҵ尡 ȣ��Ǹ鼭 ��ȯ�Ǵ� ���ڿ��� ��µȴ�
		//toString �޼ҵ�� �ν��Ͻ��� ������ ���ڿ��� ���·� ��ȯ�ϱ� ���� �޼ҵ��̴�.
		StringBuilder stub = new StringBuilder("123");
		System.out.println(stub.toString());
		
		 StringBuilder stringBuilder = new StringBuilder();
	     stringBuilder.append("���ڿ� ").append("����");
//	     String str = stringBuilder;   // String�� StringBuilder�� �״�� ���� �� ����. toString()�� �ٿ��� �Ѵ�
        String str = stringBuilder.toString();
        // �� println()�� ���� ���� ����Ѵ�
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
        System.out.println("3���� ���� �Է�: ");
        int num11 = sc1.nextInt();//������
        int num22 = sc1.nextInt();
        int num33 = sc1.nextInt();
        int sum = num11+num22+num33;
        System.out.println(num11+" + "+num22+" + "+num33+" = "+sum);
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("���ڿ� �Է� : ");
        String str12 = sc2.nextLine();
        System.out.println("�Էµ� ���ڿ�: "+str12);
        
        System.out.println();
        Scanner sc3 = new Scanner(System.in);
        System.out.println("byte�� ���� �Է� : ");
        byte num01 = sc3.nextByte();
        byte num02 = sc3.nextByte();
        byte num03 = sc3.nextByte();
        System.out.println("num01: "+num01+", num02: "+num02+", num03: "+num03);
        
        
        
	}

}