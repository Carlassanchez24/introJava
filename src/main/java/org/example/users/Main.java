package org.example.users;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Ana", "Calo");
        User user2 = new User("Leo", "Saez");
        User user3 = new User("Carmen", "Alonso");

        User[] users = {user1, user2, user3};

        //utilizando algun bucle imprime los fullnames de 3 usuarios diferentes
        for (User user : users) {
            System.out.println(user.fullname());
        }

    }
}
