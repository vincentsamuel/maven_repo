package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirstTest {
	public WebDriver d;
@Test
public void test(){
	d=new FirefoxDriver();
	d.manage().window().maximize();
	d.get("http://newtours.demoaut.com");
	d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	d.findElement(By.name("userName")).sendKeys("Admin");
	d.findElement(By.name("password")).sendKeys("mercury");
	d.findElement(By.name("login")).click();
	d.close();
}
}
