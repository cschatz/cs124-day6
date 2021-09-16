	public static int mult(int a, int b) {
		// base case
		if (b == 0)
			return 0;
		
		// recursive LEAP!!!
		return mult(a, b-1) + a;
	}
	
	public static void main(String[] args) {
		System.out.println(mult(12, 12));
	}
