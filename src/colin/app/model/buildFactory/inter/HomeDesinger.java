package colin.app.model.buildFactory.inter;

import colin.app.model.buildFactory.impl.CivilianWorker;

public class HomeDesinger {

	private Builder builder=null;
	public HomeDesinger(Builder builder){
		this.builder=builder;
	}
	
	/**    
	 * 方法描述：   装修房屋
	 * 注意事项：     
	 * @Exception 异常对象 
	*/
	public void finishHome(){
		builder.floorFinish("圣象地板");
		builder.installWindow("盼盼");
		builder.installDoor("苹果");
		Room room=builder.getRoom();
		System.out.println("房屋的裝修結果"+room.isFinishFloor());
	}
	public static void main(String[] args) {
		Builder builder=new CivilianWorker();
		HomeDesinger designer=new HomeDesinger(builder);
		designer.finishHome();
	}
}
