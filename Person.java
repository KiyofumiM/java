package person;

public class Person {

	private enum Gender { MAN, WOMAN };	
	
	private Gender gender;

	private Person(Gender gender) {
		this.gender = gender;
	}

	private void speak() {
		if (this.gender == Gender.MAN) {
			System.out.println("I'm a man");
		} else {
			System.out.println("I'm a woman");
		}
	}

	public static void main(String[] args) {
		Person man = new Person(Gender.MAN);
		Person woman = new Person(Gender.WOMAN);
		
		man.speak();
		woman.speak();
	}
}
