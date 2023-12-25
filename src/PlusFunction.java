public class PlusFunction {
    public static void main(String[] args)  {
        HelloWorld(4); // HelloWorld 출력 메서드 호출
    }

    // HelloWorld 출력 메서드 선언
    public static void HelloWorld(int n)
    {
        // n이 0인 경우 return
        if(n == 0)
            return;

        System.out.println("HelloWorld"); // HelloWorld 출력
        HelloWorld(n-1); // 재귀함수 시작
    }
}