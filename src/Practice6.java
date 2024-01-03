public class Practice6 {
    public static int CalcFibonacci(int n) {
        if (n <= 1) {
            return n;
        }else {
            return CalcFibonacci(n - 1) + CalcFibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        int result = CalcFibonacci(5);
        System.out.println(result);
    }
    public class practice4{
        //1부터 n까지의 합을 계산하는 함수
        public static int sum(int n){
            if (n == 1) {
                return n;
            }else {
                return sum(n-1)+n;
            }

        }

        public static void main(String[] args){

            int result = sum(4);
            System.out.println("1부터 10까지의 합(for문) : "+ result);
        }
    }

}
