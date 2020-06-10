package com.baniota.Customer;

public class Customer {
    // 배열에 저장할 수 있는 최대 고객의 수
    private final int MAX = 100;
	// 고객정보를 저장할 변수를 배열로 선언
    private String[] nameList = new String[MAX]; // 이름 저장
    private char[] genderList = new char[MAX]; // 성별 저장
    private String[] emailList = new String[MAX]; // 이메일 저장
    private int[] birthYearList = new int[MAX]; // 출생년도 저장
    
    public int getMAX() {
		return MAX;
	}
	public String[] getNameList() {
		return nameList;
	}
	public void setNameList(String[] nameList, int i) {
		this.nameList[i] = nameList[i];
	}
	public char[] getGenderList() {
		return genderList;
	}
	public void setGenderList(char[] genderList) {
		this.genderList = genderList;
	}
	public String[] getEmailList() {
		return emailList;
	}
	public void setEmailList(String[] emailList) {
		this.emailList = emailList;
	}
	public int[] getBirthYearList() {
		return birthYearList;
	}
	public void setBirthYearList(int[] birthYearList) {
		this.birthYearList = birthYearList;
	}
    
    

}
