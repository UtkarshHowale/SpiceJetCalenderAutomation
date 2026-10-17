package com.spicejet;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpiceJetCalenderAutomation {

	void main() {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");
		WebDriver wd = new ChromeDriver(options);
		WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(30));
		wd.get("https://www.spicejet.com/");

		By fromCityTextBoxLocator = By.xpath("//div[text()=\"From\"]/following-sibling::div/input");
		WebElement fromCityTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(fromCityTextBoxLocator));
		fromCityTextBox.sendKeys("Mum");

		By toCityTextBoxLocator = By.xpath("//div[text()=\"To\"]/following-sibling::div/input");
		WebElement toCityTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(toCityTextBoxLocator));
		toCityTextBox.sendKeys("Pun");

		// =====================================================
		// CALENDAR HANDLING LOGIC STARTS HERE
		// =====================================================

		// Step 1: Locate the calendar container and wait until visible
		By calenderPickerLocator = By.xpath("//div[@data-testid=\"undefined-calendar-picker\"]");
		WebElement calenderPicker = wait.until(ExpectedConditions.visibilityOfElementLocated(calenderPickerLocator));

		// Step 2: Locate the SVG element used for calendar navigation
		// local-name() allows XPath to identify the SVG element
		By nextButtonLocator = By.xpath(".//*[local-name()='svg' and @data-testid=\"svg-img\"]");
		WebElement nextButton = calenderPicker.findElement(nextButtonLocator);
		nextButton.click();

		// Step 3: Calculate the target date dynamically using Java LocalDate
		// Here, the target date is two months from the current date
		LocalDate localDate = LocalDate.now();
		localDate = localDate.plusMonths(2);

		// Extract the month name in English
		String month = localDate.getMonth().getDisplayName(TextStyle.FULL, Locale.ENGLISH);

		// Extract the year and day from the calculated date
		int year = localDate.getYear();
		int date = localDate.getDayOfMonth();

		// Step 4: Build a dynamic XPath for the target month and year
		// Example: undefined-month-December-2026
		By calenderMonthLocator = By.xpath("//div[@data-testid=\"undefined-month-" + month + "-" + year + "\"]");

		// Step 5: Wait until the target month is visible in the calendar
		WebElement calenderMonth = wait.until(ExpectedConditions.visibilityOfElementLocated(calenderMonthLocator));

		// Step 6: Locate the target day inside the specific month container
		// This is a relative XPath because the search starts from calenderMonth
		By dateLocator = By.xpath(".//div[text()=" + date + "]");
		WebElement dateElement = calenderMonth.findElement(dateLocator);
		dateElement.click();

		// =====================================================
		// CALENDAR HANDLING LOGIC ENDS HERE
		// =====================================================
	}

}
