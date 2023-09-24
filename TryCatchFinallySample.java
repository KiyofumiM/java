package text;

public class TryCatchFinallySample {
	public static void main(String[] args) {
		System.out.println(args[0]);
		
		try {
			System.out.println("try");
			Integer.parseInt(args[0]);
		} catch (Exception e) {
			System.out.println("catch");
			
		} finally {
			System.out.println("finally");
		}
	}
}
