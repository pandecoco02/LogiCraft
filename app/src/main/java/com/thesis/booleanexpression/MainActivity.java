package com.thesis.booleanexpression;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;
import com.thesis.booleanexpression.Fragment.Help;
import com.thesis.booleanexpression.Fragment.History;
import com.thesis.booleanexpression.Fragment.Homepage;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Read data
        SharedPreferences sharedPreferences = getSharedPreferences("admin", Context.MODE_PRIVATE);
        Boolean isAdmin = sharedPreferences.getBoolean("isAdmin", false);

        bottomNav = findViewById(R.id.bottom_navigation);
        bottomNav.setSelectedItemId(R.id.nav_home);
        bottomNav.setOnItemSelectedListener(navListener);

        Fragment selectedFragment = new Homepage();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                selectedFragment).commit();

    }

    private NavigationBarView.OnItemSelectedListener navListener =
            item -> {
                int itemId = item.getItemId(); /* obtain the selected item ID from your source */
                Fragment selectedFragment = null;

                if (itemId == R.id.nav_home) {
                    selectedFragment = new Homepage();
                } else if (itemId == R.id.nav_history) {
                    selectedFragment = new History();

                } else if (itemId == R.id.nav_feedback) {
                    // Handle the profile case
                    selectedFragment = new Help();


                } else {
                    // Handle other cases or provide a default behavior
                    selectedFragment = new Homepage();
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, selectedFragment).commit();
                return true;
            };


}