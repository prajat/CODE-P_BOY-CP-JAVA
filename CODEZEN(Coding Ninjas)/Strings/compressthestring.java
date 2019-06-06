public static String compress(String inputString) {
		String compressedString = "";
		int i, count;
		for (i = 0; i < inputString.length(); i++) {
			count = 0;
			if (i == inputString.length() - 1) {
				compressedString += inputString.charAt(i);
				break;
			}
			for (int j = i + 1; j < inputString.length(); j++) {
				if (j == inputString.length() - 1 && inputString.charAt(j) == inputString.charAt(i)) {
					compressedString += inputString.charAt(i) + Integer.toString(count + 2);
					return compressedString;
				}
				if (inputString.charAt(j) == inputString.charAt(i)) {
					count++;	
					continue;
				}
				if (count >= 1) {
					compressedString += inputString.charAt(i) + Integer.toString(count + 1);
					i = j - 1;
					break;
				} else {
					compressedString += inputString.charAt(i);
					i = j - 1;
					break;
				}
			}
		}
		return compressedString;
	}