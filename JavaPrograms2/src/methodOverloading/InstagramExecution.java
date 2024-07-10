package methodOverloading;

public class InstagramExecution {

	public static void main(String[] args) {
Instagram user1=new Instagram("Rahul",8897143512l,1998l);
user1.login(8897143512l, 1998l);
user1.login("Rahul", 1998l);
	}

}
