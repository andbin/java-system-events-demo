/*
SPDX-FileCopyrightText: Copyright (c) 2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.systemeventsdemo;

import java.awt.desktop.AppForegroundEvent;
import java.awt.desktop.AppForegroundListener;
import java.awt.desktop.AppHiddenEvent;
import java.awt.desktop.AppHiddenListener;
import java.awt.desktop.AppReopenedEvent;
import java.awt.desktop.AppReopenedListener;
import java.awt.desktop.ScreenSleepEvent;
import java.awt.desktop.ScreenSleepListener;
import java.awt.desktop.SystemSleepEvent;
import java.awt.desktop.SystemSleepListener;
import java.awt.desktop.UserSessionEvent;
import java.awt.desktop.UserSessionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SystemEventsDemoListener implements AppForegroundListener,
        AppHiddenListener, AppReopenedListener, ScreenSleepListener,
        SystemSleepListener, UserSessionListener {
    private static final Logger logger = LoggerFactory.getLogger(SystemEventsDemoListener.class);

    // Methods for AppForegroundListener

    @Override
    public void appMovedToBackground(AppForegroundEvent e) {
        logger.info("[AppForegroundListener] appMovedToBackground");
    }

    @Override
    public void appRaisedToForeground(AppForegroundEvent e) {
        logger.info("[AppForegroundListener] appRaisedToForeground");
    }


    // Methods for AppHiddenListener

    @Override
    public void appHidden(AppHiddenEvent e) {
        logger.info("[AppHiddenListener] appHidden");
    }

    @Override
    public void appUnhidden(AppHiddenEvent e) {
        logger.info("[AppHiddenListener] appUnhidden");
    }


    // Methods for AppReopenedListener

    @Override
    public void appReopened(AppReopenedEvent e) {
        logger.info("[AppReopenedListener] appReopened");
    }


    // Methods for ScreenSleepListener

    @Override
    public void screenAboutToSleep(ScreenSleepEvent e) {
        logger.info("[ScreenSleepListener] screenAboutToSleep");
    }

    @Override
    public void screenAwoke(ScreenSleepEvent e) {
        logger.info("[ScreenSleepListener] screenAwoke");
    }


    // Methods for SystemSleepListener

    @Override
    public void systemAboutToSleep(SystemSleepEvent e) {
        logger.info("[SystemSleepListener] systemAboutToSleep");
    }

    @Override
    public void systemAwoke(SystemSleepEvent e) {
        logger.info("[SystemSleepListener] systemAwoke");
    }


    // Methods for UserSessionListener

    @Override
    public void userSessionActivated(UserSessionEvent e) {
        logger.info("[UserSessionListener] userSessionActivated, reason={}", e.getReason());
    }

    @Override
    public void userSessionDeactivated(UserSessionEvent e) {
        logger.info("[UserSessionListener] userSessionDeactivated, reason={}", e.getReason());
    }
}
