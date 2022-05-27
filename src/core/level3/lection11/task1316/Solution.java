package core.level3.lection11.task1316;

public class Solution {
    public static void main(String[] args) {
        System.out.println(SimpleObject.NAME);
        System.out.println(Button.NAME);
    }

    interface SimpleObject {
        String NAME = "SimpleObject";
    }

    interface Button extends SimpleObject {
        final String NAME = "Submit";
        String onPress(Object o);
    }
}
