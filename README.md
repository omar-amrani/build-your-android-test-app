# Build your first Android test app
This repository aims to help you get started building your first Android app integrating Intercom Android SDK. You'll learn how to build a simple app that allows you to register/signout users as well as displaying/hiding the messenger.

## 1- Must know before writing your Android app

While building this app, the main files that you'll be interacting with are:

- **AndroidManifest.xml**: The manifest presents essential information about the application to the Android system, information the system must have before it can run any of the application's code (eg. App name, permissions ...). This file can be found under the manifests directory. More information about can be [here](https://stuff.mit.edu/afs/sipb/project/android/docs/guide/topics/manifest/manifest-intro.html)
- **MainActivity Class**: The main activity begins immediately after the user logs in. Once the main activity is running, it can launch other activities, which in turn can launch sub-activities. When the application exits, it does so by terminating the main activity. All other activities terminate in a cascade from within the main activity. in this tutorial, we will use this class to define all our functions.
- **activity_main.xml** & **content_main.xml**: These two files are used to build the app UI elements and they can be found under res --> layout. The activity_main.xml is the "outer" part of the activity layout (toolbar, action button, etc.) and content_main.xml is the inner part where you put your own layout (the blank space).
- **build.gradle**: This file is located in the root project directory andtells Gradle which modules it should include when building your app. Gradle is a dependency management tool.

## 2- Getting started with your first Android app
### a- Download and Install Android studio

### b- Create a new Android studio project



### c- Installing Intercom SDK for your Android app

### d- Updating "" with the correct permissions



### e- Initializing Intercom for your Android app



### f- Adding the UI elements to your Android app



### g- Interacting with your app's UI elements.



Let's now add the logic behind each of our button:
- **_Register user_**: What we want here is to read the value entered in the text field then [register the user](https://developers.intercom.com/installing-intercom/docs/ios-installation#section-step-3-register-your-users) with Intercom using the user_id or email based on the value entered. The code we gonna be using here is:
```
       let identifier = String(user_id_email_text_field.text!)
        if identifier.contains("@"){
            Intercom.registerUser(withEmail: identifier)
           
        } else {
            
            Intercom.registerUser(withUserId: identifier)
        }
```

- **_Signout_**: This button will [logout](https://developers.intercom.com/installing-intercom/docs/ios-installation#section-how-to-unregister-a-user) the user (`Intercom.logout()`)
- **_Display messenger_**: This button will make the [messenger widget visible](https://developers.intercom.com/installing-intercom/docs/ios-configuration#section-choose-how-the-launcher-appears-and-opens-for-your-users) (`Intercom.setLauncherVisible(true)`)
- **_Hide messenger_**: This will hide the messenger widget (`Intercom.setLauncherVisible(false)`)

At this stage, your View Controller should like like:

![](https://downloads.intercomcdn.com/i/o/96369822/179385dabfec0a2af919b976/ViewController_swift.jpg)

Finally **make sure to import Intercom by add "import Intercom" to the top of your ViewController.swift file**

### h- Run your Android app



## 3- Next steps

You can enrich your Android app but addind some extra features to it:
- [Updating a user's data and sending custom attributes](https://developers.intercom.com/installing-intercom/docs/android-configuration#section-update-a-user)
- [Tracking events](https://developers.intercom.com/installing-intercom/docs/android-configuration#section-submit-an-event)
- [Displaying the Help center](https://developers.intercom.com/installing-intercom/docs/android-configuration#section-articles-help-center)
