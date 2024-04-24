import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import java.time.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        RemoteWebDriver browser = new ChromeDriver();
        browser.get("https://ithillel.ua/");
        browser.manage().window().maximize();

        WebElement ProgrammingButton = browser.findElement(By.cssSelector("a.course-cat-bar[href*=\"programming\"]"));
        ProgrammingButton.click();

        WebElement FrontEndButton = browser.findElement(By.cssSelector("a.-offline[href*=\"front-end-basic\"]"));
        FrontEndButton.click();

        JavascriptExecutor JsExec = (JavascriptExecutor) browser;
        JsExec.executeScript("window.scrollBy(0, 1600)");
        browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));

        WebElement ShowAllButton = browser.findElement(By.cssSelector("*.coaches_show"));
        ShowAllButton.click();

        List<WebElement> coaches = browser.findElements(By.cssSelector("p.coach-card_name"));

        for (WebElement element : coaches) {
            System.out.println(element.getText());
        }
    }
}
