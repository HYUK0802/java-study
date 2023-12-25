public class practice3 {
    public static void main(String[] args) {
        Hello(4);
    }
    public static void Hello(int num){
        if (num == 0){
            return;
        }
        else {
            System.out.println("hello");
            Hello(num -1);
        }

    }
}
