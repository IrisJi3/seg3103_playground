package selenium;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

class ExampleSeleniumTest {

  static Process server;
  private WebDriver driver;

  @BeforeAll
  public static void setUpBeforeClass() throws Exception {
    ProcessBuilder pb = new ProcessBuilder("java", "-jar", "bookstore5.jar");
    server = pb.start();
  }

  @BeforeEach
  void setUp() {
    // Pick your browser
    // driver = new FirefoxDriver();
    // driver = new SafariDriver();
    WebDriverManager.chromedriver().setup();
    driver = new ChromeDriver();

    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://localhost:8080/");
    // wait to make sure Selenium is done loading the page
    WebDriverWait wait = new WebDriverWait(driver, 60);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("title")));
  }

  @AfterEach
  public void tearDown() {
    driver.close();
  }

  @AfterAll
  public static void tearDownAfterClass() throws Exception {
    server.destroy();
  }

  @Test
  void test1() {
    WebElement element = driver.findElement(By.id("title"));
    String expected = "YAMAZONE BookStore";
    String actual = element.getText();
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    WebElement welcome = driver.findElement(By.cssSelector("p"));
    String expected = "Welcome";
    String actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
    WebElement langSelector = driver.findElement(By.id("locales"));
    langSelector.click();
    WebElement frSelector = driver.findElement(By.cssSelector("option:nth-child(3)"));
    frSelector.click();
    welcome = driver.findElement(By.cssSelector("p"));
    expected = "Bienvenu";
    actual = welcome.getText();
    assertEquals(expected, getWords(actual)[0]);
  }

  @Test
  public void test3() {
    driver.get("http://localhost:8080/admin");

    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("admin");

    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("password");

    WebElement signIn = driver.findElement(By.id("loginBtn"));
    signIn.click();

    String actualUrl="http://localhost:8080/admin";
    String expectedUrl= driver.getCurrentUrl();
    assertEquals(expectedUrl, actualUrl);

  }


  private String[] getWords(String s) {
    return s.split("\\s+");
  }




  @Test
  public void testC1P(){//login
    driver.get("http://localhost:8080/admin");
    
    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("admin");
    
    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("password");
    
    WebElement loginButton = driver.findElement(By.id("loginBtn"));
    loginButton.click();
    
    String expected1 = "http://localhost:8080/admin";
    String current1 = driver.getCurrentUrl();
    assertEquals(expected1, current1);
  }

  @Test
  public void testC1N(){
    driver.get("http://localhost:8080/admin");
    
    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("wrong");
    
    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("info");
    
    WebElement loginButton = driver.findElement(By.id("loginBtn"));
    loginButton.click();
    
    String expected1 = "http://localhost:8080/login?error";
    String current1 = driver.getCurrentUrl();
    assertEquals(expected1, current1);
  }

	@Test
	public void testC2P(){
		Login();

		WebElement signoutBt = (WebElement) driver.findElement(By.xpath("//*[@value='Sign out']"));

		signoutBt.click();
    
    String expected3 = "http://localhost:8080/login?error";
    String current3 = driver.getCurrentUrl();
    assertEquals(expected3, current3);
	}
	@Test
	public void testC3P(){//Add book
    driver.get("http://localhost:8080/admin");
    
    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("admin");
    
    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("password");
    
    WebElement loginButton = driver.findElement(By.id("loginBtn"));
    loginButton.click();
    
    WebElement addBookCategory = driver.findElement(By.id("addBook-category"));
    addBookCategory.sendKeys("Book1");
    WebElement addBookId = driver.findElement(By.id("addBook-id"));
    addBookId.sendKeys("001");
    WebElement addBookTitle = driver.findElement(By.id("addBook-title"));
    addBookTitle.sendKeys("title");
    WebElement cost = driver.findElement(By.id("cost"));
    cost.sendKeys("32.00");
    WebElement addBookButton = driver.findElement(By.name("addBook"));
    addBookButton.click();
    String expected2 = "http://localhost:8080/admin";
    String current2 = driver.getCurrentUrl();
    assertEquals(expected2, current2);
	}

	@Test
	public void testC3N(){
    driver.get("http://localhost:8080/admin");
    
    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("admin");
    
    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("password");
    
    WebElement loginButton = driver.findElement(By.id("loginBtn"));
    loginButton.click();
    
    WebElement addBookCategory = driver.findElement(By.id("addBook-category"));
    addBookCategory.sendKeys("");
    WebElement addBookId = driver.findElement(By.id("addBook-id"));
    addBookId.sendKeys("");
    WebElement addBookTitle = driver.findElement(By.id("addBook-title"));
    addBookTitle.sendKeys("");
    WebElement cost = driver.findElement(By.id("cost"));
    cost.sendKeys("");
    WebElement addBookButton = driver.findElement(By.name("addBook"));
    addBookButton.click();
    String expected2 = "http://localhost:8080/admin";
    String current2 = driver.getCurrentUrl();
    assertEquals(expected2, current2);
  }

	@Test
	public void testC4P(){//search bt category
    driver.get("http://localhost:8080");
    
    WebElement catalogue = driver.findElement(By.id("search"));
    catalogue.sendKeys("Book1");
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    
    searchButton.click();
    
    String expected1 = "http://localhost:8080/catalog";
    String current1 = driver.getCurrentUrl();
    assertEquals(expected1, current1);
	}
    
  @Test
	public void testC42P(){
    driver.get("http://localhost:8080");
    WebElement catalogue = driver.findElement(By.id("search"));
    catalogue.sendKeys("");
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();
    String expected1 = "Book1";
    WebElement currentcat = driver.findElement(By.id("authors-001"));
    String current1 = currentcat.getText();
    assertEquals(expected1, current1);
  }

  @Test
	public void testC4N(){
    driver.get("http://localhost:8080");
    WebElement catalogue = driver.findElement(By.id("search"));
    catalogue.sendKeys("Comedy");
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();
    String expected1 = "http://localhost:8080/catalog";
    String current1 = driver.getCurrentUrl();
    assertEquals(expected1, current1);
  }
    
  @Test
	public void testC5P(){//remove book
    driver.get("http://localhost:8080/admin");
    
    WebElement username = driver.findElement(By.id("loginId"));
    username.sendKeys("admin");
    
    WebElement password = driver.findElement(By.id("loginPasswd"));
    password.sendKeys("password");
    
    WebElement loginButton = driver.findElement(By.id("loginBtn"));
    loginButton.click();
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();
    WebElement deleteButton = driver.findElement(By.id("del-hall002"));
    deleteButton.click();
    
    String expected1 = "http://localhost:8080/admin/catalog";
    String current1 = driver.getCurrentUrl();
    assertEquals(expected1, current1);
  }
    
  @Test
	public void testC6P(){//order book
    driver.get("http://localhost:8080");
    
    WebElement catalogue = driver.findElement(By.id("search"));
    catalogue.sendKeys("book1");
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();
    WebElement cartButton = driver.findElement(By.id("cartLink")); 
    cartButton.click(); 
    String expected1 = "http://localhost:8080/orderPage";
    String current1 = driver.getCurrentUrl();
    assertEquals(expected1, current1);
  }
    
   @Test
	 public void testC62P(){
    driver.get("http://localhost:8080");
     
    WebElement catalogue = driver.findElement(By.id("search"));
    catalogue.sendKeys("Book1");
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();
    WebElement cartButton = driver.findElement(By.id("cartLink")); 
    cartButton.click(); 
    WebElement inc = driver.findElement(By.id("001"));
    inc.sendKeys("2");
    WebElement update = driver.findElement(By.name("updateOrder")); 
    update.click();
    String expected1 = "64.00";
    WebElement currentcost = driver.findElement(By.id("ta001"));
    String current1 = currentcost.getText();
    assertEquals(expected1, current1);
   }
		
  @Test
	public void testC10P(){
		    driver.get("http://localhost:8080");
    WebElement catalogue = driver.findElement(By.id("search"));
    catalogue.sendKeys("Book1");
    WebElement searchButton = driver.findElement(By.id("searchBtn"));
    searchButton.click();
    WebElement orderButton = driver.findElement(By.id("order-001")); 
    orderButton.click(); //next we go to the cart
    WebElement cartButton = driver.findElement(By.id("cartLink")); 
    cartButton.click(); 
    WebElement checkout = driver.findElement(By.name("checkout")); 
    checkout.click();
    String expected1 = "32.00";
    WebElement currentcost = driver.findElement(By.id("order_taxes"));
    String current1 = currentcost.getText();
    assertEquals(expected1, current1);
    }
  @Test
	public void testC102P(){
    driver.get("http://localhost:8080");
    
    Select lang = new Select(driver.findElement(By.id("locales")));
    lang.selectByVisibleText("French");
    String expected1 = "Book1";
    WebElement titleInFrench = driver.findElement(By.id("title"));
    String current1 = titleInFrench.getText();
    assertEquals(expected1, current1); 
  }

    
	public void Login(){
		driver.get("http://localhost:8080/admin");
    
		if (driver.getCurrentUrl().equals("http://localhost:8080/login")){
			WebElement username = driver.findElement(By.id("loginId"));
			username.sendKeys("admin");

			WebElement pwd = driver.findElement(By.id("loginPasswd"));
			pwd.sendKeys("password");

			WebElement loginBt = driver.findElement(By.id("loginBtn"));
			loginBt.click();
		}
		else
		{
			System.out.println("Logged in");
		}
	}

}