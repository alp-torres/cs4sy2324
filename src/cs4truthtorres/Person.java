/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs4truthtorres;

/**
 *
 * @author TRUTH
 */
public class Person {
    private String name;
    private int age;
    private double money;
    private Person friend;
    private static Person recentWorker;
    
    public Person(String name){
        this.name = name;
        this.age = 0;
        this.money = 0;
}

public Person(String name, int age){
        this.name = name;
        this.age = 0;
        this.money = 0;
}

public void birthday(){
    this.age++;
}

public void setFriend(Person newFriend){
    this.friend = newFriend;
}

public void earnMoney(double increase){
    this.setMoney(this.getMoney() + increase);
    recentWorker = this;
}

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @return the money
     */
    public double getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(double money) {
        this.money = money;
    }

    /**
     * @return the friend
     */
    public Person getFriend() {
        return friend;
    }
    public static Person getRecentWorker(){
        return recentWorker;
    }
}