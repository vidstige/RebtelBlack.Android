package com.rebtel.black;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ContactCard extends Activity {
	private Contact contact;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_contactcard);
		
		Intent intent = getIntent();
	    contact = intent.getParcelableExtra("contact");
	}
	
}
