
public class Week3 {
	public static void main(String[] args) {
		int[] array = { 17, -6, 1, 5, 2, 8, 13, 6 };
		System.out.println(array[0]);
		System.out.println(array[array.length - 1]);
		// System.out.println(array[6]);
		// System.out.println(array[-1]);
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);

			for (int num : array) {
				System.out.println(num);
			}
		}
		double sum = 0;
		for (int num : array) {
			sum += num;
		}
		System.out.println(sum);
		double average = sum / array.length;
		System.out.println(average);

		for (int num : array) {
			if (num % 2 == 1) {
				System.out.println(num);
			}
		}
		String[] names = { "Sam", "Sally", "David", "etc","emagualbogenthorpe" };
		int sumOfLetters = 0;
		for (String name : names) {
			sumOfLetters += name.length();
		}
		printGreeting("Dave Matthews");
		System.out.println(returnGreeting("Dave Ghrol"));
		System.out.println(lengthChecker("fun times", 7));
		System.out.println(testExists(names, "Sam"));
		System.out.println(findSmallest(array));
		double[] a = { 69.420, 86.454, 0.1234 };
		System.out.println(findAverage(a));
		for (int j : countStrings(names)) {
			System.out.println(j);
		}
		System.out.println(countStrings(names));
		System.out.println(checkEvenOrOdd(names));
		System.out.println("pal:");
		System.out.println(checkPalindrome("Poop"));

	}

	public static void printGreeting(String name) {
		System.out.println("Hello " + name + ", Welcome to software jail.");
	}

	public static String returnGreeting(String name) {
		return "Hello " + name;
	}

	public static boolean lengthChecker(String s, int i) {
		if (i < s.length()) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean testExists(String[] a, String s) {
		boolean result = false;
		for (String str : a) {
			if (s.equals(str)) {
				result = true;
			}
		}
		return result;
	}

	public static int findSmallest(int[] array) {
		int result = array[0];
		for (int num : array) {
			if (num < result) {
				result = num;
			}
		}
		return result;
	}

	public static double findAverage(double[] array) {
		double d = 0;
		for (double db : array) {
			d += db;
		}
		d /= array.length;
		return d;

	}

	public static int[] countStrings(String[] array) {
		int l = array.length;
		int[] result = new int[l];
		for (int i = 0; i < l; i++) {
			result[i] = array[i].length();
		}
		return result;
	}
	
	public static boolean checkEvenOrOdd(String[] array) {
		int e = 0;
		int o = 0;
		for(String s: array) {
			if (s.length()%2==0) {
				e += s.length();
			} else {
				o += s.length();						
			}
		}
		if (e > o) {
			return true;
		}else {
			return false;
		}
	}
	
	public static boolean checkPalindrome(String s) {
		int l = s.length()-1;
		int n = 0;
		boolean result = true;
		while (n <= l) {
			if (s.charAt(n) != s.charAt(l)) {
				result = false;

			}
			n++;
			l--;
		}
		return result;
	}
	
	
	
}
