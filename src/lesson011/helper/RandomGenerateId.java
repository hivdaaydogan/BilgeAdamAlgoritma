package lesson011.helper;

import java.util.Random;

public class RandomGenerateId {
	
	public static String generateId() {
		Random random = new Random();
		int intRandomNumber = random.nextInt(1000,10000);
		String randomId = Integer.toString(intRandomNumber);
		return randomId;
	}
	
	//Product ismine göre bitane cod oluşturcaz
	public static String generateProductCode(String name) {
		String code = generateId();
		String newCode = name.substring(0,3) + code;
		return newCode;
	}
	
	public static String generateProductCodeWithStringBuidler(String name) {
		String newCode = name.substring(0,3);
		StringBuilder stringBuilder = new StringBuilder();
		String randomNumber = generateId();
		stringBuilder.append(newCode + randomNumber);
		return stringBuilder.toString();
	}
	
}
