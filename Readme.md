Steps for execution of Fitbit appium application:
1. Load Android studio then launch an emulator (with API 27 and play store alread installed)
2. Open Command prompt and execute appium command (appium exe must be in the path to execute directly)
3. Open Eclipse navigate to project 
To run the Regression Test 
4. Open RunCukeTest class 
then for each feature to be run add different <feature name> .feature
features = {"src/test/java/features/IonicDevicePage.feature"},


5. Right click RunCukeTest class> runas junit

Second way: using MVN Test
1. open eclipse next Open RunCukeTest class 
then for each feature to be run add different <feature name> .feature
features = {"src/test/java/features/IonicDevicePage.feature"},

2. select project name then right click select runas Maven Test