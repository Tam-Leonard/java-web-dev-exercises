package exercises.technology.Main;

public abstract class AbstractEntity {
    //cant be created by itself so needs to be added at the top of the order on the computer class
    //with the Computer extends AbstractEntity

    private int id;
    private static int nextId = 1;

    //constructor (adds id for us)
    public AbstractEntity() {
        //we need to create something that increments so every id created is UNIQUE!
        //we can use a static variable. no matter how may times used, it will always stay consistent
        //what this code is saying, whatever the nextId is, increment nextId, the next instance created willhave
        //an id of 2
        this.id = nextId;
        nextId++;
    }

    //Methods
    public int getId() { return this.id; }
    //getters are fine for id's but setters are not typically what you want to have for id's
    //went back to program class to test this
}
