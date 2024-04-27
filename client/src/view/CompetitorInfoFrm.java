/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package view;

import controller.Client;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import model.User;

/**
 *
 * @author 42un19ue
 */
public class CompetitorInfoFrm extends javax.swing.JFrame {

    private boolean isFriend;
    private User user;

    /**
     * Creates new form CompetitorInfoFrm
     */
    public CompetitorInfoFrm(User user) {
        try {
            initComponents();
            this.user = user;
            this.setTitle("Caro Game - Nhóm 15");
            this.setIconImage(new ImageIcon("assets/image/tic-tac-toe.png").getImage());
            this.setResizable(false);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.setLocationRelativeTo(null);
            jLabel6.setIcon(new ImageIcon("assets/avatar/" + user.getAvatar() + ".png"));
            nicknameValue.setText(user.getNickname());
            numberOfGameValue.setText("" + user.getNumberOfGame());
            numberOfWinValue.setText("" + user.getNumberOfWin());
            numberOfDrawValue.setText("" + user.getNumberOfDraw());
            rankValue.setText("" + user.getRank());
            if (user.getNumberOfGame() == 0) {
                winRatioValue.setText("-");
            } else {
                winRatioValue.setText(String.format("%.2f", (float) user.getNumberOfWin() / user.getNumberOfGame() * 100) + "%");
            }
            markValue.setText("" + (user.getNumberOfWin() * 10 + user.getNumberOfGame()));
            Client.socketHandle.write("check-friend," + user.getID());
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }

    public void checkFriend(boolean isFriend) {
        this.isFriend = isFriend;
        if (isFriend) {
            jButton1.setIcon(new ImageIcon("assets/icon/friends.png"));
            jButton1.setToolTipText("Bạn bè");
            isFriendLabel.setText("Bạn bè");

        } else {
            jButton1.setIcon(new ImageIcon("assets/icon/addfriend.png"));
            jButton1.setToolTipText("Click để gửi yêu cầu kết bạn");
            isFriendLabel.setText("Kết bạn để chơi chung dễ dàng hơn");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Backdrop = new javax.swing.JPanel();
        Info = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nicknameLabel = new javax.swing.JLabel();
        numberOfGameLabel = new javax.swing.JLabel();
        numberOfWinLabel = new javax.swing.JLabel();
        isFriendLabel = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nicknameValue = new javax.swing.JLabel();
        numberOfGameValue = new javax.swing.JLabel();
        numberOfWinValue = new javax.swing.JLabel();
        markLabel = new javax.swing.JLabel();
        rankLabel = new javax.swing.JLabel();
        markValue = new javax.swing.JLabel();
        rankValue = new javax.swing.JLabel();
        winRatioLabel = new javax.swing.JLabel();
        winRatioValue = new javax.swing.JLabel();
        numberOfDrawLabel = new javax.swing.JLabel();
        numberOfDrawValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Backdrop.setBackground(new java.awt.Color(102, 102, 102));
        Backdrop.setForeground(new java.awt.Color(102, 102, 102));

        Info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Info.setForeground(new java.awt.Color(255, 255, 255));
        Info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Info.setText("Thông tin đối thủ");

        javax.swing.GroupLayout BackdropLayout = new javax.swing.GroupLayout(Backdrop);
        Backdrop.setLayout(BackdropLayout);
        BackdropLayout.setHorizontalGroup(
            BackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackdropLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Info, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        BackdropLayout.setVerticalGroup(
            BackdropLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackdropLayout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(Info)
                .addGap(21, 21, 21))
        );

        jButton1.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nicknameLabel.setText("Game name");

        numberOfGameLabel.setText("Số ván chơi");

        numberOfWinLabel.setText("Số ván thắng");

        isFriendLabel.setForeground(new java.awt.Color(0, 51, 255));
        isFriendLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        isFriendLabel.setText("Các bạn hiện đang là bạn bè");

        nicknameValue.setText("{nickname}");

        numberOfGameValue.setText("{sovanchoi}");

        numberOfWinValue.setText("{sovanthang}");

        markLabel.setText("Điểm");

        rankLabel.setText("Rank");

        markValue.setText("{diem}");

        rankValue.setText("{thuhang}");

        winRatioLabel.setText("Tỉ lệ thắng");

        winRatioValue.setText("{tilethang}");

        numberOfDrawLabel.setText("Số ván hòa");

        numberOfDrawValue.setText("{sovanhoa}");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(nicknameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(numberOfGameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(numberOfWinLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(numberOfDrawLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(winRatioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rankLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(numberOfGameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nicknameValue, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfWinValue, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numberOfDrawValue, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(winRatioValue, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(markValue, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rankValue, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(isFriendLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Backdrop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nicknameValue)
                    .addComponent(nicknameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numberOfGameLabel)
                    .addComponent(numberOfGameValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfWinValue)
                    .addComponent(numberOfWinLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(numberOfDrawLabel)
                    .addComponent(numberOfDrawValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(winRatioLabel)
                    .addComponent(winRatioValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(markLabel)
                    .addComponent(markValue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rankLabel)
                    .addComponent(rankValue))
                .addGap(18, 18, 18)
                .addComponent(isFriendLabel)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (isFriend) {
            JOptionPane.showMessageDialog(rootPane, "Bạn và đối thủ đang là bạn bè");
        } else {
            int res = JOptionPane.showConfirmDialog(rootPane, "Bạn đồng ý gửi lời mời kết bạn tới đối thủ chứ", "Xác nhận yêu cầu kết bạn", JOptionPane.YES_NO_OPTION);
            if (res == JOptionPane.YES_OPTION) {
                try {
                    Client.socketHandle.write("make-friend," + user.getID());
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(rootPane, ex.getMessage());
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backdrop;
    private javax.swing.JLabel Info;
    private javax.swing.JLabel isFriendLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel markLabel;
    private javax.swing.JLabel markValue;
    private javax.swing.JLabel nicknameLabel;
    private javax.swing.JLabel nicknameValue;
    private javax.swing.JLabel numberOfDrawLabel;
    private javax.swing.JLabel numberOfDrawValue;
    private javax.swing.JLabel numberOfGameLabel;
    private javax.swing.JLabel numberOfGameValue;
    private javax.swing.JLabel numberOfWinLabel;
    private javax.swing.JLabel numberOfWinValue;
    private javax.swing.JLabel rankLabel;
    private javax.swing.JLabel rankValue;
    private javax.swing.JLabel winRatioLabel;
    private javax.swing.JLabel winRatioValue;
    // End of variables declaration//GEN-END:variables
}