package Task20;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class GuviAutomation {

	    public static void main(String[] args) {
	        // Set the path for the ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kaleeswari\\eclipse-workspace\\Task20\\src\\main\\java\\Task20\\chromedriver.exe");

	        // Initialize the ChromeDriver
	        WebDriver driver = new ChromeDriver();

	        try {
	            // Maximize the browser window
	            driver.manage().window().maximize();

	            // Navigate to the GUVI website
	            driver.get("https://www.guvi.in/");

	            // Wait for the page to load
	            Thread.sleep(100000000);

	            // Locate the Signup button and click it
	            WebElement signupButton = driver.findElement(By.xpath("//a[text()='Sign Up']"));
	            signupButton.click();

	            // Wait for the Signup page to load
	            Thread.sleep(3000);

	            // Fill the Signup form details
	            WebElement nameField = driver.findElement(By.name("name"));
	            WebElement emailField = driver.findElement(By.name("email"));
	            WebElement passwordField = driver.findElement(By.name("password"));
	            WebElement confirmPasswordField = driver.findElement(By.name("confirm_password"));

	            nameField.sendKeys("John Doe");
	            emailField.sendKeys("johndoe@example.com");
	            passwordField.sendKeys("SecurePassword123");
	            confirmPasswordField.sendKeys("SecurePassword123");

	            // Submit the Signup form
	            WebElement submitSignupButton = driver.findElement(By.xpath("//button[text()='Sign Up']"));
	            submitSignupButton.click();

	            // Wait for the page to load successfully
	            Thread.sleep(5000);

	            // Verify the successful load of the page (this can vary; here we check the presence of the login button)
	            WebElement loginButton = driver.findElement(By.xpath("//a[text()='Login']"));
	            if (loginButton.isDisplayed()) {
	                System.out.println("Signup successful, proceeding to login.");
	            } else {
	                System.out.println("Signup failed, check the details.");
	                return;
	            }

	            // Click the Login button
	            loginButton.click();

	            // Wait for the Login page to load
	            Thread.sleep(3000);

	            // Fill the Login form details
	            WebElement loginEmailField = driver.findElement(By.name("email"));
	            WebElement loginPasswordField = driver.findElement(By.name("password"));

	            loginEmailField.sendKeys("johndoe@example.com");
	            loginPasswordField.sendKeys("SecurePassword123");

	            // Submit the Login form
	            WebElement submitLoginButton = driver.findElement(By.xpath("//button[text()='Login']"));
	            submitLoginButton.click();

	            // Wait for the page to load successfully
	            Thread.sleep(5000);

	            // Verify the successful load of the page after login (e.g., by checking for the presence of a logout button or user's name)
	            WebElement profileElement = driver.findElement(By.xpath("//span[text()='John Doe']"));
	            if (profileElement.isDisplayed()) {
	                System.out.println("Login successful.");
	            } else {
	                System.out.println("Login failed, check the details.");
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            // Close the browser window and quit the WebDriver instance
	            driver.quit();
	        }
	    }
	}



