package org.example.prototype;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("test");
        game1.setAddress(new Address());
        System.out.println(game1);

        Game game2 = game1.clone();
        System.out.println(game2);

        System.out.println(new Game(game1));

    }


}
