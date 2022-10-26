package teste.senai;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGameMania {

	private WebDriver driver;
	
	//inicio
	@Before
	public void ConfugurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\ChromeDriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	//Teste
	@Test
	public void TesteNavegabilidade() {
		
	try {
	driver.get("http://localhost:4200/");
	Thread.sleep(3000);
	driver.findElement(By.id("logar")).click();
	Thread.sleep(3000);
	driver.findElement(By.id("usuario")).sendKeys("adriano@email.com");
	Thread.sleep(3000);
	driver.findElement(By.id("password")).sendKeys("senhadoadriano");
	Thread.sleep(3000);
	driver.findElement(By.id("log")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);

	} catch (InterruptedException e){
			e.printStackTrace();
	}
    }
	
	//Finalização
	@After
	
	public void Fim() {
		driver.quit();
	}
}
