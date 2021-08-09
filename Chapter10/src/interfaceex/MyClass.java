package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()"); //x인터페이스에서 상속받은 x() 메서드 구현
	}

	@Override
	public void y() {
		System.out.println("y()"); //y인터페이스에서 상속받은 y() 메서드 구현
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()"); //MyInterface 인터페이스의 myMethod() 메서드 구현
	}

}
