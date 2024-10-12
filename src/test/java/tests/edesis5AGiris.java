package tests;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.askPage;
import utilities.ConfigReader;
import utilities.Driver;

public class edesis5AGiris {
@Test
    public void test() throws InterruptedException {

    Driver.getDriver().get(ConfigReader.getProperty("ask"));
    askPage ask=new askPage();

    Thread.sleep(5500);
    ask.user.sendKeys("irem");
    ask.pass.sendKeys("123456"+ Keys.ENTER);
    Thread.sleep(2500);
    ask.userpic.click();
    Thread.sleep(2500);
    ask.logout.click();
    Thread.sleep(2500);

    for (int i = 1; i <=18 ; i++) {
        String no="0"+i;
        String number="v20250"+no;
        ask.user.sendKeys(number);
        ask.pass.sendKeys("123456"+ Keys.ENTER);
        Thread.sleep(2500);
        ask.userpic.click();
        Thread.sleep(2500);
        ask.logout.click();
        Thread.sleep(2500);
    }
   // ask.user.sendKeys("v2025001");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025002");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025003");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
   // ask.user.sendKeys("v2025004");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025005");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025006");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025007");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025008");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025010");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025011");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
   // ask.user.sendKeys("v2025012");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
//
   // ask.user.sendKeys("v2025013");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025014");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025015");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025016");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
   // ask.user.sendKeys("v2025017");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   // ask.user.sendKeys("v2025018");
   // ask.pass.sendKeys("123456"+ Keys.ENTER);
   // Thread.sleep(2500);
   // ask.userpic.click();
   // Thread.sleep(2500);
   // ask.logout.click();
   // Thread.sleep(2500);
//
   ask.user.sendKeys("yuce");
   ask.pass.sendKeys("123456"+ Keys.ENTER);
   Thread.sleep(2500);
   ask.userpic.click();
   Thread.sleep(2500);
   ask.logout.click();
   Thread.sleep(2500);

    Driver.quitDriver();
}
}
