package org.example.prototype;

public class Game implements Cloneable {
    private int id;
    private String name;
    private Address address;

    public Game() {
    }

    Game(Game game) {
        this.id = game.id;
        this.name = game.name;
        this.address = new Address();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Game{" +
                "address=" + address +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public Game clone() throws CloneNotSupportedException {
        Game game = (Game) super.clone();
        game.setAddress(new Address());
        return game;
    }
}
