package cz.gyarab.e4prg.s2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MojeHistorie {
    String filename;
    List<String> data;
    Set<String> index;

    public MojeHistorie(String filename) {
        this.filename = filename;
        data = new ArrayList<>();
        index = new HashSet<>();
    }

    public void read() throws IOException {
        Path path = Paths.get(filename);
        data = Files.readAllLines(path);
    }

    public void save() throws IOException {
        Path path = Paths.get(filename);
        Files.writeString(path, this.toString());
    }

    public void addLine(String str) {
        if (!index.contains(str)) {
            data.add(str);
            index.add(str);
        }
    }

    public String toString() {
        return String.join("\n", data);
    }
}
