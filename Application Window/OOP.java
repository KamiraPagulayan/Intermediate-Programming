package finalExam;

public class OOP {

	public static void main(String[] args) {

		students st1=new students("13-0019", "Lizel", "Avillano", "Tourism", "Discounted (Gold)", 0.5);
		students st2=new students("13-0222", "Icy", "Virrey", "Computer Science", "Discounted (BLue)", 0.3);
		students st3=new students("11-1234", "Judith", "Tan", "Engineering", "Discounted (White)", 0.1);
		students st4=new students("10-0506", "Rina", "Marquez", "Nursing", "Continuing", 0.1);
		students st5=new students("23-0001", "Drake", "Dulay", "Architecture", "Walk-In", 0);

		System.out.println(st1.ID);
		System.out.println(st1.firstNames);
		System.out.println(st1.lastNames);
		System.out.println(st1.studentType);
		System.out.println();
		System.out.println(32500*st1.studentDiscount);
	}
}
