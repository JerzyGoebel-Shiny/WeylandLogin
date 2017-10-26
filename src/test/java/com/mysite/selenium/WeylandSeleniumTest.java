package com.mysite.selenium;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WeylandSeleniumTest {
    @Test
    public void TestWeylandLogin(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://jerzygoebel.com/weyland");
        WebElement userBox = driver.findElement(By.cssSelector(WeylandSelenium.CSS_BOX_USERNAME));
        WebElement passBox = driver.findElement(By.cssSelector(WeylandSelenium.CSS_BOX_PASSWORD));
        WebElement cnctBtn = driver.findElement(By.cssSelector(WeylandSelenium.CSS_BTN_CONNECT));

        userBox.sendKeys("jerzygoe_test");
        passBox.sendKeys("TestPass123");
        cnctBtn.click();

        WebElement loginMessage = driver.findElement(By.id(WeylandSelenium.ID_MSG_CONNECT));

        Assert.assertEquals(WeylandSelenium.STR_LGN_SUCCESS, loginMessage.getText());

        driver.quit();

    }

}
