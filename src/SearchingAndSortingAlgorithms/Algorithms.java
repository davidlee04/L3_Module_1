package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {

	public static int findBrokenEgg(List<String> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("cracked")) {
				return i;
			}
		}
		return 1;
	}

	public static int countPearls(List<Boolean> oyster) {
		int count = 0;
		for (int i = 0; i < oyster.size(); i++) {
			if (oyster.get(i) == true) {
				count++;
			}
		}
		return count;
	}

	public static double findTallest(List<Double> list) {
		double tallest = 0.0;
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				tallest = list.get(i);
			} else if (i != 0) {
				if (list.get(i) > list.get(i - 1)) {
					tallest = list.get(i);
				} else if (list.get(i - 1) > list.get(i)) {
					tallest = tallest;
				}
			}
		}
		return tallest;
	}

	public static String findLongestWord(List<String> list) {
		int length = 0;
		String answer = "";
		length = list.get(0).length();
		answer = list.get(0);
		for (int i = 1; i < list.size(); i++) {
			if (list.get(i).length() > length) {
				length = list.get(i).length();
				answer = list.get(i);
			}
		}
		return answer;
	}

	public static Boolean containsSOS(List<String> morse) {
		for (int i = 0; i < morse.size(); i++) {
			if (morse.get(i).contains("... --- ...")) {
				return true;
			}
		}
		return false;
	}

	public static List<Double> sortScores(List<Double> list) {
		double temp = 0;
		for (int j = 0; j < list.size() - 1; j++) {
			boolean swap = false;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) > list.get(i + 1)) {
					swap = true;
					temp = list.get(i + 1);
					list.set(i + 1, list.get(i));
					list.set(i, temp);
				}
			}
			if (swap == false) {
				return list;
			}
		}
		return list;
	}

	public static List<String> sortDNA(List<String> list) {
		String temp = "";
		for (int j = 0; j < list.size() - 1; j++) {
			boolean swap = false;
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).length() > list.get(i + 1).length()) {
					swap = true;
					temp = list.get(i + 1);
					list.set(i + 1, list.get(i));
					list.set(i, temp);
				}
			}
			if (swap == false) {
				return list;
			}
		}
		return list;
	}

	public static List<String> sortWords(List<String> list) {
		String temp = "";
		for (int j = 0; j < list.size() - 1; j++) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i).compareTo(list.get(i + 1)) > 0) {
					temp = list.get(i + 1);
					list.set(i + 1, list.get(i));
					list.set(i, temp);
				}
			}
		}

		return list;
	}
}