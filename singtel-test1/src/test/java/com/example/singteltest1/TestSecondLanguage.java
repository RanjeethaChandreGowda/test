package com.example.singteltest1;

import java.util.Locale;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

@SpringBootTest
public class TestSecondLanguage implements MessageSourceAware {

	@Autowired
	private static MessageSource messageSource;

	@Override
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	
	String[] roosterSound = new String[] { "da", "du", "fi", "fr", "ge", "gr", "heb", "hu", "it", "ja", "po", "ru",
			"sw", "tu", "ur" };

	Rooster rooster = new Rooster();

	@Test
	public void testLanguage() {
		for (String language : roosterSound) {
			Locale locale = new Locale.Builder().setLanguage(language).build();
			messageSource.getMessage(rooster.sound(), null, locale);
		}
	}

}
