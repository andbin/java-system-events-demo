/*
SPDX-FileCopyrightText: Copyright (c) 2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.systemeventsdemo;

import java.awt.Desktop;
import java.awt.Desktop.Action;
import java.lang.management.ManagementFactory;

import javax.swing.SwingUtilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemEventsDemo {
    private static final Logger logger = LoggerFactory.getLogger(SystemEventsDemo.class);

    public static void main(String[] args) {
        logger.info("Java VM name: {}", ManagementFactory.getRuntimeMXBean().getVmName());
        logger.info("Java VM vendor: {}", ManagementFactory.getRuntimeMXBean().getVmVendor());
        logger.info("Java VM version: {}", ManagementFactory.getRuntimeMXBean().getVmVersion());
        logger.info("OS name: {}", ManagementFactory.getOperatingSystemMXBean().getName());

        if (Desktop.isDesktopSupported()) {
            Desktop desktop = Desktop.getDesktop();

            boolean appForegroundListenerSupported = desktop.isSupported(Action.APP_EVENT_FOREGROUND);
            boolean appHiddenListenerSupported = desktop.isSupported(Action.APP_EVENT_HIDDEN);
            boolean appReopenedListenerSupported = desktop.isSupported(Action.APP_EVENT_REOPENED);
            boolean screenSleepListenerSupported = desktop.isSupported(Action.APP_EVENT_SCREEN_SLEEP);
            boolean systemSleepListenerSupported = desktop.isSupported(Action.APP_EVENT_SYSTEM_SLEEP);
            boolean userSessionListenerSupported = desktop.isSupported(Action.APP_EVENT_USER_SESSION);

            logger.info("AppForegroundListener supported: {}", appForegroundListenerSupported);
            logger.info("AppHiddenListener supported: {}", appHiddenListenerSupported);
            logger.info("AppReopenedListener supported: {}", appReopenedListenerSupported);
            logger.info("ScreenSleepListener supported: {}", screenSleepListenerSupported);
            logger.info("SystemSleepListener supported: {}", systemSleepListenerSupported);
            logger.info("UserSessionListener supported: {}", userSessionListenerSupported);

            if (appForegroundListenerSupported || appHiddenListenerSupported
                    || appReopenedListenerSupported || screenSleepListenerSupported
                    || systemSleepListenerSupported || userSessionListenerSupported) {
                desktop.addAppEventListener(new SystemEventsDemoListener());
                logger.info("SystemEventsDemoListener registered");
                logger.info("-----------------------------------");

                SwingUtilities.invokeLater(SystemEventsDemoFrame::new);
            } else {
                logger.warn("Desktop is supported but no system event listener is supported!");
            }
        } else {
            logger.warn("Desktop is not supported!");
        }
    }
}
