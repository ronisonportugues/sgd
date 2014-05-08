package br.com.sgd.util;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
@SuppressWarnings("rawtypes")
public class ToolsReflection {
	
	public static Object getTNewInstance(Object object) {
		try {
			return getNewInstance(getTClass(object));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Object getNewInstance(Class clazz) {
		try {
			return clazz.newInstance();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static Class getTClass(Object object) {
		return getTClass(object.getClass());
	}

	public static Class getTClass(Class clazz) {
		try {
			Type[] types = ((ParameterizedType) clazz.getGenericSuperclass())
					.getActualTypeArguments();
			return (Class) types[0];
		} catch (Exception e) {
			return null;
		}
	}

}
