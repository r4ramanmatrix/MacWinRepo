package com.qa.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;
import com.qa.utils.InterfaceImplementation;

public class BooksPage extends TestBase {

	WebDriver driver;

	InterfaceImplementation interfaceMethods = null;

	@FindBy(xpath = "//*[@class='product-grid']//div[@class='details']//a")
	private List<WebElement> booksdetails;

	@FindBy(xpath = "//*[@class='product-grid']//div[@class='details']//div[@class='prices']/span[2]")
	private List<WebElement> booksPrices;

	@FindBy(id = "products-orderby")
	private WebElement sortByDropDown;

	public BooksPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		interfaceMethods = new InterfaceImplementation();
	}

	public String pageTitleVerification() {
		return driver.getTitle();
	}

	public void getCountAndNameOfBooks() {
		int countOfBooks = booksdetails.size();

		System.out.println("Number of Books available on page :: " + countOfBooks);
		System.out.println("Name of Books available on page :: ");
		for (int i = 0; i < booksdetails.size(); i++) {
			System.out.println(booksdetails.get(i).getText());
		}
	}
}
