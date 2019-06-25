package hansung.designpatterns.adapter;

public class ExistingSystem {

	public static void main(String[] args) {

		VenderClass vender = new VenderClassCAdapter();

		vender.request();
	}

}
