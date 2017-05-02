package com.example.android.cafeoino_singlesreenapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] servicesArray = {"Services:", "Walk-Ins Welcome","Good For Groups","Good For Kids","Take Out",
            "Waiter Service","Outdoor Seating"};

    String[] contactInfoArray = {"Dimitriou Gounari 49, Thessaloniki", "cafeoino2002@gmail.com",
            "http://www.cafeoino.gr/", "Call +30 231 021 6711", "Open Everyday 8:00AM - 2:00AM"};

    Integer[] imgId={R.drawable.ic_location_on_black_48dp,
                     R.drawable.ic_mail_black_48dp,
                     R.drawable.ic_chat_black_48dp,
                     R.drawable.ic_call_black_48dp,
                     R.drawable.ic_alarm_on_black_48dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.activity_listview, servicesArray);

        ListView listView = (ListView) findViewById(R.id.servicesList);
        listView.setAdapter(adapter);

        CustomListAdapter contactAdapter = new CustomListAdapter(this, contactInfoArray, imgId);
        listView = (ListView) findViewById(R.id.contactList);
        listView.setAdapter(contactAdapter);

    }

}
