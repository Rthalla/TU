package com.cucumberrunner;

import org.openqa.selenium.WebDriver;

import com.pages.BasketPage;
import com.pages.BillingPage;
import com.pages.CategoryPage;
import com.pages.DeliveryPage;
import com.pages.Homepage;
import com.pages.LoginRegisterPage;
import com.pages.PaymentPage;
import com.pages.ProductDetailsPage;
import com.pages.ProductListingsPage;
import com.pages.SearchResultsPage;
import com.pages.StoreResultsPage;
import com.pages.StoreSearchPage;
import com.pages.orderConfirmationPage;

public class AbstractMain {
	
	public static WebDriver driver;
	public static BasketPage bp=new BasketPage();
	public static BillingPage billpage=new BillingPage();
	public static CategoryPage cp=new CategoryPage();
	public static DeliveryPage dp=new DeliveryPage();
	public static Homepage hp=new Homepage();
	public static LoginRegisterPage loginregister=new LoginRegisterPage();
	public static orderConfirmationPage orderpage=new orderConfirmationPage();
	public static PaymentPage pp =new PaymentPage();
	public static ProductDetailsPage productapage=new ProductDetailsPage();
	public static ProductListingsPage productlistingspage=new ProductListingsPage();
	public static SearchResultsPage searchresultspage=new SearchResultsPage();
	public static StoreResultsPage storeresultspage=new StoreResultsPage();
	public static StoreSearchPage storesearchpage=new StoreSearchPage();
	

}
