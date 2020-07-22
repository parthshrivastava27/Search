package com.example.searchnames;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SearchView searchView;
    ListView namelist;

    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        searchView =   (SearchView)findViewById(R.id.searchview);
        namelist = (ListView)findViewById(R.id.namelist);


        list = new ArrayList<String>();

        list.add("Gaylord Balcom");
        list.add("Hosea Jack");
        list.add("Vera Fuselier");
        list.add("Kacy Poplar");
        list.add("Scottie Wallen");
        list.add("Deeanna Soukup");
        list.add("Brant Dipaola");
        list.add("Jeffie Parnell");
        list.add("Monte Heilig");
        list.add("Terrell Metzer");
        list.add("Annelle Ziolkowski");
        list.add("Lucila Tiger");
        list.add("Marybelle Ensign");
        list.add("Carmen Caylor");
        list.add("Coretta Harriss");
        list.add("Melida Waiters");
        list.add("Darlene Mund");
        list.add("Minta Lofton");
        list.add("Roxie Galyean");
        list.add("Theressa Hoaglin");
        list.add("Olivia");
        list.add("Ruby");
        list.add("Emily");
        list.add("Grace");
        list.add("Jessica");
        list.add("Chloe");
        list.add("Sophie");
        list.add("Lily");
        list.add("Amelia");
        list.add("Evie");
        list.add("Mia");
        list.add("Ella");
        list.add("Charlotte");
        list.add("Lucy");
        list.add("Megan");
        list.add("Isabella");
        list.add("Katie");
        list.add("Holly");
        list.add("Summer");
        list.add("Phoebe");
        list.add("Monica");
        list.add("Ross");
        list.add("Chandler");
        list.add("Abhinav");
        list.add("Akshay");
        list.add("Joey");
        list.add("Sherlock Holmes");
        list.add("James Watson");
        list.add("Lucifer");
        list.add("Sheldon Cooper");
        list.add("Leonard");
        list.add("Penny");
        list.add("Lizzy");
        list.add("George Wickham");
        list.add("Emilia");
        list.add("Akshat");
        list.add("Archa");
        list.add("Parth");
        list.add("Ava");
        list.add("Lola");
        list.add("Harry");
        list.add("Ron");
        list.add("Hermoine");
        list.add("Lidiya");
        list.add("Kitty");
        list.add("Autumn");
        list.add("Michel");
        list.add("John");
        list.add("Howard");
        list.add("Charile");
        list.add("Tom Cruise");
        list.add("Shahrukh Khan");
        list.add("Vin Diesel");
        list.add("Ben");
        list.add("Gweny");
        list.add("Darleen");
        list.add("Kabir");
        list.add("Preeti");
        list.add("Matt Deamon");
        list.add("Eminem");
        list.add("Zoey");
        list.add("Jacob");
        list.add("Rayn");
        list.add("Liam");
        list.add("Jake");
        list.add("Max");
        list.add("Luke");
        list.add("Tyler");
        list.add("Ethan");
        list.add("Issac");
        list.add("Leo");
        list.add("Noah");
        list.add("Logan");
        list.add("Owen");
        list.add("Alex");
        list.add("Charles");
        list.add("Kai");
        list.add("Brandon");
        list.add("Kian");
        list.add("Kieran");
        list.add("Louis");
        list.add("Mason");

        adapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
        namelist.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {

                adapter.getFilter().filter(s);
                return false;
            }
        });

    }
}