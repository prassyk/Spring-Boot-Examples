package com.logixal.lobs.audit.util;

public class LobsThreadLocal {
	
	@SuppressWarnings("rawtypes")
	public static final ThreadLocal lobsThreadLocal = new ThreadLocal();

	@SuppressWarnings("unchecked")
	public static void set(Context user) {
		lobsThreadLocal.set(user);
	}
	
	public static void unset() {
		lobsThreadLocal.remove();
	}

	public static Context get() {
		return (Context)lobsThreadLocal.get();
	}
}
