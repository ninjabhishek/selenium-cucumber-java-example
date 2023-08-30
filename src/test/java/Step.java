import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Step {

    private final WebDriver driver = new ChromeDriver();

    @Given("User navigates to Gmail page")
    public void login() {
        driver.get("https://www.gmail.com");
        driver.close();
    }
}
