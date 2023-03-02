package lesson017;

import java.util.Stack;

public class StackOrnek {
	
	public static void main(String[] args) {
		// ekleme işlemi
		
		// Stack --> (LIFO) last in first out
		// bir tane stack oluşturalım
		// bir kaç tane int değer atalım
		// bu stack'i yazdıralım
		
		// stack boşalana kadar bütün elemanları çıkartalım
		// çıkarılan her elemanı yazdıralım
		
		Stack<Integer> stack = new Stack<>();
		Stack<Integer> yeniStack = new Stack<>();
		stack.add(50);
		stack.add(10);
		stack.add(110);
		stack.add(150);
		stack.push(70);
		stack.add(95);
		
//		int sayi = stack.push(70);
//		System.out.println(sayi + "***");
//		boolean sayi2 = stack.add(95);
//		
//		for(Integer integer : stack) {
//			System.out.println(integer);
//		}
//		
//		while(!stack.isEmpty()) {
//			System.err.println(stack.pop()); 
//		}
		
		// 100'den küçük değerleri toplayıp stack'ten çıkaralım
		// 100'den büyükleri de farklı bir stack'in içine atalım
		// hem toplamı hem de yeni stack'i yazdıralım
		
		int toplam =0;
		while(!stack.isEmpty()) {
			if(stack.peek() < 100) {
				toplam += stack.pop();
			}else {
				yeniStack.push(stack.pop());
			}
		}
		System.out.println(toplam);
		for(Integer integer : yeniStack) {
			System.out.println(integer);
		}
		
		int size = stack.size();
		
		for (int i = size-1; i <=0; i--) {
			
			toplam += stack.remove(i);
		}
		
		
		
		
	}
	
}
