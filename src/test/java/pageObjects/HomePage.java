package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

import java.util.List;

public class HomePage extends PageBase {

    public HomePage(AppiumDriver<AndroidElement> driver) {
        super((AndroidDriver<AndroidElement>) driver);
    }

    @AndroidFindBy(id = "com.adobe.cq.mobile.payback:id/payback_logo")
    public AndroidElement homePageTitle;

    @AndroidFindBy(id= "com.adobe.cq.mobile.payback:id/profile_img")
    public AndroidElement myAccountButton;

    @AndroidFindBy(id = "com.adobe.cq.mobile.payback:id/signOutBtn")
    public AndroidElement signInButton;

    @AndroidFindBy(id = "com.adobe.cq.mobile.payback:id/menu_icon")
    public AndroidElement sideMenuButton;

    @AndroidFindBy(id = "com.adobe.cq.mobile.payback:id/menuListParent")
    public List<AndroidElement> menuListItems;



}
