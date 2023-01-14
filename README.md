<a name="">![Java 9](https://img.shields.io/badge/Java-9-cd853f "Java 9")</a>
<a name="">![Built with Apache Maven](https://img.shields.io/badge/Built%20with-Apache%20Maven-f76504 "Built with Apache Maven")</a>
<a name="">![MIT License](https://img.shields.io/badge/License-MIT-1081c1 "MIT License")</a>

# Java System Events Demo

This is a demo project to check and test the new **system events listeners** introduced in JDK 9. See the [`java.awt.Desktop`](https://docs.oracle.com/javase/9/docs/api/java/awt/Desktop.html) class, in particular the [`addAppEventListener​(SystemEventListener)`](https://docs.oracle.com/javase/9/docs/api/java/awt/Desktop.html#addAppEventListener-java.awt.desktop.SystemEventListener-) method and the [`SystemEventListener`](https://docs.oracle.com/javase/9/docs/api/java/awt/desktop/SystemEventListener.html) interface (and subinterfaces).

This demo is a simple *standalone* Java application that logs some informations on *standard-output* about the support of these system events listeners and then opens a basic frame to keep the application running, so that the user can test the supported listeners.

You can package the application using `mvn package` to create a single “uber” jar with no other dependencies (except, obviously, a Java runtime 9 or higher).

The following is an example of logging produced with Oracle JDK 19 on Windows 10:

```console
15:37:45.821 [            main] INFO  | Java VM name: Java HotSpot(TM) 64-Bit Server VM
15:37:45.825 [            main] INFO  | Java VM vendor: Oracle Corporation
15:37:45.826 [            main] INFO  | Java VM version: 19.0.1+10-21
15:37:45.831 [            main] INFO  | OS name: Windows 10
15:37:45.924 [            main] INFO  | AppForegroundListener supported: false
15:37:45.924 [            main] INFO  | AppHiddenListener supported: false
15:37:45.925 [            main] INFO  | AppReopenedListener supported: false
15:37:45.929 [            main] INFO  | ScreenSleepListener supported: false
15:37:45.929 [            main] INFO  | SystemSleepListener supported: true
15:37:45.930 [            main] INFO  | UserSessionListener supported: true
15:37:45.931 [            main] INFO  | SystemEventsDemoListener registered
15:37:45.931 [            main] INFO  | -----------------------------------
15:38:43.193 [AWT-EventQueue-0] INFO  | [UserSessionListener] userSessionDeactivated, reason=LOCK
15:39:23.387 [AWT-EventQueue-0] INFO  | [UserSessionListener] userSessionActivated, reason=LOCK
```

## License

This project is released under the **MIT License**, a very *permissive* free software license.

See the full text of the license: **[LICENSE.txt](LICENSE.txt)**
