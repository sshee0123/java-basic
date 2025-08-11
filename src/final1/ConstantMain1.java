package final1;

public class ConstantMain1 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : "+ 1000) ;
        int curUserCount = 999;
        process(curUserCount++);
        process(curUserCount++);
        process(curUserCount++);
        process(curUserCount++);
    }
    private static void process(int curUserCount) {
        System.out.println("참여자 수: "+ curUserCount);
        if(curUserCount > 1000) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
