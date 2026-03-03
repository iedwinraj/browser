package bowserLaunch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LaunchBrowserTest {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
    	
    	//WebDriver driver;
        // Set path to ChromeDriver
    	//WebDriverManager.edgedriver().setup();
        System.setProperty("webdriver.edge.driver", "C:\\Driver\\msedgedriver.exe");
    	
    	//System.setProperty("webdriver.edge.driver", "C:\\Program Files (x86)\\Microsoft\\Edge\\Application\\msedge.exe");
    	//driver = new EdgeDriver();
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void openWebsite() {
        // Open a website
        driver.get("https://www.google.com/");
        // You can add assertions here if needed
        String title = driver.getTitle();
        System.out.println("Page Title: " + title);
    }

    @AfterClass
    public void tearDown() {
        // Close browser
        if (driver != null) {
            driver.quit();
        }
    }
}