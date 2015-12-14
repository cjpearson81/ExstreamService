package com.paychex.exstream.api;

public interface ExstreamService {
	
	public byte[] generatePdf(String template);
	
	public String test();

}
