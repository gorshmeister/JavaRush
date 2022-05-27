package core.level8.lection8.task1812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QuestionFileOutputStream implements AmigoOutputStream {
    private AmigoOutputStream AmigoOS;

    public QuestionFileOutputStream(AmigoOutputStream outputStream) {
        this.AmigoOS = outputStream;
    }


    @Override
    public void flush() throws IOException {
        AmigoOS.flush();
    }

    @Override
    public void write(int b) throws IOException {
        AmigoOS.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        AmigoOS.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        AmigoOS.write(b, off, len);
    }

    @Override
    public void close() throws IOException {
        System.out.println("Вы действительно хотите закрыть поток? Д/Н.");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            reader.readLine();
            if (reader.equals("Д")) AmigoOS.close();
        }

    }
}
