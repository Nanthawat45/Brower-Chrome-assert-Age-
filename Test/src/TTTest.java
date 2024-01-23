import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


class TTTest {

	@Test
	void test() throws InterruptedException {
		WebDriver driver = null;
        System.setProperty("webdriver.chrome.driver", "D:\\webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.coding-midcareer.com/");
        WebElement btn = driver.findElement(By.className("theme-btn"));
        btn.click();
        Select drp = new Select(driver.findElement(By.name("pre_name_th")));
        drp.selectByIndex(1);
        WebElement name = driver.findElement(By.name("name_th"));
        name.sendKeys("นันทวัมน์");
        WebElement surname = driver.findElement(By.name("lastname_th"));
        surname.sendKeys("ภูแสงสั่น");
        
    
        
        
        WebElement Name_EN = driver.findElement(By.name("name_en"));
        Name_EN.sendKeys("Nanthawat");
        WebElement Surname_EN = driver.findElement(By.name("lastname_en"));
        Surname_EN.sendKeys("Phoosaengsan");
        WebElement id = driver.findElement(By.name("id_card"));
        id.sendKeys("173920004824");
        WebElement birthday = driver.findElement(By.name("birthday"));
        birthday.sendKeys("20/11/2545");
        WebElement phone = driver.findElement(By.name("phone"));
        phone.sendKeys("0926142712");
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("Nanthawt.ohm45@gmail.com");
        
        String result = driver.findElement(By.id("age")).getAttribute("value");
        System.out.print(result);
        
        Thread.sleep(5000);
        driver.close();
	}

}
