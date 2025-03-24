package com.example.dependencyinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;

@Component
public class Window extends JFrame {
    @Autowired
    public Window(Panel panel) {
        this.add(panel);
        this.setTitle("Zähler");
        this.setSize(240, 80);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}