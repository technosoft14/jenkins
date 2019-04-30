package javapgm3;

public class Methodoverload {
	public void stuInfo(int id) {
		System.out.println(id);
	}
	public void stuInfo(String name) {
		System.out.println(name);
		
	}
	
	public void stuInfo(long phone, String address) {
		System.out.println(phone);
		System.out.println(address);

}
	public static void main(String[] args) {
		Methodoverload i = new Methodoverload();
		i.stuInfo(51460640);
		i.stuInfo("chandru");
		i.stuInfo(9500470563l, "28/gandhi st chennai");
	}
}
