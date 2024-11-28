public class Main {
    public static void main(String[] args) {
        Add add = (x1, x2) -> {
            int sum = 0;
            for(int i = x1; i <= x2; i++){
                sum += i;
            }
            return sum;
        };

        if(args.length < 2){
            System.out.println("Provide two ints: ");
            return;
        }
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        System.out.println("Sum of Numbers: " + add.range(num1, num2));
    }
}
