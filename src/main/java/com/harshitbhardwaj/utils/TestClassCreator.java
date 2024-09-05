package com.harshitbhardwaj.utils;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClassCreator {

    public static boolean generateTestClass(String packageName, String testClassName, String solutionClassName) {
        String classContent = createTestClassContent(packageName, testClassName, solutionClassName);
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

    private static String createTestClassContent(String packageName, String testClassName, String solutionClassName) {

        String baseName = testClassName.replace("Tests", "").toLowerCase();

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
                         }
                        \s""",
                packageName, packageName, solutionClassName, testClassName,
                baseName, baseName, baseName
        );
    }
}