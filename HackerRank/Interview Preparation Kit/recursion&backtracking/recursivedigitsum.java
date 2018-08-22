static int solve(String n, int k) {
		long result = (long) computeDigitSum(n) * k;
		while (result >= 10) {
			result = computeDigitSum(String.valueOf(result));
		}
		return (int) result;
	}

	static int computeDigitSum(String s) {
		return s.chars().map(ch -> ch - '0').sum();
	}