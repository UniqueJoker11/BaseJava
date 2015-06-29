package colin.app.model.buildFactory.impl;

import colin.app.model.buildFactory.inter.Builder;
import colin.app.model.buildFactory.inter.Room;

public class CivilianWorker implements Builder {

	private Room room=null;
	@Override
	public void installWindow(String brand) {
		System.out.println("我要安装的窗户，品牌是" + brand);
	}

	@Override
	public void installDoor(String brand) {
		System.out.println("我要安裝門,品牌是" + brand);

	}

	@Override
	public void floorFinish(String brand) {
		System.out.println("我要铺地板，品牌是" + brand);
	}

	/* 返回成果物
	 * @see colin.app.model.buildFactory.inter.Builder#getRoom()    
	 */
	@Override
	public Room getRoom() {
		room=new Room();
		room.setFinishFloor(true);
		room.setInstallDoor(true);
		room.setInstallWindow(true);
		return room;
	}

}
