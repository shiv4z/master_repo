package package1;

public class Car {
	@SuppressWarnings("unused")
	private DiselEngine diselEngine;

	public void setDiselEngine(DiselEngine diselEngine) {
		this.diselEngine = diselEngine;
	}

	public Car() {
		System.out.println("Car() :: Contsructor");
	}

	public void drive() {
		Integer start = diselEngine.start();
		if(start>=1) {
			System.out.println("Car drive successfully.");
		}else {
			System.out.println("Engine not strated.");
		}
		

	}
}
