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
