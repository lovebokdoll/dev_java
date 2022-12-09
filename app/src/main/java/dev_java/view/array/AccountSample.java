package dev_java.view.array;

public class AccountSample {
 ButtonArray1 ba1 = null;

 public AccountSample(ButtonArray1 ba1) {
  this.ba1 = ba1;
 }

 public String account() {
  return "낮춰라";
 }

 public void account2() {
  String msg = "낮춰라";
  ba1.jta_display.append(msg + "\n");
 }
}
