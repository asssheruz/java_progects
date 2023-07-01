import java.util.Scanner;

/**
 * program
 */
public class program {

	public static void main(String[] args) {
		// Тип данных:
		// int a = 13;
		// short age = 10;
		// double pi = 3.1415;
		// char ch = '1';
		// float f = 45.25f;
		// var i = 123;
		// var b = 34.456;
		// //Character.DIRECTIONALITY_EUROPEAN_NUMBER;
		// String s = "qwer";
		// s.charAt(1);

		// System.out.println(a);
		// System.out.println(age);
		// System.out.println(pi);
		// System.out.println(ch);
		// System.out.println(f);
		// System.out.println(i);
		// System.out.println(b);
		// System.out.println(Integer.MAX_VALUE);
		// System.out.println(s);
		// // Операции Java:
		// int d = 123;
		// d = --d - d - d;
		// boolean g = 123 > 234;

		// System.out.println(++d); //префексного инкремент;
		// System.out.println(d++); //порфексного инкремент;
		// System.out.println(d);
		// System.out.println(g);

		// int q = 18;
		// //10010
		// //q = q << 1;
		// System.out.println(q >> 1);
		// //1001
		// int h = 5;
		// int k = 2;
		// System.out.println(h ^ k);
		// //101
		// //010
		// //111 -|; //000 - &;

		// String r = "qwwe1"; //5, 0...4
		// // boolean l = "qwer";
		// boolean u = r.length() > 5 | r.charAt(4) == '1'; //как написат >= в месте;
		// System.out.println(u);

		// Массыв
		// int [] arr = new int [10];
		// arr[3] = 13;

		// System.out.println(arr[3]);

		// int[][] arr = new int[3][5];
		// for (int i = 0; i < arr.length; i++) {
		// for (int j = 0; j < arr[i].length; j++) {
		// System.out.printf("&d ", arr[i][j]);
		// }
		// System.out.println();
		// }

		// byte b = Byte.parseByte("12"); //ошибка 1243
		// System.out.println(b);

		// int[] a = new int[10];
		// double[] d = a; // изучаем ковариантность и контравариантность

		// Scanner iScanner = new Scanner(System.in);
		// System.out.println("name: ");
		// String name = iScanner.nextLine();
		// System.out.printf("Привет, %s!\n", name);
		// iScanner.close();

		Scanner iScanner = new Scanner(System.in);
		System.out.printf("int a: ");
		int x = iScanner.nextInt();
		System.out.printf("double a: ");
		double y = iScanner.nextDouble();
		System.out.printf("%d + %f = %f", x, y, x + y);
		iScanner.close();

	}
}