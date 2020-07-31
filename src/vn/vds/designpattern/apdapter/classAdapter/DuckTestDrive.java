package vn.vds.designpattern.apdapter.classAdapter;

import vn.vds.designpattern.apdapter.Duck;
import vn.vds.designpattern.apdapter.MallarDuck;
import vn.vds.designpattern.apdapter.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallarDuck duck = new MallarDuck();
        WildTurkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter();
        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();
        System.out.println("\nThe Duck says...");
        showDuck(duck);
        System.out.println("\nThe TurkeyAdapter says...");
        showDuck(turkeyAdapter);
    }

    static void showDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}