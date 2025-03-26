package access;

import ex05_interface.DefaultA;

public class PublicB {
	//Default 클래스가 default제한이라서 다른 패키지에서 만들어지지 않는다.
	DefaultA a = new DefaultA();
	a.variableC = 10;
}
