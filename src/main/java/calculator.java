public class calculator {
    public static int add(int ...a){
        int sum = 0;
        for (int i : a){
            sum += i;
        }
        return sum;
    }

    public static int multiply(int ...a){
        int product = 1;
        for (int i : a){
            product *= i;
        }
        return product;
    }
}
