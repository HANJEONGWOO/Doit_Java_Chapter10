package interfaceex;

public class MyClassTest {
	public static void main(String[] args) {
		MyClass mClass = new MyClass();
		
		//���� �������̽� x������ �����ϸ� x�� ������ �޼��常 ȣ�� ����
		X xClass = mClass;
		xClass.x();
		
		//���� �������̽� y������ �����ϸ� y�� ������ �޼��常 ȣ�� ����
		Y yClass = mClass;
		yClass.y();
		
		//������ �������̽��� ������ �����ϸ� �������̽��� ����� ��� �޼��� ȣ�� ����
		MyInterface iClass = mClass;
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
