package com.example.demo.entities.enums;

public enum OrderStatus {
	WAITING_PAYMENT(1), PAID(2), SHIPPERD(3), DELIVERED(4), CANCELED(5);

	private int code;

	private OrderStatus(int code) {
		this.code = code;

	}

	public int gatCode() {
		return code;
	}

	public static OrderStatus valueOf(int code) {
		for (OrderStatus value : OrderStatus.values()) {
			if (value.gatCode() == code) {
				return value;
			}
		}
		throw new IllegalArgumentException("Invalid order Status code");
	}
}
