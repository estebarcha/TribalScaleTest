import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FactorialTestCases {
    public static void  main(String[]args){
        WebDriver driver = new ChromeDriver();
        try {
            /**Test Case #1**/
            /**Open Website**/
            driver.get("https://qainterview.pythonanywhere.com/");
            /**Click on input field**/
            WebElement inputfield = driver.findElement(By.id("number"));
            inputfield.click();
            /**Input an @ in input field**/
            inputfield.sendKeys("@");
            /**Find and click "Calculate!"**/
            WebElement submitButton = driver.findElement(By.id("getFactorial"));
            submitButton.click();
            WebElement  errorMessage = driver.findElement(By.id("resultDiv"));
            errorMessage.isDisplayed();
            /**Test Case #2**/
            /**Open Website**/
            driver.get("https://qainterview.pythonanywhere.com/");
            /**Click on Privacy**/
            WebElement privacy = driver.findElement(By.linkText("Privacy"));
            privacy.click();
            /**Check that privacy page opens correctly**/
            String privacyActualUrl = driver.getCurrentUrl();
            String privacyexpectedUrl = "https://qainterview.pythonanywhere.com/privacy";
            Assert.assertEquals(privacyActualUrl,privacyexpectedUrl);
        }finally {
            driver.quit();

        }
    }
}
