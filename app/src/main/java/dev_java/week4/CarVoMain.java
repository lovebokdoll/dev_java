package dev_java.week4;

class CarVO {
 private int speed;
 private String carColor;
 private int wheelNum;

 CarVO() {
  // 0,null,0
 }

 CarVO(int speed) {
  this.speed = speed;
 }

 CarVO(int speed, String carColor) {
  this.speed = speed;
  this.carColor = carColor;
 }

 CarVO(int speed, String carColor, int wheelNum) {
  this.speed = speed;
  this.carColor = carColor;
  this.wheelNum = wheelNum;
 }

 @Override
 public String toString() {
  return "내 자동차는" + carColor + "이고,바퀴수는" + wheelNum
    + "이고,현재속도는" + speed + "입니다.";
 }

 public int getSpeed() {
  return this.speed;
 }

 public void setSpeed(int speed) {
  this.speed = speed;
 }

 public String getCarColor() {
  return this.carColor;
 }

 public void setCarColor(String carColor) {
  this.carColor = carColor;
 }

 public int getWheelNum() {
  return this.wheelNum;
 }

 public void setWheelNum(int WheelNum) {
  this.wheelNum = WheelNum;
 }

}

public class CarVoMain {
 public static void main(String[] args) {
  CarVO cVo1 = new CarVO();
  CarVO cVo2 = new CarVO(50, "검정색");
  CarVO cVo3 = new CarVO(50, "검정색",4);
  CarVoMain carVoMain = new CarVoMain();// override하지 않음
  System.out.println(carVoMain);
  System.out.println(cVo1);
  System.out.println(cVo2);
  System.out.println(cVo3);
 }
}
