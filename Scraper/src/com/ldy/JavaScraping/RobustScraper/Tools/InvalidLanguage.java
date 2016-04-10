package com.ldy.JavaScraping.RobustScraper.Tools;

public class InvalidLanguage extends Exception{

	/**
	 * thrown if a two letter language code (e.g. "en," "fr," "de") does not actually exist
	 */
	private static final long serialVersionUID = 1L;

	public InvalidLanguage(String msg){
		System.out.println(msg);
	}
}
