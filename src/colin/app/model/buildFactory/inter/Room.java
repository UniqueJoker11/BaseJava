package colin.app.model.buildFactory.inter;

public class Room {

	private boolean finishFloor;
	private boolean installWindow;
	private boolean installDoor;
	public boolean isFinishFloor() {
		return finishFloor;
	}
	public void setFinishFloor(boolean finishFloor) {
		this.finishFloor = finishFloor;
	}
	public boolean isInstallWindow() {
		return installWindow;
	}
	public void setInstallWindow(boolean installWindow) {
		this.installWindow = installWindow;
	}
	public boolean isInstallDoor() {
		return installDoor;
	}
	public void setInstallDoor(boolean installDoor) {
		this.installDoor = installDoor;
	}
	
	
}
