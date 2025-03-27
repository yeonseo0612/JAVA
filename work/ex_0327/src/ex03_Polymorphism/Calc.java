package ex03_Polymorphism;

public class Calc extends Calculator{
	
	
	   @Override
	    public int add(int a, int b) {
	        return a + b;
	    }

	
	 
	    @Override
	    public int substract(int a, int b) {
	        return a - b;
	    }

	  
	    @Override
	    public double average(int[] a) {
	        int sum = 0;
	        for (int num : a) {
	            sum += num;
	        }
	        return sum / (double) a.length;
	
	    }
	}

