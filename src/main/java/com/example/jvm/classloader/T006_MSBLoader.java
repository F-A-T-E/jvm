package com.example.jvm.classloader;

public class T006_MSBLoader extends ClassLoader{

	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException{

		return null;
	}
}
