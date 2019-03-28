package Practicas;
import java.util.Scanner;

public class ClaseIniciadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] nums = new int[10];
		
		System.out.println("Ingrese un valor base");
		int x = sc.nextInt();
		System.out.println("Ingrese 10 valores mas");
		for (int i = 0; i < nums.length ; i++){
			System.out.println("valor nº " + (i+1) + " :");
			nums[i] = sc.nextInt();
		}
		System.out.println("De esos 10 valores, son mayores a "+ x + " los sig. numeros:");
		for (int num : nums) {
			if (num > x) {
				System.out.println(num);
			}
		}
		sc.close();
}
}
