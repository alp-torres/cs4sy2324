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
public class CS4TruthTorres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String greeting = "Hello world!";
        System.out.println(greeting + " Hello Pisay !");
        
        Person mark = new Person("Mark");
        Person nathan = new Person("Nathan", 28);
        mark.setFriend(nathan);
        mark.earnMoney(100);
        System.out.println(Person.getRecentWorker().getName());
        nathan.earnMoney(100);
        System.out.println(Person.getRecentWorker().getName());
        // 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
    }
    
}
