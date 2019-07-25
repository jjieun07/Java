package chatClient;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// VC
public class ChatClientGUI extends JFrame /* implements OnRecieveListener */ {
	   private JLabel label;
	   private JTextField textField;
	   private JButton button;
	   private IClientChat clientChat;
	   
	   public ChatClientGUI(IClientChat clientChat) {
	      this.clientChat = clientChat;
	      
	      label = new JLabel("");
	      textField = new JTextField("ddddd");
	      button = new JButton("����");
	      
	      setLayout(new FlowLayout());
	      add(label);
	      add(textField);
	      add(button);
	      
	      button.addActionListener(new ActionListener() {
	         @Override
	         public void actionPerformed(ActionEvent e) {
	            clientChat.sendMessage(textField.getText());
	         }
	      });
	      
	      // �޽����� ������ �� ó��
	      clientChat.addOnRecieveListener(new OnRecieveListener() {
	         @Override
	         public void onRecieve(String message) {
	            label.setText(message);
	         }
	      });
	      
	      // OnRecieveListener�� ��ӹ޾��� ���
	      // clientChat.addOnRecieveListener(this);
	      
	      setSize(500, 500);
	      setVisible(true);
	   }
	   
	   	//  OnRecieveListener�� ��ӹ޾��� ���  (�������̵� ����� ��)
//       @Override
//       public void onRecieve(String message) {
//          label.setText(message);
//       }
	}