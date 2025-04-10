package ex05_enum;

	// 연산을 위한 Enum
	public enum Operation {
	    PLUS() {
	        @Override
	        int apply(int x, int y) {
	            return x + y;
	        }
	    },
	    MINUS() {
	        @Override
	        int apply(int x, int y) {
	            return x - y;
	        }
	    },
	    MULTI() {
	        @Override
	        int apply(int x, int y) {
	            return x * y;
	        }
	    },
	    DIV() {
	        @Override
	        int apply(int x, int y) {
	            return x / y;
	        }
	    };

	    // 추상 메서드
	    abstract int apply(int x, int y);
	}

