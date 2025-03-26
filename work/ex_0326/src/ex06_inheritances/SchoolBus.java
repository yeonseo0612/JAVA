package ex06_inheritances;

public class SchoolBus extends Bus{

	public SchoolBus(int peopleNum) {
		super(peopleNum);
	}
		@Override
		public void takePerson() {
			super.takePerson();
			System.out.println("학생들이 자리에 모두 착석하고 출발합니다.");
		}
		@Override
		void ride() {
			System.out.println("시속 50km로 달립니다.");
		}
	}


