package kundansuryansh;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class Introduction {


    public static void main(String[] args) {


        // by default from selenium 4.6.1 chrome driver path is handled. it will installed internally by looking to chrome version.
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.close();



    }


}