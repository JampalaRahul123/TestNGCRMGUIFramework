package Constructor;

public class Student {
String studentName;
int studentId;
long mobNo;
char gender;
static String schoolName="Qspiders";
public Student(String studentName,int studentId,long mobNo,char gender) {
	this.studentName=studentName;
	this.studentId=studentId;
	this.mobNo=mobNo;
	this.gender=gender;
}
public void details() {
	System.out.println(studentName);
	System.out.println(studentId);
	System.out.println(mobNo);
	System.out.println(gender);
	System.out.println(schoolName);
}
}