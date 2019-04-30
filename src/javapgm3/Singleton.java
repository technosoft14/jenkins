package javapgm3;

public class Singleton {
	 
		   private static Singleton S = null;
		   private Singleton() {

	}
		   public static Singleton Createobject() {
			return S;
			   
		   }

}
