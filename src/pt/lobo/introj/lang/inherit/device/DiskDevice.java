package pt.lobo.introj.lang.inherit.device;

public class DiskDevice extends Device {

	private double totalCapacity;

	private double capacity;
	
	public DiskDevice(double totalCapacity) {
		this.totalCapacity = totalCapacity;
	}

	public double getTotalCapacity() {
		return totalCapacity;
	}

	public double getCapacity() {
		return capacity;
	}

	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}

}
