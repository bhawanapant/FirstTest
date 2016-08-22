import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public static final String CHROME_WEB_DRIVER_KEY = "webdriver.chrome.driver";
    public static final String CHROME_WEB_DRIVER_EXE_PATH = "D:\\Software\\chromedriver\\chromedriver.exe";
    public static final String BASE_URL = "https://google.co.uk";

    public static void main(String[] args) {
        // comment added
        System.setProperty(CHROME_WEB_DRIVER_KEY, CHROME_WEB_DRIVER_EXE_PATH);
        WebDriver driver = new ChromeDriver();
        String expectedTitle = "Google";
        String actualTitle;

        driver.get(BASE_URL);
        actualTitle = driver.getTitle();


        if (actualTitle.contentEquals(expectedTitle))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        driver.close();
    }
}
