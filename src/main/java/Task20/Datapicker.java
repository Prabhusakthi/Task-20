package Task20;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import java.util.concurrent.TimeUnit;

	public class Datapicker {

	    public static void main(String[] args) {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaleeswari\\eclipse-workspace\\Task20\\src\\main\\java\\Task20\\chromedriver.exe");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to the URL
	            driver.get("https://jqueryui.com/datepicker");
	            Thread.sleep(2000);

	            // Switch to the iframe containing the datepicker
	            WebElement iframe = driver.findElement(By.className("demo-frame"));
	            driver.switchTo().frame(iframe);
	            Thread.sleep(2000);

	            // Open the datepicker by clicking the input field
	            WebElement dateInput = driver.findElement(By.id("datepicker"));
	            dateInput.click();
	            

	            // Click on the next month button
	            WebElement nextMonthButton = driver.findElement(By.xpath("//a[@title='Next']"));
	            nextMonthButton.click();

	            // Select the date "22" from the datepicker
	            WebElement dateToSelect = driver.findElement(By.xpath("//a[text()='22']"));
	            dateToSelect.click();

	            // Print the selected date in the console
	            String selectedDate = dateInput.getAttribute("value");
	            System.out.println("Selected Date: " + selectedDate);

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser window and quit the WebDriver instance
	            driver.quit();
	        }
	    }
	}



