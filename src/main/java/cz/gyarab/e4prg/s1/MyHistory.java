package cz.gyarab.e4prg.s1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class MyHistory {
    String fileName;
    Set<String> index;
    List<String> data;


    public MyHistory(String fileName) {
        this.fileName = fileName;
        index = new HashSet<>();
        data = new ArrayList<>();
    }

    public void read() throws IOException {
            data = Files.readAllLines(Paths.get(fileName));
    }

    public void save() throws IOException {
        Files.writeString(Paths.get(fileName), this.toString());
    }

    public void addLine(String str) {
        if (index.contains(str)) {
            return;
        }

        index.add(str);
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
