package tooHot;

public class Main {

	public static void main(String[] args) {
		
		int temp = 90;
		boolean isSummer = false;
		
		System.out.println(isItHotOrNot(temp, isSummer));
		
	}
	
	public static boolean isItHotOrNot(int temp, boolean isSummer) {
		if(isSummer) {
			if(temp >= 60 && temp <= 100) {
				return true;
			} else {
				return false;
			}
		} else {
			if(temp >= 60 && temp <= 90) {
				return true;
			} else {
				return false;
			}
		}
	}
	
}
