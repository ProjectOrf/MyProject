package cleaningCarpet;

public class NotifyEmail {
	
	String subject;
	String body;
	
	public NotifyEmail() {
		this.subject=null;
		this.body=null;
	}
	
	public void sendEmail(String s,String b ) {
		s="order ! ";
		b="you order is complete !";
	}

}
