package com.nacs.generic.Classes.main;

import com.nacs.generic.Classes.KeyValue;

public class MainKeyValue {
	public static void main(String[] args) {
		
	
	KeyValue<Long,String> phoneBook = new KeyValue<>();
	phoneBook.setKey(1234567890L);
	phoneBook.setValue("om");
	System.out.println(phoneBook.getKey()+"----->"+phoneBook.getValue());
	KeyValue<String,String> dictionary = new KeyValue<>();
	dictionary.setKey("play");
	dictionary.setValue("any action");
    String word =dictionary.getKey();
    String meaning =dictionary.getValue();
    System.out.println(word+"--------------------->"+meaning);
	}
}
