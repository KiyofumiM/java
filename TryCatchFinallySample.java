package exapmle;

public class TryCatchFinallySample {
	public static void main(String[] args) {
		System.out.println(args[args.length - 1]);
		
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