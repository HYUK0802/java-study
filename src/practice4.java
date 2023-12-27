public class practice4{
    //1부터 n까지의 합을 계산하는 함수
    public int sum(int n){
        int answer=0;
        for(int i=1;i<=n;i++){
            answer+=i;
        }
        return answer;
    }

    public static void main(String[] args){
        int n=10;
        practice4 rf = new practice4();
        System.out.println("1부터 10까지의 합(for문) : "+ rf.sum(n));
    }
}
