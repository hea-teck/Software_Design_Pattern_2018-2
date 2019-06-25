package hansung.designpatterns.adapter;

public class ExistingSystem {

	public static void main(String[] args) {
		VenderClass vender = new VenderClassAdapter(new Vender2Class());
		//VenderClass vender = VenderClassFactory.getInstance().createVenderClass();
		vender.request();
	}


}
