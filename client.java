package singleton;

public class client {
	
	public static void main(String args[]) {
		singleton s1 = singleton.getInstance("S1");
		singleton s2 = singleton.getInstance("S2");
		System.out.println(s1.value);
        System.out.println(s2.value);
	}

}
