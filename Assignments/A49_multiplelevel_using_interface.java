package Assignments;

interface Hike {
	 
	void video_call();
	void voice_call();
}
interface Telegram {
	
	void reaction();
	void profile_pic();
}
public class A49_multiplelevel_using_interface implements Telegram,Hike {

	public void video_call() {
		System.out.println("Videocalling code is here");
		
	}
	public void voice_call() {
		System.out.println("Voicecalling code is here");
		
	}
	public void reaction() {
		System.out.println("reaction code is here");
		
	}
	public void profile_pic() {
		System.out.println("profilePicture code is here");
		
	}
	
	public static void main(String[] args) {
		
		A49_multiplelevel_using_interface mi= new A49_multiplelevel_using_interface();
		mi.video_call();
		mi.voice_call();
		mi.reaction();
		mi.profile_pic();
	}
}