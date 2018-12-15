package login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Login {
	
	WebDriver driver;
	
	@Given("^Jose acessa o TestLink$")
	public void Jose_acessa_o_TestLink() {
		System.setProperty("webdriver.chrome.driver", "C:\\Iterasys\\FTS112\\Bibliotecas\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://humberto-iterasys.jelasticlw.com.br/testlink/");
		System.out.println("Abre o TestLink");
	}
		
	@And("^preenche o usuario e senha corretos$")
	public void preenche_o_usuario_e_senha_corretos() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.id("login")).sendKeys("correia");
		driver.findElement(By.name("tl_password")).sendKeys("iterasys");
		driver.findElement(By.name("login_submit")).click();;
	}
		
	@Then("^visualiza a home interna$")
	public void visualiza_a_home_interna() throws InterruptedException {
		Thread.sleep(2000);
		driver.switchTo().frame("titlebar");
		String usuarioPerfilAtual = driver.findElement(By.cssSelector("span.bold")).getText();
		assertEquals("correia [admin]", usuarioPerfilAtual);
		driver.quit();
	}
	
}
