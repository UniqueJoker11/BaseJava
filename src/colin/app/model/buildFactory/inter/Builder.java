package colin.app.model.buildFactory.inter;

public interface Builder {

	public void installWindow(String brand);
	
	public void installDoor(String brand);
	
	public void floorFinish(String brand);
	
	public Room getRoom();
}
