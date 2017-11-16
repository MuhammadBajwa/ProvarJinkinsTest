package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Zqu__ Create Quote"                                
               , summary=""
               , page="CreateQuote"
               , namespacePrefix="zqu"
               , object="zqu__Quote__c"
               , connection="Badger_17_Vocalocity_SysAdmin"
     )             
public class zqu__CreateQuote {

	@TextType()
	@FindByLabel(label = "Email Address")
	public WebElement emailAddress;
	@TextType()
	@FindByLabel(label = "Email Address")
	public WebElement emailAddress1;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
	@TextType()
	@FindByLabel(label = "Days Until Activation")
	public WebElement Days_Until_Activation;
	
}
