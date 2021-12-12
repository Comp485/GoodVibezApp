package com.codepath.nytimes.ui.home;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.codepath.nytimes.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    ArrayAdapter<String> itemsAdapter;

    public HomeFragment() {
    }

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Defines the xml file for the fragment

        List<String> quotes = new ArrayList<>();
        quotes.add("People inspire you, or they drain you. Pick them wisely.");
        quotes.add("Keep true. Never be ashamed of doing right. Decide what you think is right and stick to it.");
        quotes.add("Keep others in suspense, cultivate an air of unpredictability.");
        quotes.add("Have the fearless attitude of a hero and the loving heart of a child.");
        quotes.add("Life is like stepping onto a boat which is about to sail out to sea and sink.");
        quotes.add("The mirror is a worthless invention. The only way to truly see yourself is in the reflection of someone elses. eyes.");
        quotes.add("Be courteous to all, but intimate with few, and let those few be well tried before you give them your confidence. ");
        quotes.add("It's beautiful to be alone. To be alone does not mean to be lonely. It means the mind is not influenced and contaminated by society.");
        quotes.add("When angry count to ten before you speak. If very angry, count to one hundred.");
        quotes.add("How much pain they have cost us, the evils which have never happened.");
        quotes.add("The more you are focused on time - past and future - the more you miss the Now, the most precious thing there is.");
        quotes.add("What are we doing here, that is the question.");
        quotes.add("We can either add to our character each day, or we can fritter away our energies in distractions.");
        quotes.add("The scariest moment is always just before you start. After that, things can only get better.");
        quotes.add("The truth is simple. If it was complicated, everyone would understand it.");
        quotes.add("Do what you feel in your heart to be right – for you'll be criticized anyway.");


        itemsAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1, quotes);

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ListView listView = view.findViewById(R.id.lvItems);
        listView.setAdapter(itemsAdapter);
        return view;
    }

    // This event is triggered soon after onCreateView().
    // Any view setup should occur here.  E.g., view lookups and attaching view listeners.
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        // Setup any handles to view objects here
        // EditText etFoo = (EditText) view.findViewById(R.id.etFoo);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
