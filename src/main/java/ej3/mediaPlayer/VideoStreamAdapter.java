package ej3.mediaPlayer;

public class VideoStreamAdapter extends Media{	//Adapter
	private VideoStream videoStream;
	
	@Override
	public void play() {
		this.videoStream.reproduce();
	}
}
