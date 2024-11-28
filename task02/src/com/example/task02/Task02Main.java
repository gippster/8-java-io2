package com.example.task02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Task02Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println(listFiles(Paths.get("task02/src/main/resources/")));
    }

    public static List<Path> listFiles(Path rootDir) throws IOException, InterruptedException {

        List<Path> result = new ArrayList<>();
        try(Stream<Path> paths = Files.walk(rootDir))
        {
            paths.filter(ins -> ins.toFile().isFile()).forEach(result::add);
        }
        return result;
    }
}
