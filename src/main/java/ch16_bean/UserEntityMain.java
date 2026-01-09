package ch16_bean;

public class UserEntityMain {
    public static void main(String[] args) {
        UserEntity user1 = new UserEntity();
        user1.setName(1);
        user1.setPassword(9876);
        user1.setEmail("a@test.com");
        user1.setUsername("한규대");

        System.out.println(user1);
        System.out.println(user1.getName());

        UserEntityLombok user2 = new UserEntityLombok();
        UserEntityLombok user3 = new UserEntityLombok();
        System.out.println(user2.getEmail());
        user2.setPassword(2345);
        System.out.println(user2);
        System.out.println(user3);

        UserEntityLombok user4 = new UserEntityLombok(4, 3456, "D@test.com","김사");
    }
}
