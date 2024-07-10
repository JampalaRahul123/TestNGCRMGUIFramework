package methodOverloading;

public class FaceBookExecution {

	public static void main(String[] args) {
		FaceBook f1=new FaceBook("Rahul",8897143512l,1998l,'M',25);
		f1.login(8897143512l, 1998l);
		f1.logOut();
		FaceBook f2=new FaceBook("Reethi",9550375342l,1234l,'F',23);
		f2.login(9550375342l, 1234l);
		f2.logOut();
			}
	}


