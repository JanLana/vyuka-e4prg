package cz.gyarab.e4prg.s1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyHistory {
    String fileName;
    Set<String> data;

    public MyHistory(String fileName) {
        this.fileName = fileName;
        data = new HashSet<>();
    }

    public void read() {
        try {
            data = new HashSet<>(Files.readAllLines(Paths.get(fileName)));
        } catch(IOException ex) {
        }
    }

    public void save() throws IOException {
        Files.writeString(Paths.get(fileName), this.toString());
    }

    public void addLine(String str) {
        data.add(str);
    }

    public String toString() {
        String out = "";
        for(String line: data) {
            out += line + "\n";
        }
        return out;
    }
}
