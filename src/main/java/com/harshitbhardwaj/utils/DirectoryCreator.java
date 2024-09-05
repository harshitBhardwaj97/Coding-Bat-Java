package com.harshitbhardwaj.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryCreator {

    private static final String userDir = System.getProperty("user.dir");

    public static boolean createDirectory(String packageName) {
        String relativePath = "src/main/java/com/harshitbhardwaj/solutions/" + packageName;
        Path targetDir = Paths.get(userDir, relativePath);

        try {
            Files.createDirectories(targetDir);
            System.out.println("Directory created successfully: " + targetDir.toAbsolutePath());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
