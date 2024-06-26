/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package model;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author 42un19ue
 */

public class XOButton extends JButton {
    
    /**
     * @param args the command line arguments
     */
    public static boolean isXMove = true;
    public Point point;
    public int value = 0;
    private final ImageIcon xImageIcon;
    private final ImageIcon oImageIcon;

    public XOButton(int xImageIcon, int y) {
        this.xImageIcon = new ImageIcon("assets/image/x1.jpg");
        oImageIcon = new ImageIcon("assets/image/o1.jpg");
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);
        this.setIcon(new ImageIcon("assets/image/blank.png"));
        this.point = new Point(xImageIcon, y);
        XOButton _this = this;
        this.addMouseListener(new MouseListener() {

            @Override
            public void mouseReleased(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseExited(MouseEvent e) {
                if (_this.isEnabled()) {
                    _this.setBackground(null);
                    _this.setIcon(new ImageIcon("assets/image/blank.png"));
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (_this.isEnabled()) {
                    _this.setBackground(Color.GREEN);
                    _this.setIcon(new ImageIcon("assets/image/x1.png"));
                }
            }

            @Override
            public void mouseClicked(MouseEvent e) {
            }
        });
    }

    public void setState(Boolean isXMove) {
        if (isXMove) {
            setIcon(xImageIcon);
            value = 2;
            XOButton.isXMove = false;
            this.setDisabledIcon(xImageIcon);
        } else {
            setIcon(oImageIcon);
            value = 1;
            this.setDisabledIcon(oImageIcon);
            XOButton.isXMove = true;
        }
    }

    public void resetState() {
        value = 0;
        this.setEnabled(true);
        this.setIcon(new ImageIcon("assets/image/blank.jpg"));
        this.setDisabledIcon(new ImageIcon("assets/image/blank.jpg"));
    }
}