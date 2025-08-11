package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId", "park");
        member.print();
        member.changeData("ss","kim"); // id final 이라 바뀌지 않음.
        member.print();
    }
}
