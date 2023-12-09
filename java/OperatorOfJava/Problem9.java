
//Take a 4 digit number. Write a program to display a number whose digits are 2 greater than the corresponding
// digits of the number TAKEN.
//For example, if the number which was taken is 5696, then the displayed number should be 7818.

class Problem9 {
    public static void main(String[] args) {
        int num = 5696, num1, num2, num3, num4, total, a, b, c, d;
        num1 = num / 1000; // 5
        System.out.println(num1);
        num2 = num % 10; // 6
        System.out.println(num2);
        num3 = (num / 10) % 10; // 569%10 =9
        System.out.println(num3);

        num4 = (num / 100) % 10; // 56%10 =6
        System.out.println(num4);
        a = num1 + 2;
        b = num2 + 2;
        c = num3 + 2;
        d = num4 + 2;

        total = (a * 1000) + (b * 100) + (c * 10) + (d);
        System.out.println("The result will be :- " + total);

    }

}
