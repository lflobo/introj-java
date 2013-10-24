package pt.lobo.introj.lang.inherit.device;

public class Device {

	public enum DeviceStatus {
		START, STOP
	}
	
	DeviceStatus status = DeviceStatus.STOP;
	
	public void start() {
		// rotina para iniciar
		status = DeviceStatus.START;
	}
	
	public void stop() {
		// rotina para terminar
		status = DeviceStatus.STOP;
	}
	
	public DeviceStatus getStatus() {
		return status;
	}
	
}
