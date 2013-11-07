package pt.lobo.introj.lang.inherit.device;

public class HDVideoDevice extends VideoDevice {

	public static final int MAX_BRIGHNESS = 256;
	
	private boolean hd = false;
	
	public static void main(String[] args) {
		System.out.println("xxx");
	}

	public boolean isHd() {
		return hd;
	}

	public void setHd(boolean hd) {
		this.hd = hd;
	}

	// A keyword final impede sub-classes de usarem polimorfismo
	@Override
	public final void setBrightness(int brightness) {
		if (hd) // não suporta brightness
			return;

		// não permitir exceder a brightness maxima
		if(brightness >= MAX_BRIGHNESS)
			return;
		
		// fazer forward do pedido para a super class
		super.setBrightness(brightness);
	}

	@Override
	public void channelUp() {
		// cenas
	}
	
}