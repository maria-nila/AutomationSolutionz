package TestCase;

import Configuration.DriverSetup;
import PageObject.InformationPageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class SaveText extends DriverSetup {
    public static String URL = "https://demo.zeuz.ai/web/level/one/actions/save_text";

    @Test
    public static void TestWebPage() throws InterruptedException{
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        Thread.sleep(2000);
        InformationPageObject informationPageObject = new InformationPageObject(driver);
        informationPageObject.hintButton.click();
        Thread.sleep(2000);
        String myOrderText = driver.findElement(By.xpath("//*[@id=\"randomText\"]")).getText();
        driver.findElement (By.xpath("//*[@id='enter_text']")).sendKeys(myOrderText );
        Thread.sleep(2000);




        informationPageObject.verifyButton.click();
        Thread.sleep(5000);

    }
}
