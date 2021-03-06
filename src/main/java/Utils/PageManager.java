package Utils;

import org.openqa.selenium.support.PageFactory;


public class PageManager extends Base {

    public static void initPageObjectElements() {
        cloudinaryLoginPage = PageFactory.initElements(driver, PageObjects.LoginPage.class);
        mainPage = PageFactory.initElements(driver, PageObjects.MainPage.class);
        menuBar = PageFactory.initElements(driver, PageObjects.MenuBar.class);
        mediaLibrary = PageFactory.initElements(driver, PageObjects.MediaLibrary.class);
        uploadMediaPopup = PageFactory.initElements(driver, PageObjects.UploadMediaPopup.class);
        assetWidget = PageFactory.initElements(driver, PageObjects.AssetWidget.class);
        mainPageMenuBarassetWidget = PageFactory.initElements(driver, PageObjects.MainPageMenuBar.class);
        manageAssetPage = PageFactory.initElements(driver, PageObjects.ManageAssetPage.class);
    }
}
