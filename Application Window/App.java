package finalExam;

public class students {

	public String ID;
	public String firstNames;
	public String lastNames;
	public String course;
	public String studentType;
	public double studentDiscount;
	public double gold=0.5;
	public double blue=0.3;
	public double white=0.1;
	public double continuing=0.1;
	
	public students(String ID, String firstNames, String lastNames, String course, String studentType, double studentDiscount) {
		this.ID=ID;
		this.firstNames=firstNames;
		this.lastNames=lastNames;
		this.course=course;
		this.studentType=studentType;
		this.studentDiscount=studentDiscount;
	}
}
