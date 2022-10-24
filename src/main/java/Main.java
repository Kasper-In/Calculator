public class Main {
    public static void main(String[] args) {
        Ints calc = new IntsCalculator();
        System.out.println("Сумма двух чисел: " + calc.sum(45, 18));
        System.out.println("Произведение двух чисел: " + calc.mult(-12, 87));
        System.out.println("Степень числа : " + calc.pow(44, 0));
    }
}
