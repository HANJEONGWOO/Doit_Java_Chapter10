package interfaceex;

public class MyClass implements MyInterface {

	@Override
	public void x() {
		System.out.println("x()"); //x�������̽����� ��ӹ��� x() �޼��� ����
	}

	@Override
	public void y() {
		System.out.println("y()"); //y�������̽����� ��ӹ��� y() �޼��� ����
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()"); //MyInterface �������̽��� myMethod() �޼��� ����
	}

}
