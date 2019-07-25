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
	      button = new JButton("전송");
	      
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
	      
	      // 메시지가 들어왔을 때 처리
	      clientChat.addOnRecieveListener(new OnRecieveListener() {
	         @Override
	         public void onRecieve(String message) {
	            label.setText(message);
	         }
	      });
	      
	      // OnRecieveListener를 상속받았을 경우
	      // clientChat.addOnRecieveListener(this);
	      
	      setSize(500, 500);
	      setVisible(true);
	   }
	   
	   	//  OnRecieveListener를 상속받았을 경우  (오버라이딩 해줘야 함)
//       @Override
//       public void onRecieve(String message) {
//          label.setText(message);
//       }
	}