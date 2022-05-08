package pageObjects;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CouponsPage extends PageBase {
    public CouponsPage(AppiumDriver<AndroidElement> driver) {
        super((AndroidDriver<AndroidElement>) driver);
    }

    @AndroidFindBy(id = "com.adobe.cq.mobile.payback:id/actionEvent")
    public AndroidElement couponsHelpDialogSkipButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='COUPONS']")
    public AndroidElement couponsPageTitle;

    @AndroidFindBy(id = "com.adobe.cq.mobile.payback:id/errorTitle")
    public AndroidElement noCoupounsToActivateNote;
}
