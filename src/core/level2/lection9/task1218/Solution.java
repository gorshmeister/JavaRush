package core.level2.lection9.task1218;

public class Solution {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanMove {
        public void move();
    }

    public interface CanEat {
        public void eat();
    }

    public class Dog implements CanEat, CanMove {
        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    public class Duck implements CanFly, CanMove, CanEat {

        @Override
        public void eat() {

        }

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }

    public class Airplane implements CanFly, CanMove {

        @Override
        public void fly() {

        }

        @Override
        public void move() {

        }
    }

}