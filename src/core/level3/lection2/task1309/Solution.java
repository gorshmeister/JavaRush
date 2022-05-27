package core.level3.lection2.task1309;

public class Solution {
    interface CanMove {
        Double speed();
    }

    interface CanFly extends CanMove {
        Double speed(CanFly cf);
    }
}
