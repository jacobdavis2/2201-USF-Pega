
public class Driver {

	public static void main(String[] args) {
		
		String s1 = "Ithaka", s2 = "Pelopennes", s3 = "Ithaka";
		StringBuilder sb = new StringBuilder(), sb2 = new StringBuilder();
		sb2 = sb;
		sb.append("hello");
		
		System.out.println(s1 == s3);
		
		System.out.println(sb == sb2);
		
		Employee e = new Employee();
		e.name = "Jacob";
		e.age = 100;
		
		Employee f = new Employee();
		f.name = "Jacob";
		f.age = 100;
		
		// Their address are NOT the same, therefore this line returns false;
		System.out.println(e == f);
		
		// However, their values are the same, so the equals method returns true
		System.out.println(e.equals(f));
	}

}

class Employee {
	String name;
	int age;
	
	public boolean equals(Employee other) {
		if (name == other.name && age == other.age)
			return true;
		else return false;
	}
}
