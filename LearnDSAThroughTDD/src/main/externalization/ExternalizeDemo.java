package main.externalization;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class ExternalizeDemo implements Externalizable {
    int number;
    String name;
    String email;

    public ExternalizeDemo() {
        System.out.println("no arg constructor called");
    }

    public ExternalizeDemo(int number, String name, String email) {
        this.number = number;
        this.name = name;
        this.email = email;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        System.out.println("write external method been called");
        out.writeObject(name);
        out.writeObject(email);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        String s = (String)in.readObject();
    }
}
