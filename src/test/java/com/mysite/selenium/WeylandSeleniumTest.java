package com.mysite.selenium;


import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WeylandSeleniumTest {
    @Test
    public void TestWeylandLogin(){
        WebDriver driver = new FirefoxDriver();
        driver.get("http://jerzygoebel.com/weyland");

        driver.findElement(By.cssSelector("input[name=\"user\"]")).sendKeys("jerzygoe_test");
        driver.findElement(By.cssSelector("input[name=\"pass\"]")).sendKeys("TestPass123");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();

        Assert.assertEquals("Login Successful.", driver.findElement(By.id("login_message")).getText());

        driver.quit();

    }

}
