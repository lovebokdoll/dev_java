package dev_java.week4quize;

public class Money {
 public static final String UNIT = "원";
 private int money;

 public Money() {
 }

 public Money(int money) {
  this.money = money;
 }

 public int getMoney() {
  return money;
 }

 public void pay(int money) {
  this.money = this.money - money;
 }

 public void setMoney(int money) {
  this.money = money;
 }

 public static String getUnit() {
  return UNIT;
 }

 public void print() {
  System.out.println(money + UNIT + "이 있습니다.");
 }
}
