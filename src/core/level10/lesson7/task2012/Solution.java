package core.level10.lesson7.task2012;

/*
OutputToConsole
*/

import java.io.*;

public class Solution {
    public static String greeting = "Hello world";

    /**
     * OutputToConsole is an inner base class for improving your attentiveness.
     * An OutputToConsole object encapsulates the information needed
     * for displaying the [greeting] variable to the console.
     *
     * @author JavaRush
     */
    public static class OutputToConsole implements Externalizable {
        private int counter;

        /**
         * @param out A stream for externalization
         * @throws IOException
         */
        @Override
        public void writeExternal(ObjectOutput out) throws IOException {
            out.writeInt(counter);
        }

        /**
         * @param in A stream for de-externalization
         * @throws java.io.IOException
         * @throws ClassNotFoundException
         */
        @Override
        public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
            counter = in.readInt();
        }

        /**
         * Public constructor with no parameters.
         */
        public OutputToConsole() {
        }

        /**
         * Class constructor that sets the private counter field.
         */
        public OutputToConsole(int counter) {
            this.counter = counter;
        }

        /**
         * Prints greeting message to console counter times.
         */
        public void printMessage() {
            for (int i = 0; i < counter; i++) {
                System.out.println(greeting);
            }
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        FileOutputStream fos = new FileOutputStream("D:\\IDEA_project\\src\\core\\level10\\lesson7\\task2012\\text");
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        OutputToConsole outputToConsole = new OutputToConsole(5);
//
//        outputToConsole.writeExternal(oos);
//
//        oos.close();
//
//        System.out.println("Object saved!");


        FileInputStream fis = new FileInputStream("D:\\IDEA_project\\src\\core\\level10\\lesson7\\task2012\\text");
        ObjectInputStream ois = new ObjectInputStream(fis);

        OutputToConsole outputToConsole = new OutputToConsole();

        outputToConsole.readExternal(ois);

        ois.close();

        outputToConsole.printMessage();

    }
}