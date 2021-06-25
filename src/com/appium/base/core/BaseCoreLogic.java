package com.appium.base.core;

/**
 * contains all methods which are present in AndroidLoginHelper and IOSLoginHelper.
 * Methods are abstract here and defined in specific class (AndroidLoginHelper and IOSLoginHelper) 
 */
public abstract class BaseCoreLogic {



	public abstract void verifyEndTOEnd()
			throws InterruptedException;


}
