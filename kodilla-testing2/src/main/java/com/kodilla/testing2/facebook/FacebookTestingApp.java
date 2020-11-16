package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {
    public static final String LOGIN_FORM = "u_0_2";
    public static final String REGISTRATION_BUTTON = "u_0_2";
    public static final String ACCEPT_BUTTON = "u_0_h";

    public static final String XPATH_DAY = "//select[contains(@name, \"birthday_day\")]";
    public static final String XPATH_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_YEAR = "//div[contains(@class, \"_5k_5\")]/span/span/select[3]";

    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get(" https://www.facebook.com/");

        WebElement acceptField = driver.findElement(By.id(ACCEPT_BUTTON));
        acceptField.click();

        while (!driver.findElement(By.id(LOGIN_FORM)).isDisplayed()) ;

        WebElement newRegistrationField = driver.findElement(By.id(REGISTRATION_BUTTON));
        newRegistrationField.click();

        while (!driver.findElement(By.xpath(XPATH_DAY)).isDisplayed()) ;

        WebElement selectDay = driver.findElement(By.xpath(XPATH_DAY));
        Select selectBoardDay = new Select(selectDay);
        selectBoardDay.selectByVisibleText("6");

        while (!driver.findElement(By.xpath(XPATH_MONTH)).isDisplayed()) ;

        WebElement selectMonth= driver.findElement(By.xpath(XPATH_MONTH));
        Select selectBoardMonth  = new Select(selectMonth);
        selectBoardMonth.selectByIndex(5);

        while (!driver.findElement(By.xpath(XPATH_YEAR)).isDisplayed()) ;

        WebElement selectYear= driver.findElement(By.xpath(XPATH_YEAR));
        Select selectBoardYear  = new Select(selectYear);
        selectBoardYear.selectByValue("2002");
    }

}
