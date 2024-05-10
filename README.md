# Ryde Mobile Automation Code README

## Overview
This repository contains the mobile automation code for testing the login functionality of the user registration process on the Ryde Rider mobile app. The tests are implemented using Selenium and Appium with an Android virtual device.

## Setup
To run the tests, you need to set up the following:

1. **Android Studio:**
   - Install Android Studio.
   - Create a virtual device (Google Pixel with Android 9.0) using the AVD Manager.

2. **Appium Server:**
   - Install Appium server.
   - Start the Appium server.
 
3. **Ensure Application APK File:**

   Ensure that the application APK file is available and accessible to the test script.

4. **Download and Install Eclipse:**

   Download and install Eclipse IDE

5. **Clone or Download the Project from Git:**

Clone the project repository from Git or download the code as a zip file and extract it to your local system.

## Test Scenario
The test scenario implemented in this code covers the following steps:

1. **Install and Launch Application:**
   - The test script installs the application on the virtual device and launches it.

2. **Login using Mobile Number:**
   -  The automation code will interact with the login screen of the application to select the "Login using Mobile Number" option.
  

3. **Enter Mobile Number & OTP:**
   - The mobile number is pre-set in the code and will be automatically entered into the mobile number field of the application on the virtual device.
   - After the mobile number is entered, the code will programmatically click the OTP button.
   - The automation code will capture the OTP from the Eclipse console and enter it into the OTP field section of the application to complete the verification process.

## Running Tests
To run the tests, follow these steps:

1. **Start Appium Server:**
   - Start the Appium server.

2. **Create a Virtual Device in Android Studio:**
   - Open Android Studio.
   - Go to "Tools" > "Device Manager".
   - Select "Virtual" option and click on "Create Device".
   - Select "Pixel" from the list of available devices and click "Next".
   - Choose a system image with Android 9.0 (Pie) and download it if necessary.
   - Follow the prompts to set up the virtual device and click "Finish".

3. **Import the Project into Eclipse:**
   - Open Eclipse IDE and import the project you downloaded:
     - Go to "File" > "Import".
     - Choose "Existing Projects into Workspace" under the "General" category.
     - Click "Next" and then "Browse" to locate the root directory of the project.
     - Select the project folder and click "Finish" to import it into Eclipse.
   

4. **Run the Tests:**
   - In Eclipse, navigate to the test file (`LoginTest.java`).
   - Right-click on the file and select "Run As" > "Java Application".
   - This will execute the tests, and you should see the test results in the console.


## Notes
- Make sure the virtual device is running and visible to the Appium server.
- Ensure that the application APK file is available and accessible to the test script.
