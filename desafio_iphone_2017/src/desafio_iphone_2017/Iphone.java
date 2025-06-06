package desafio_iphone_2017;

public class Iphone implements Ipod, Phone, Browser{
	public static void main(String[] args) {
		
		Iphone iphone = new Iphone();
	    
	    // Métodos do Ipod
	    iphone.selectMusic();
	    iphone.play();
	    iphone.pause();

	    // Métodos do Phone
	    iphone.call("123456789");
	    iphone.pickUp();
	    iphone.startVoiceMail();
	    // Métodos do VoiceMail
	    iphone.showPage();
	    iphone.addNewTab();
	    iphone.updatePage();
	    
	   
	}
		
	

	@Override
	public void play() {
		System.out.println("Playing the music");
		
	}

	@Override
	public void pause() {
		System.out.println("Pausing the music");
		
	}

	@Override
	public void selectMusic() {
		System.out.println("Selecting the song");
		System.out.println("====================================");
		
	}
	
	

	@Override
	public void call(String number) {
		System.out.println("Typing the number");
		
		
	}

	@Override
	public void pickUp() {
		System.out.println("Picking up the call");
		
	}

	@Override
	public void startVoiceMail() {
		System.out.println("Checking the voicemail");
		System.out.println("================================");
		
	}



	@Override
	public void showPage() {
		System.out.println("Showing the page");
		
	}



	@Override
	public void addNewTab() {
		System.out.println("Adding new tab");
		
	}



	@Override
	public void updatePage() {
		System.out.println("Updating page");
		
	}
	
	

}
