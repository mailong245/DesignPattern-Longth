package vn.vds.designpattern.apdapter;

public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("WildTurkey: Gobble gobble");
    }
    public void fly() {
        System.out.println("WildTurkey: fly");
    }
}
