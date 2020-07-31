package vn.vds.designpattern.apdapter.classAdapter;

import vn.vds.designpattern.apdapter.Duck;
import vn.vds.designpattern.apdapter.WildTurkey;

public class TurkeyAdapter extends WildTurkey implements Duck {

    @Override
    public void quack() {
        super.gobble();
    }

    @Override
    public void fly() {
        super.fly();
    }
}
