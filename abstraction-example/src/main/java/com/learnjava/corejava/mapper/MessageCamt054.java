package com.learnjava.corejava.mapper;

public class MessageCamt054 implements SwiftMapper {
	
	private String traderef;
	private String tradeaction;
	private String msgref;
	
	public MessageCamt054(String traderef, String tradeaction, String msgref) {
		//super();
		this.traderef = traderef;
		this.tradeaction = tradeaction;
		this.msgref = msgref;
	}
	
	public void buildXML() {
		
		System.out.println("Building SWIFT XML Message " + msgref + " for trade ref " + traderef + " with action " + tradeaction);
	}
	
	
	
}