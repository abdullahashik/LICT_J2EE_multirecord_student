package bean;

public class StudentGrade {

	protected String name;
	protected String id;
	protected String grade;
	protected double mark;
	protected double cgpa;

	public StudentGrade(String name, String id, String grade, double mark, double cgpa) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
		this.mark = mark;
		this.cgpa = cgpa;
	}

	public StudentGrade() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public double getMark() {
		return mark;
	}

	public void setMark(double mark) {
		this.mark = mark;
	}

	public double getCgpa() {
		return cgpa;
	}

	public void setCgpa(double cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "StudentGrade [name=" + getName() + ", id=" + getId() + ", Cgpa" + getCgpa() + ", Grade" + getGrade()
				+ "]";
	}

}
