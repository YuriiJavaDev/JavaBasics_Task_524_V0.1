# Component Event Interaction: Nested Login Layout (JavaBasics_Task_524_V0.1)

## 📖 Description
In professional desktop application design, arranging graphical elements requires a strict hierarchical layout strategy to guarantee proper window resizing behavior and visual alignment. This project demonstrates composite window structuring by nesting layout managers within Java Swing. The root container leverages a **`BorderLayout`** framework to split the workspace into directional structural sectors. The `NORTH` zone hosts a static header, and the `SOUTH` zone handles system status updates. The `CENTER` structural zone isolates the actual user credentials intake form inside a dedicated **`JPanel`** operating on an inline **`FlowLayout`** scheme, ensuring automatic component wrapping and sequential component positioning.

## 📋 Requirements Compliance
- **Root Layout Segmentation**: Managed the primary frame layout utilizing a structured `BorderLayout` manager.
- **Header Alignment (`NORTH`)**: Placed a centered, bolded application title header using `JLabel`.
- **Inline Form Wrapping (`CENTER`)**: Deployed a nested `JPanel` running `FlowLayout` to house inline input fields and credentials fields.
- **Status Reporting Matrix (`SOUTH`)**: Fixed an independent status telemetry label tracking connection states.

## 🚀 Architectural Stack
- Java 17+ (Java AWT Layout Managers, Java Swing)

## 🏗️ Implementation Details
- **LoginLayout**: Principal framing window configuring component boundaries, managing field bounds, and nesting internal layout panels.

## 📋 Expected result
- **Top Zone**: Centered bold text `"Login System"`.
- **Center Zone**: Horizontal, wrapping form row containing `Username`, `Password`, fields, and a `Login` action button.
- **Bottom Zone**: Aligned status tracking label `"Status: Not logged in"`.

## 💻 Code Example

Project Structure:

    JavaBasics_Task_524/
    ├── src/
    │   └── com/yurii/pavlenko/
    │                 └── app/
    │                     └── LoginLayout.java
    ├── LICENSE
    ├── TASK.md
    ├── THEORY.md
    └── README.md

Code
```java
package com.yurii.pavlenko.app;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

public class LoginLayout extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginLayout app = new LoginLayout();
            app.setVisible(true);
        });
    }

    public LoginLayout() {
        super("Login System Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 180);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JLabel titleLabel = new JLabel("Login System", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 15));
        JLabel userLabel = new JLabel("Username");
        JTextField userField = new JTextField(10);

        JLabel passLabel = new JLabel("Password");
        JPasswordField passField = new JPasswordField(10);

        JButton loginButton = new JButton("Login");

        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);
        formPanel.add(loginButton);

        add(formPanel, BorderLayout.CENTER);

        JLabel statusLabel = new JLabel("Status: Not logged in", JLabel.LEFT);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(statusLabel, BorderLayout.SOUTH);
    }
}
```

## ⚖️ License
This project is licensed under the **MIT License**.

Copyright (c) 2026 Yurii Pavlenko

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files...

License: [MIT](LICENSE)
