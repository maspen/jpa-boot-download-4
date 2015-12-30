package com.intelligrated.download.mapper.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

/**
 * Reading (from download file) converter which converts from String data to
 * Integer objects.
 * 
 * @author matt.aspen
 *
 */
@ReadingConverter
public class StringToIntegerConverter implements Converter<String, Integer> {
	/**
	 * Uncaught exception NumberFormatException
	 */
	@Override
	public Integer convert(String source) {
		if(source.length() == 0) {
			return null;
		}
		if(source.equalsIgnoreCase("")) {
			return null;
		}
		return Integer.valueOf(source);
	}
}
