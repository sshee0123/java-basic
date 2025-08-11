package final1;

public class ConstantMain2 {
    public static void main(String[] args) {
        System.out.println("프로그램 최대 참여자 수 : "+ Constant.MAX_USERS) ;
        int curUserCount = 999;
        process(curUserCount++);
        process(curUserCount++);
        process(curUserCount++);
        process(curUserCount++);
    }
    private static void process(int curUserCount) {
        System.out.println("참여자 수: "+ curUserCount);
        if(curUserCount > Constant.MAX_USERS) {
            System.out.println("대기자로 등록합니다.");
        } else {
            System.out.println("게임에 참여합니다.");
        }
    }
}
