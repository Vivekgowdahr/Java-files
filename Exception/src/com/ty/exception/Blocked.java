package com.ty.exception;

public class Blocked  extends RuntimeException
{
String message;
public  Blocked(String message) {
	this.message=message;
}
}