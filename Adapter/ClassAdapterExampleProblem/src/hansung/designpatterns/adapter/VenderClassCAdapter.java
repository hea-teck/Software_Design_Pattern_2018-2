package hansung.designpatterns.adapter;

public class VenderClassCAdapter extends Vender2Class implements VenderClass {
	
	public void request() {
		super.specificRequest();
	}


}
