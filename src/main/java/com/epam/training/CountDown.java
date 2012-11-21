package com.epam.training;

import java.util.*;
import java.text.*;
import org.slf4j.*;

public class CountDown {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm");
	private static final Logger logger = LoggerFactory.getLogger(CountDown.class);
	
	public static void main(String[] args) throws Exception{
		VeryKomplex complex = new VeryKomplex();
		String coffeBreak = "2012.11.21 10:51";

		while (true) {
			Date now = new Date();
			logger.debug("coffeBreak: {}", coffeBreak);
			logger.debug("vco: {} other: {}", complex, 5);
			Date coffe = sdf.parse(coffeBreak);
		
			long minutesLeft = (coffe.getTime() - now.getTime())/60000;
			logger.info("minutes left till coffe break: {}", minutesLeft);
			
			logger.info("press any key ... ");
			System.in.read();
		}
	}
	
	static class VeryKomplex {
		public String toString() {
			try {
				Thread.currentThread().sleep(3000);
			} catch(Exception e) {
				logger.error("Thread problem ... ", e);
			}
			return "krumpli";
		}
	}
}