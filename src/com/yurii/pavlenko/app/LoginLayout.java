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

/**
 * Custom frame architecture isolating composite layout nesting configurations for form interfaces.
 */
public class LoginLayout extends JFrame {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            LoginLayout app = new LoginLayout();
            app.setVisible(true);
        });
    }

    /**
     * Constructs the application framing structure and organizes nested layout components.
     */
    public LoginLayout() {
        super("Login System Layout");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(550, 180);
        setLocationRelativeTo(null);

        // Enforce explicit BorderLayout onto the frame root layer
        setLayout(new BorderLayout());

        // Configuration for the NORTH zone: Header Text
        JLabel titleLabel = new JLabel("Login System", JLabel.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 18));
        add(titleLabel, BorderLayout.NORTH);

        // Configuration for the CENTER zone: Inline FlowLayout Input Form
        JPanel formPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 15));

        JLabel userLabel = new JLabel("Username");
        JTextField userField = new JTextField(10);

        JLabel passLabel = new JLabel("Password");
        JPasswordField passField = new JPasswordField(10);

        JButton loginButton = new JButton("Login");

        // Populate the nested flow container sequentially
        formPanel.add(userLabel);
        formPanel.add(userField);
        formPanel.add(passLabel);
        formPanel.add(passField);
        formPanel.add(loginButton);

        // Mount the nested form panel into the central frame zone
        add(formPanel, BorderLayout.CENTER);

        // Configuration for the SOUTH zone: Status Monitor
        JLabel statusLabel = new JLabel("Status: Not logged in", JLabel.LEFT);
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 12));
        add(statusLabel, BorderLayout.SOUTH);
    }
}