package lab9;

public class text {

	public static void main(String[] args) {
		person p =new person("sercan","xghj",123,"fghj");
		Student s=new Student("sercan","xghj",123,"fghj","junior");
		employee e=new employee("sercan","xghj",123,"fghj","231",556);
		person f=new faculty("sercan","xghj",123,"fghj","231",556,12,3);
		person st=new staff("sercan","xghj",123,"fghj","231",556,"dr");
		
		System.out.println(p.toString());
		System.out.println(s.toString());
		System.out.println(e.toString());
		System.out.println(f.toString());
		System.out.println(st.toString());
	}

}
