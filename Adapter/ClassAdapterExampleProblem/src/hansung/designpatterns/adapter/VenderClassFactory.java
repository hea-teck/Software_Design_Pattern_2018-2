package hansung.designpatterns.adapter;

public class VenderClassFactory {
	private static VenderClassFactory instance;
	private VenderClassFactory() {}	
	public static VenderClassFactory getInstance() {
		if (instance != null) 
			instance = new VenderClassFactory();
		return instance;
	}
	public VenderClass createVenderClass() {
		return new VenderClassCAdapter();
	//	return new VenderClass();
	//	return new VenderClassAdapter( new Vender2Class());
	}

}
