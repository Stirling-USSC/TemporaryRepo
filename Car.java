public class Car {
	private boolean isCool;
	
	public Car() {
		isCool = false;
	}

	public Car(boolean isCool) {
		this.isCool = isCool;
	}

	public boolean isCool() {
		return isCool;
	}

	public String toString() {
		return "Car, isCool=" + isCool;
	}

	public static void main(String[] args) {
		Car car = new Car(Boolean.parseBoolean(args[0]));
		System.out.println(car);
		if (car.isCool) {
			System.out.println("This car is cool.");
		}
		else {
			System.out.println("This car is NOT cool.");
		}
	}
}
