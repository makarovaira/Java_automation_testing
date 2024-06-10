package org.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;

public class NoteHelper extends HelperBase{
    public NoteHelper(ApplicationManager manager) {
        super(manager);
    }

    JavascriptExecutor js;
    public void createNote() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1552, 928));
        Thread.sleep(20000);
        driver.findElement(By.cssSelector(".iplus")).click();
        Thread.sleep(20000);
        driver.findElement(By.cssSelector(".row:nth-child(3) > .color-white-strict")).click();
    }

    public void deleteNoteTest() throws InterruptedException {
        driver.manage().window().setSize(new Dimension(1552, 928));
        Thread.sleep(20000);
        //driver.findElement(By.cssSelector(".lyteMenuSelection .text-danger")).click();
        driver.findElement(By.cssSelector("#nb_x8h2x44ae088bad29484382391c836bef9284 > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)")).click();
        //driver.findElement(By.cssSelector(".lyteMenuSelection > lyte-menu-label")).ActionChains;
        Thread.sleep(20000);
        //driver.findElement(By.cssSelector(".lyteFailure > lyte-yield")).click();
        WebElement element = driver.findElement(By.id("title-editor"));
        js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'lalala'}", element);
    }
//    public void GroupData(String name) {
//        this.name = name;
//    }
}
