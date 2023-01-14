/*
SPDX-FileCopyrightText: Copyright (c) 2023 Andrea Binello ("andbin")
SPDX-License-Identifier: MIT
*/

package dev.andbin.systemeventsdemo;

import javax.swing.JFrame;

public class SystemEventsDemoFrame extends JFrame {
    private static final long serialVersionUID = 1L;

    public SystemEventsDemoFrame() {
        super("System Events Demo");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
