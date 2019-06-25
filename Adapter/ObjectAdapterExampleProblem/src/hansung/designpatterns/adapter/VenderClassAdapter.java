package hansung.designpatterns.adapter;

public class VenderClassAdapter implements VenderClass {
	Vender2Class vender;

	public VenderClassAdapter (Vender2Class vender) {
		this.vender = vender;
	}

	public void request() {
		vender.specificRequest();
	}

}
