package com.vibol.corepattern.singletone01;

import java.io.Serializable;

public class Logger implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;

	// Volatile ensures visibility across threads
    private static volatile Logger instance;

	// Private constructor prevents instantiation
    private Logger() {
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    // Double-checked locking for thread safety + performance
    public static Logger getInstance() {
        if (instance == null) {
            synchronized (Logger.class) {
                if (instance == null) {
                    instance = new Logger();
                }
            }
        }
        return instance;
    }
    
    // Logging method
    public void log(String message) {
        System.out.println("[LOG] " + message);
    }
	
    // Prevent breaking singleton during deserialization
    protected Object readResolve() {
        return getInstance();
    }
	
	// Prevent cloning
    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException("Cloning not allowed for Singleton");
    }

}
