package com.harshitbhardwaj.extras;

import com.harshitbhardwaj.utils.ClassFilesCreator;
import com.harshitbhardwaj.utils.DirectoryCreator;
import com.harshitbhardwaj.utils.TestClassCreator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MethodNameFetcher {

    private static final String BASE_URL = "https://codingbat.com/java/";
    private WebDriver driver;
    private WebDriverWait wait;

    private static final String PROBLEM_LINK_XPATH = "//div[@class='tabin']//table/tbody/tr/td/a";
    private final By currentPageHeading = By.cssSelector("div.indent > span");
    private final By problemLink = By.xpath(PROBLEM_LINK_XPATH);

    private static final Map<String, String> validLinks = new HashMap<>();

    /*
    private final ValidLinkNames section = ValidLinkNames.warmup1;
    */
    private final ValidLinkNames section = ValidLinkNames.array1;

    @BeforeTest
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void getMethods() {
        Map<String, String> validLinks = Links.getLinksMap();
        String currentLink = validLinks.get(section.toString());

        if (currentLink == null) {
            throw new RuntimeException("Invalid Link passed, " +
                    "check the Links.validLinks map and pass the correct link");
        }

        String finalUrl = BASE_URL + currentLink;
        System.out.printf(" ====== Fetching all the method names available at %s ====== %n", finalUrl);

        driver.get(finalUrl);

        Assert.assertEquals(driver.findElement(currentPageHeading).getText(), currentLink);

        List<WebElement> problemsList = driver.findElements(problemLink);

        // Create the package for the current problems
        DirectoryCreator.createDirectory(section.toString());

        for (WebElement problem : problemsList) {
            processProblem(problem);
        }
    }

    private void processProblem(WebElement problem) {
        String currentProblemLink = problem.getText();
        String solutionClassName = capitalizeFirstLetter(currentProblemLink) + "Solution";
        String testClassName = capitalizeFirstLetter(currentProblemLink) + "Tests";

        System.out.printf("Current methodName and the generatedClassName -> %s and %s \n",
                currentProblemLink, solutionClassName);

        // Navigate to current problem
        driver.findElement(By.xpath(PROBLEM_LINK_XPATH + "[.='" + currentProblemLink + "']"))
                .click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.ace_content")));

        // To add the current problem's URL in the solution class
        String problemUrl = driver.getCurrentUrl();

        System.out.printf("Current problemUrl -> %s\n", problemUrl);

        Assert.assertEquals(driver.findElement(By.cssSelector("span.h2:nth-child(2)")).getText()
                , currentProblemLink);

        String methodText = driver.findElement(By.cssSelector("div.ace_content")).getText();
        System.out.println(methodText);
        System.out.println("==============");

        // Extract return type from method text
        String returnType = extractReturnType(methodText);

        // Create solution file
        ClassFilesCreator.createClass(section.toString(), solutionClassName, problemUrl, methodText, returnType);

        // Create test file
        TestClassCreator.generateTestClass(section.toString(), testClassName, solutionClassName);

        driver.navigate().back();
    }

    private static String extractReturnType(String methodText) {
        // Regex to capture return type including arrays and generics
        String regex = "^public\\s+([\\w<>,\\[\\]]+)\\s+\\w+\\(";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(methodText);

        if (matcher.find()) {
            String returnType = matcher.group(1).trim();

            // Remove generic type parameters if any
            String cleanReturnType = returnType.replaceAll("<.*>", "");

            // Handle array types
            if (cleanReturnType.endsWith("[]")) {
                return "null"; // For array types, return null
            }

            return cleanReturnType;
        }

        return "void"; // Default to void if no return type is found
    }

    private String capitalizeFirstLetter(String text) {
        return text.substring(0, 1).toUpperCase() + text.substring(1);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}