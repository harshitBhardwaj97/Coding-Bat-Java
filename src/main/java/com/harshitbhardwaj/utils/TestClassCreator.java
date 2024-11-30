package com.harshitbhardwaj.utils;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClassCreator {

    public static boolean generateTestClass(String packageName, String testClassName,
                                            String tests, String solutionClassName) {
        String classContent = createTestClassContent(packageName, testClassName, tests, solutionClassName);
        Path baseDir = Paths.get("src/test/java/com/harshitbhardwaj/tests", packageName);
        Path classFile = baseDir.resolve(testClassName + ".java");

        try {
            if (!Files.exists(classFile)) {
                Files.createDirectories(baseDir);
                Files.write(classFile, classContent.getBytes());
                System.out.println("Test class created successfully: " + classFile.toAbsolutePath());
                return true;
            } else {
                System.out.println("Test class already exists: " + classFile.toAbsolutePath());
                return false;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static String createTestClassContent(String packageName,
                                                 String testClassName, String tests, String solutionClassName) {

        String baseName = convertClassNameToCamelCase(testClassName.replace("Tests", ""));

        // Format the tests string to include correct indentation
        String formattedTests = formatTestCases(tests);

        return String.format(
                """
                        package com.harshitbhardwaj.tests.%s;
                           \s
                        import com.harshitbhardwaj.solutions.%s.%s;
                        import org.testng.Assert;
                        import org.testng.annotations.Test;
                           \s
                        public class %s {
                           \s
                           /*
                           %s
                           */
                            \s
                            @Test
                            public void %sTestOne() {
                               Assert.fail("Test not yet implemented.");
                            }
                           \s
                            @Test
                            public void %sTestTwo() {
                               Assert.fail("Test not yet implemented.");
                            }
                           \s
                            @Test
                            public void %sTestThree() {
                               Assert.fail("Test not yet implemented.");
                            }
                        }""",
                packageName, packageName, solutionClassName, testClassName, formattedTests,
                baseName, baseName, baseName
        );
    }

    private static String formatTestCases(String testCases) {
        // Split the test cases into lines
        String[] lines = testCases.split("\n");

        // Create a formatted string with indentation and line breaks
        StringBuilder formattedTests = new StringBuilder();
        for (int i = 0; i < lines.length; i++) {
            // Add each line with the correct indentation
            if (i != 0) {
                formattedTests.append("   ");
            }
            formattedTests.append(lines[i]);
            if (i != lines.length - 1) {
                formattedTests.append("\n");
            }
        }
        return formattedTests.toString();
    }

    private static String convertClassNameToCamelCase(String className) {

        // Convert the first letter to lowercase and return
        return className.substring(0, 1).toLowerCase() + className.substring(1);
    }
}
