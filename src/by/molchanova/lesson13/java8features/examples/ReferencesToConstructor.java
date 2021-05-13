package by.molchanova.lesson13.java8features.examples;

public class ReferencesToConstructor {
    public static void main(String[] args) {

//        UserBuilder ub = new UserBuilder() {
//            @Override
//            public User newUser() {
//                return new User();
//            }
//        };
//        UserBuilder ub2 = () -> new User();

        UserBuilder builder = User::new;
        UserBuilder2 builder2 = User::new;

        User user1 = builder.newUser();
        User user2 = builder2.newUser("Test");
        System.out.println(user2.getName());

    }

}

class User {
    private String name;

    public User() {
    }

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

@FunctionalInterface
interface UserBuilder {
    User newUser();
}

@FunctionalInterface
interface UserBuilder2 {
    User newUser(String name);
}
