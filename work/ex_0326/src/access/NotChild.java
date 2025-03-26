package access;

import ex05_interface.Parent;

public class NotChild {
	void accessTest() {
		Parent p2 = new Parent();
		super.access;
		p2.accessProtected();
	}
}
