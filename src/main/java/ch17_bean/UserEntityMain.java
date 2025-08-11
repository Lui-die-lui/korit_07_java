package ch17_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setUsername(1);
        user1.setEmail("a@test.com");
        user1.setName("이슬기");
        user1.setPassword(9876);
        System.out.println(user1);

        System.out.println(user1.getUsername());
        System.out.println("username : " + user1.getUsername());
        System.out.println("email : " + user1.getEmail());
        System.out.println("name : " + user1.getName());
        System.out.println("비밀번호는 보안 상 제공하지 않습니다.");

        UserEntityLombok user2 = new UserEntityLombok();
        user2.setUsername(2);
        user2.setEmail("a@test.com");
        user2.setName("이슬기");
        user2.setPassword(1234);
        // getter
        System.out.println("제 이름은 " + user2.getName() + "입니다.");
        // toString
        System.out.println(user2);
    }
}
