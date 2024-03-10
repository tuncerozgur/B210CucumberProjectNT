package techproed.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import techproed.pages.BlueRentalPage;
import techproed.utilities.ConfigReader;
import techproed.utilities.Driver;
import techproed.utilities.ExcelReader;
import techproed.utilities.ReusableMethods;

public class BlueRentalStepDefinition {
    BlueRentalPage blueRentalPage = new BlueRentalPage();

    @Given("kullanici blueRentalCar sayfasina gider")
    public void kullaniciBlueRentalCarSayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("blueRentalUrl"));

    }


    @When("login butonuna tiklar")
    public void loginButonunaTiklar() {
        blueRentalPage.loginButton.click();

    }

    @And("email ve password bilgileri ile login olur")
    public void emailVePasswordBilgileriIleLoginOlur() {
        blueRentalPage.email.sendKeys(ConfigReader.getProperty("blueRentalEmail"));
        blueRentalPage.password.sendKeys(ConfigReader.getProperty("blueRentalPassword"));


    }


    @And("kullanici {string} ve {string} bilgilerini girer")
    public void kullaniciVeBilgileriniGirer(String email, String password) {
        blueRentalPage.email.sendKeys(email);
        blueRentalPage.password.sendKeys(password, Keys.ENTER);
    }

    @Then("login oldugunu dogrular")
    public void loginOldugunuDogrular() {
        Assert.assertNotEquals("Login",blueRentalPage.loginVerify.getText());
    }

    @And("exceldeki {string} sayfasindaki kullanici bilgileri ile login olur")
    public void exceldekiSayfasindakiKullaniciBilgileriIleLoginOlur(String sayfaIsmi) {
        String dosyaYolu="C:\\Users\\tunce\\IdeaProjects\\B210CucumberProjectNT\\src\\test\\resources\\adminTestData.xlsx";
        ExcelReader excelReader = new ExcelReader(dosyaYolu,sayfaIsmi);


        for (int i = 1; i <= excelReader.rowCount(); i++) {
            String email=excelReader.getCellData(0,0);
            String password=excelReader.getCellData(0,1);

            blueRentalPage.email.sendKeys(email);
            blueRentalPage.password.sendKeys(password,Keys.ENTER);

            ReusableMethods.bekle(3);
            Driver.getDriver().navigate().back();

            ReusableMethods.bekle(1);

        }
    }
}
