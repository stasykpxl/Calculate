package by.spartakzatawit;

import by.spartakzatawit.translation.NumberFormatTranslation;


public class Numbers {
	private int firstNum;
	private int secondNum;
	private static boolean IS_TRANSLATION = false;
	private static int IS_TRANSLATION_NUM = 0;
	
	public Numbers() {
		super();
	}

	public Numbers(String firstNum, String secondNum) {
		super();
		setLFirstNumist(firstNum);
		setSecondNum(secondNum);
	}

	public int getFirstNum() {
		return firstNum;
	}
	
	public int getSecondNum() {
		return secondNum;
	}

	public void setLFirstNumist(String num) {
		if (isNumeric(num)) {
			firstNum = Integer.parseInt(num);
		} else {
			firstNum = NumberFormatTranslation.romanToArabic(num);
			IS_TRANSLATION = true;
			IS_TRANSLATION_NUM++;
		}
	}
	
	public void setSecondNum(String num) {
		if (isNumeric(num)) {
			secondNum = Integer.parseInt(num);
		} else {
			secondNum = NumberFormatTranslation.romanToArabic(num);
			IS_TRANSLATION = true;
			IS_TRANSLATION_NUM++;
		}
	}	
	
	public String calculation(int num1, int num2, String operation) {
		if (IS_TRANSLATION_NUM != 1) {
			int result = 0;	
			switch (operation) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			default:
				break;
			}
			if (IS_TRANSLATION) {
				String resultRom = NumberFormatTranslation.arabicToRoman(result);
				return resultRom;
			} else {
				return String.valueOf(result);
			}
		} else {
			throw new NumberFormatException();
		}	
	}	
	
	public static boolean isNumeric(String str)  
	{  
	  try  {  
	    int d = Integer.parseInt(str);  
	  }  catch(NumberFormatException nfe) {  
	    return false;  
	  }  
	  return true;  
	}
}
