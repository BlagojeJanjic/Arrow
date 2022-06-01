import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Arrow {
    public static void main(String[] args) {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();

            WebDriverWait driverWait = new WebDriverWait(driver, Duration.ofSeconds(10));

            driver.navigate().to("http://www.strela.co.rs/");

            WebElement prodavnicaButton = driver.findElement(By.xpath("//*[@id=\"ctl00_RadMenu1\"]/ul/li[2]/a/span"));
            prodavnicaButton.click();

            WebElement lukoviBows = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_GrupeRadTreeView\"]/ul/li[1]/div/span[3]"));
            lukoviBows.click();

            Thread.sleep(10000);

            WebElement samickSage = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_ListView1_ctrl35_Panel1\"]/figure/a/img"));
            samickSage.click();

            WebElement title = driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_ItemListView_ctrl0_ItemNazivLabel\"]"));

            String samickSagetitle = title.getText();

            System.out.println(samickSagetitle);

            if (samickSagetitle.contains("Samick")) {
                System.out.println("Sadrzi!");
            } else {
                System.out.println("Ne sadrzi!");
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

    }
}
