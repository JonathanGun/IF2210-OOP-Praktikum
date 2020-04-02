import java.util.ArrayList;

class Main{
	public static void main(String[] args){
		MailServer ms = new MailServer();
		ArrayList<EmailAccountStudent> students = new ArrayList<>();
		students.add(new EmailAccountStudent("13518084@std.stei.itb.ac.id"));
		students.add(new EmailAccountStudent("13518024@std.stei.itb.ac.id"));
		students.add(new EmailAccountStudent("13518122@std.stei.itb.ac.id"));
		students.forEach(s -> ms.addSubscriber("IF2211", s));

		EmailAccountTeacher teacher = new EmailAccountTeacher(ms);
		teacher.sendEmail("IF2211", "<ini email> HAYOLO NGAPAIN"); // 3 org subscribe
		teacher.createAssignment("IF2211", "[IF2211] Duar Tubes 3"); // 3 org subscribe
		teacher.createAssignment("IF2212", "[IF2212] Duar Tubes 3"); // ga ada yg subscribe
	}
}