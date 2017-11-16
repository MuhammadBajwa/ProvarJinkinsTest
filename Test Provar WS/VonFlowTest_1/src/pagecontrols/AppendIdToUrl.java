package pagecontrols;

import java.util.logging.Logger;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

import com.provar.core.testapi.annotations.*;

@PageControl( title="Append Id To Url"                                
     , summary=""
     , remarks=""
     )             
public class AppendIdToUrl {

	private WebDriver driver;
	private WebElement element;
	
	@TestLogger
	private Logger logger;
	
	public AppendIdToUrl(WebDriver driver, WebElement element) {
		this.driver = driver;
		this.element = element;
	}
	
	@PageOperation
	public String addId(String id) {
	    String host  = driver.getCurrentUrl();
	    host = host + "/?ref=" + id;
		return host;
	}
}
