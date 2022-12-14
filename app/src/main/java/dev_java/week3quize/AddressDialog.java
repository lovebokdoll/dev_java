package dev_java.week3quize;

import javax.swing.JDialog;

public class AddressDialog {
  JDialog jdg = new JDialog();

  // System.exit(0); => 싹 닫힘
  // jf.dispose();
  public AddressDialog() {
    initDisplay();
  }

  public void initDisplay() {
    jdg.setSize(450, 400);
    jdg.setVisible(false);// 메모리는 로딩되어있지만 아직 보이지 않음
                          // 입력됐을때 클릭됐을 때 나타남
  }

  public void SetDialog(String title, Boolean isView) {
    // 이 메소드 안에서는?? sub에 있는 setVisible()호출하는데 파라미터는 지역변수..
    jdg.setTitle(title);
    jdg.setVisible(isView);// 13번을 바꾸기 위해서 다시 호출한 것
    // 파라미터를 통해서 결정하도록 한다.
  }

}