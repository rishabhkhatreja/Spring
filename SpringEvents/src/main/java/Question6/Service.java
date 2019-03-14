package Question6;

import java.io.IOException;

public class Service {
    public void display() throws IOException {
        System.out.println("Without args");
        throw new IOException();
    }

    public void display(int a, int b) throws IOException {
        System.out.println("With two args");
        throw new IOException();
    }

    public void display(int a) throws IOException {
        System.out.println("With single args");
        throw new IOException();
    }

}
