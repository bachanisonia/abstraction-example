package com.learnjava.corejava.mapper;

public class MessagePacs009 implements SwiftMapper{
	
		
		private String msgref;
		private String traderef;
		
		public MessagePacs009(String traderef, String msgref) {
			this.traderef = traderef;
			this.msgref = msgref;
		}
		
		public void buildXML()
		{
			System.out.println("Building SWIFT XML Message " + msgref + " for trade ref " + traderef);
		}
	
}
