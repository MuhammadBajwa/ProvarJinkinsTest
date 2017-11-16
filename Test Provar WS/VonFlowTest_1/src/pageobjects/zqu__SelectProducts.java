package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@SalesforcePage( title="Zqu__ Select Products"                                
               , summary=""
               , page="SelectProducts"
               , namespacePrefix="zqu"
               , object="zqu__Quote__c"
               , connection="Badger_17_Vocalocity_SysAdmin"
     )             
public class zqu__SelectProducts {
	
	@TextType()
	@FindBy(xpath = "//div[contains(@class, \"z-ui-button-bar\")]/div[1]/span/table")
	public WebElement Quick_Add_Service_Flow;
	@LinkType()
	@FindBy(xpath = "//div[1]/span/div/div/div[1]//a")
	public WebElement extensions;
	@ChoiceListType(values = { @ChoiceListValue(value = "Unlimited"), @ChoiceListValue(value = "Metered"),
			@ChoiceListValue(value = "High Use"), @ChoiceListValue(value = "Virtual") })
	@FindByLabel(label = "Extension Type:")
	public WebElement extensionType;
	
	@FindBy(xpath= "//*[@id='table-for-Extensions']//tbody")
	@PageTable(firstRowContainsHeaders = false, row = extentions.class)
	public List<extentions> extentions;
	public static class extentions {
		@BooleanType
		@FindBy(xpath = "tr[1]/td[1]/input")
		public WebElement checbox;

	}
	
	@FindBy(xpath= "//*[@id='table-for-Phones']//tbody")
	@PageTable(firstRowContainsHeaders = false, row = phones.class)
	public List<phones> phones;
	public static class phones {
		@BooleanType
		@FindBy(xpath = "tr[1]/td[1]/input")
		public WebElement checbox;

	}
	@FindBy(xpath= "//*[@id='table-for-Numbers_wrapper']//tbody")
	@PageTable(firstRowContainsHeaders = false, row = Numbers.class)
	public List<Numbers> Numbers;
	public static class Numbers {
		@BooleanType
		@FindBy(xpath = "tr[1]/td[1]/input")
		public WebElement checbox;

	}
	
	@ButtonType()
	@FindByLabel(label = "Add and Next")
	public WebElement addAndNext;
	@ButtonType()
	@FindByLabel(label = "Done")
	public WebElement done;
	@ButtonType()
	@FindByLabel(label = "Next")
	public WebElement next;
		@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement Submit;
		
}
