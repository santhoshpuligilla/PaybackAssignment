
**Payback Mobile QA Assignment**

**Summary**

•	This project has been implemented using Java, Appium and Cucumber

•	Page Object Model (POM) design pattern has been used to implement the project.

•	Cucumber html reporter is used to generage html Report.

**Scenario**

•	PaybackCoupons.feature: Logs in, and goes to Coupons section to activate available coupons.

**Recommended Configuration**

•	Windows 10

•	java 11.0.14 

•	adb Version 33.0.1-8253317 (for Android real device)

•	appium 1.22.2

•	node.js 16.14.2

•	npm 8.5.5

•	cucumber-jvm 7.3.3

**Instructions to execute**

1.	To install appium on your PC

      Ref: https://appium.io/docs/en/about-appium/getting-started/?lang=en#installing-appium
      
      o	npm install -g appium

2.	To install adb platform-tools in PC
    Ref: https://developer.android.com/studio/releases/platform-tools

3.	On a new terminal, clone the Automation project to your local machine
    o	git clone https://github.com/santhoshpuligilla/PaybackAssignment.git

4.	Navigate to the Project folder and install the dependencies
o	cd PaybackAssignment
o	mvn compile test
o	npm run tests
5.	On the command prompt, notice the tests executing 
7.	HTML report of the latest execution can be seen at {PROJECT_HOME}/test-output.html

**Note:** 

After installing Payback application from Playstore, there are NO coupons to activate. Seems there are no coupons available in Indian region from Payback application. So, I have completed my test case till we check this screen with error.

However, this case can be extended by finding element id for notactivated coupons and can be validated by finding them in Activated list.

