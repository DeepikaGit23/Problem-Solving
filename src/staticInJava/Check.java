package staticInJava;

class Check {
	
	static String name ="Hey I am final variable";
	String name2;
	
	static {
		System.out.println("We are in Static block");
		name="Hey is my value changed?";
	}
	
	public static void checking(String name) {
		System.out.println("Wohho we are inside static method");
	}
	
	public void normal(String name) {
		System.out.println("We are in normal method: " + name);
	}
	
	public static void main(String[] args) {
		
	}

}
