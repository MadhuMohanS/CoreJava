class RemoteBegin{
	public static void main(String args[]){
		System.out.println("starting main in RemoteBegin");
		LgRemote lgRemote=new LgRemote(UsedFor.CHANGECHANNEL,10,true,2,4);
		lgRemote.on();
		lgRemote.off();
		lgRemote.increaseVolume();
		lgRemote.decreaseVolume();
		lgRemote.changeChannel();
		lgRemote.voiceCommand();
		System.out.println("used for:"+lgRemote.usedFor);
		System.out.println("total batteries:"+lgRemote.totalBatteries);
		System.out.println("total buttons:"+lgRemote.totalButtons);
		System.out.println("original:"+lgRemote.original);
		System.out.println("warranty:"+lgRemote.warranty);
		System.out.println("ending main in RemoteBegin");
	}
}