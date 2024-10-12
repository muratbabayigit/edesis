package tests;

import org.testng.annotations.Test;
import pages.askPage;
import utilities.ConfigReader;
import utilities.Driver;

public class edesisSinavEkrani {

    @Test
    public void sinavEkrani() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("ask"));
        askPage ask=new askPage();

        Thread.sleep(7000);
        ask.user.sendKeys("mbveli");
        Thread.sleep(3000);
        ask.pass.sendKeys("123456");
        Thread.sleep(4000);
        ask.giris.click();
        Thread.sleep(5000);
        ask.sinavs.click();
        Thread.sleep(5000);



        Driver.quitDriver();

    }

}
