package pt.lobo.introj.lang.inherit.device;

public class VirtualMemoryDisk extends DiskDevice {

	
	public VirtualMemoryDisk(double totalCapacity) {
		super(totalCapacity);
	}

	// re definir a função setBrightness -> polimorfismo
	@Override
	public double getTotalCapacity() {
		return Runtime.getRuntime().freeMemory();
	}
	
}
