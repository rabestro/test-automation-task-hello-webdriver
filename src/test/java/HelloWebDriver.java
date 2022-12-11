import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWebDriver {
    public static void main(String[] args) throws InterruptedException {
        var driver = new ChromeDriver();
        driver.get("https://www.selenium.dev");
        Thread.sleep(2000);
        driver.quit();
    }
}
