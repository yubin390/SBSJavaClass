package Day15;

public class Box {
	private String conts;
	
	Box(String cont){
		this.conts = cont;
	}
	
	public static void main(String[] args) {
		Box box = new Box("camera");
		System.out.println(box.toString()); //Day15.Box@58ceff1
		
		String str = "apple";
		System.out.println(str.toString()); //apple
	}
}


