package com.rebtel.black;

import android.os.Parcel;
import android.os.Parcelable;

public class Contact implements Parcelable {
	private final String name;
	public Contact(String name)
	{
		this.name = name;
	}
	public String toString()
	{
		return name;			
	}
	
	@Override
	public int describeContents() { return 0; }
	
	@Override
	public void writeToParcel(Parcel parcel, int arg1) {
		parcel.writeString(name);
	}
	
	public static final Parcelable.Creator<Contact> CREATOR = new Parcelable.Creator<Contact>() {
    	public Contact createFromParcel(Parcel in) {
    		return new Contact(in.readString());
    	}

    	public Contact[] newArray(int size) {
    		return new Contact[size];
    	}
    };
}
