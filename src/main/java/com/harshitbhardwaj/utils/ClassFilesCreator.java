package com.harshitbhardwaj.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ClassFilesCreator {

    public static boolean createClass(String packageName, String className, String methodText, String returnType) {
        // Extract method signature
        String methodSignature = extractMethodSignature(methodText);

        // Generate return statement
        String returnStatement = getReturnStatement(returnType);

        // Generate class content
        String classContent = String.format(
                """
                         package com.harshitbhardwaj.solutions.%s;
                                                \s
                         import java.util.List;
                         import java.util.Map;

                         public class %s {

                              %s  {
                                 %s
                             }

                         }
                        \s""",
                packageName, className, methodSignature, returnStatement
        );

        // Define file path
        Path baseDir = Paths.get("src/main/java/com/harshitbhardwaj/solutions", packageName);
        Path classFile = baseDir.resolve(className + ".java");

        try {
            if (!Files.exists(classFile)) {
                Files.write(classFile, classContent.getBytes());
                System.out.println("Class file created successfully: " + classFile.toAbsolutePath());
                return true;
            } else {
                System.out.println("Class file already exists: " + classFile.toAbsolutePath());
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static String extractMethodSignature(String methodText) {
        int publicIndex = "public ".length();
        methodText = methodText.replace("{", "").replace("}", "").trim();

        return new StringBuilder(methodText)
                .insert(publicIndex, "static ")
                .toString();
    }

    private static String getReturnStatement(String returnType) {
        return switch (returnType) {
            case "int" -> "return 0;";
            case "double" -> "return 0.0;";
            case "boolean" -> "return false;";
            default -> "return null;";
        };
    }
}