package com.codepath.nytimes;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.SearchView;
import android.widget.TableLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;


import com.codepath.nytimes.ui.books.BestSellerBooksFragment;
import com.codepath.nytimes.ui.home.HomeFragment;
import com.codepath.nytimes.ui.search.ArticleResultFragment;
import com.codepath.nytimes.ui.settings.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

        @Override
        public boolean onCreateOptionsMenu(Menu menu) {
            // Inflate the menu; this adds items to the action bar if it is present.
            getMenuInflater().inflate(R.menu.menu_type_one, menu);
            return true;
        }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar(); // or getActionBar();
        getSupportActionBar().setTitle("GOODVIBEZ"); // set the top title
        String title = actionBar.getTitle().toString(); // get the title
        //actionBar.hide(); // or even hide the actionbar

        final FragmentManager fragmentManager = getSupportFragmentManager();

        // define your fragments here
        final Fragment fragment1 = new HomeFragment();
        final Fragment fragment2 = new BestSellerBooksFragment();
        final Fragment fragment3 = new ArticleResultFragment();
        final Fragment fragment4 = new SettingsFragment();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.home:
                        // do something here
                        fragment = fragment1;
                        break;
                    case R.id.best:
                        // do something here
                        fragment = fragment2;
                        break;
                    case R.id.search:
                        // do something here
                        fragment = fragment3;
                        break;
                    case R.id.setting:
                        //do something here
                        fragment = fragment4;
                        break;
                    default:
                        fragment = fragment1;
                        break;
                }
                fragmentManager.beginTransaction().replace(R.id.layout, fragment).commit();
                return true;
            }

        });

        // Set default selection
        bottomNavigationView.setSelectedItemId(R.id.home);

        TabLayout tabLayout = findViewById(R.id.tablayout);


    }
}
