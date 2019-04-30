package javapgm3;

public class Revsst {
	public static void main(String[] args) {
String name = "hello world";
		String res ="";
		for(int i=name.length()-1;i>=0;i--) {
			res = res+name.charAt(i);
				
			}
		System.out.println(res);
		}
}