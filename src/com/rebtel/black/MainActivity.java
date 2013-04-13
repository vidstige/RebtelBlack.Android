package com.rebtel.black;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;

public class MainActivity extends ListActivity implements OnItemClickListener {

	private ArrayAdapter<Contact> contacts;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		contacts = new ArrayAdapter<Contact>(this, android.R.layout.simple_expandable_list_item_1);
		contacts.add(new Contact("Peter Forsberg"));
		contacts.add(new Contact("Zelda"));
		
		setContentView(R.layout.activity_main);
		
		setListAdapter(contacts);
		getListView().setOnItemClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
		Intent intent = new Intent(this, ContactCard.class);
		Contact contact = (Contact)adapter.getItemAtPosition(position);
		intent.putExtra("contact", contact);
		startActivity(intent);
	}
}
