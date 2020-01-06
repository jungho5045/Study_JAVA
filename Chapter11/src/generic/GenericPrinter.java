package generic;

public class GenericPrinter<T extends Meterial> { // T 타입을 한정하기 위해 Meterial 클래스를 상위 클래스로 상속 받는다.
	
	private T material;

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	public String toString() {
		return material.toString();
	}
	
	public void printing() {
		material.doPrinting();
	}
	
}