package pt.lobo.introj.lang.inherit.device;

public abstract class VideoDevice extends Device {

	private int brightness;

	public int getBrightness() {
		return brightness;
	}

	public void setBrightness(int brightness) {
		this.brightness = brightness;
	}
	
	public abstract void channelUp();

}
