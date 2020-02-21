package com.gura.spring05.shop.dto;

public class ShopDto {
	private int num; //상품번호
	private String name; //상품명
	private int price; //상품가격
	private int remainCount; //재고갯수
	private String id; //주문자 아이디
	//디폴트 생성자
	public ShopDto() {}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getRemainCount() {
		return remainCount;
	}

	public void setRemainCount(int remainCount) {
		this.remainCount = remainCount;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	};
	
}
