package pt.lobo.introj.lang.generics;

import pt.lobo.introj.lang.inherit.device.Device;
import pt.lobo.introj.lang.inherit.device.DiskDevice;
import pt.lobo.introj.lang.inherit.device.HDVideoDevice;

public class Generics2<T extends Device> {

	private T device;
	
	public Generics2() {
	}

	public T getDevice() {
		return device;
	}

	public void setDevice(T device) {
		this.device = device;
	}
	
	public static void main(String[] args) {
		Generics2<DiskDevice> disk = new Generics2<DiskDevice>();
		disk.setDevice(new DiskDevice(10));
		
		Generics2<HDVideoDevice> video = new Generics2<HDVideoDevice>();
		video.setDevice(new HDVideoDevice());
		
		disk.getDevice().start();
		int brightness = video.getDevice().getBrightness();
	}
	
}
