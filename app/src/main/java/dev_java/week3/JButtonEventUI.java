package dev_java.week3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JButtonEventUI implements ActionListener {

 JButtonUI jbu = null;

 public JButtonEventUI(JButtonUI jButtonUI) {
  this.jbu = jButtonUI;
 }

 @Override
 public void actionPerformed(ActionEvent e) {
  Object obj = e.getSource();
  if (obj == jbu.jbtn_south) {
   System.out.println(jbu.jbtn_south.getText() + "버튼클릭");
  }
 }
}
