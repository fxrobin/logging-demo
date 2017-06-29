package net.entetrs.demo.loggers;
import lombok.extern.apachecommons.CommonsLog;

@CommonsLog
public class SimpleClass {
	
	
	public static void simpleOperation()
	{
		System.out.println("in");
		if (log.isInfoEnabled())
		{
			log.info("LogInfo Ok");
		}
		
		if (log.isErrorEnabled())
		{
			log.error("LogError Ok");
		}
		System.out.println("out");
	}

}
