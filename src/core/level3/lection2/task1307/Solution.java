package core.level3.lection2.task1307;

public class Solution {
    public static void main(String[] args) {

    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String> {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }

}
