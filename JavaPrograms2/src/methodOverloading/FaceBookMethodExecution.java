package methodOverloading;

public class FaceBookMethodExecution {

	public static void main(String[] args) {
		FaceBookMethod user1=new FaceBookMethod("Rahul",8897143512l,1998l,'M',25);
		user1.login(8897143512l, 1998l);
		FaceBookMethod user2=new FaceBookMethod("Reethi",9550375342l,1999l);
		user2.login(9550375342l,1999l);
		FaceBookMethod user3=new FaceBookMethod("Ravi",8897146512l,1964l,20);
		user3.login(8897146512l,1964l);
	}
}
