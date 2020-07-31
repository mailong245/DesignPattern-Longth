package vn.vds.designpattern.apdapter.objectAdapter;


import vn.vds.designpattern.apdapter.Duck;
import vn.vds.designpattern.apdapter.Turkey;

public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        turkey.fly();
    }
}
