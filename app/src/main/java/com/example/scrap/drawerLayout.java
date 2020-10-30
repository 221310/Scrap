package com.example.scrap;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.Ui.Fragment.About_us_Fragment;
import com.Ui.Fragment.Home_bottom_Fragment;
import com.Ui.Fragment.KYCFragment;
import com.Ui.Fragment.LiveBid_bottom_Fragment;
import com.Ui.Fragment.LogoutFragment;
import com.Ui.Fragment.Membership_bottom_Fragment;
import com.Ui.Fragment.MyBit_Fragment;
import com.Ui.Fragment.My_bid_Bottom_Fragment;
import com.Ui.Fragment.Pay_Bottom_Fragment;
import com.Ui.Fragment.Pay_Fragment;
import com.Ui.Fragment.PostFragment;
import com.Ui.Fragment.ProductFragment;
import com.Ui.Fragment.ProfileFragment;
import com.Ui.Fragment.ShareFragment;
import com.Ui.Fragment.Switch_User_Fragment;
import com.Ui.Fragment.Term_Condition_Fragment;
import com.Ui.Fragment.WishListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

public class drawerLayout extends AppCompatActivity {

    NavigationView nav;
    ActionBarDrawerToggle toggle;
    DrawerLayout drawerLayout;
    androidx.appcompat.widget.Toolbar toolbar;
    BottomNavigationView bottomNavigation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawer_layout);

        toolbar = (androidx.appcompat.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        nav = findViewById(R.id.nav);
        drawerLayout = findViewById(R.id.drawer);

        bottomNavigation = findViewById(R.id.bottomNavigation);

        toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.open, R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

//        this 2 line code show first fragment in started(let main) Activity.
//     1)   getSupportFragmentManager().beginTransaction().replace(R.id.contener,new ProfileFragment()).commit();
//     2)   nav.setCheckedItem(R.id.myprofile);


        nav.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            Fragment temp;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.myprofile:
                        //     Toast.makeText(drawerLayout.this, "My Profile Open", Toast.LENGTH_SHORT).show();
                        //    drawerLayout.closeDrawer(GravityCompat.START);
                        temp = new ProfileFragment();
                        break;

                    case R.id.sdproduct:
                        //   Toast.makeText(drawerLayout.this, " Sd Product Open", Toast.LENGTH_SHORT).show();
                        temp = new ProductFragment();
                        break;

                    case R.id.mybit:
                        // Toast.makeText(drawerLayout.this, "My Bit Open", Toast.LENGTH_SHORT).show();
                        temp = new MyBit_Fragment();
                        break;

                    case R.id.pay:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new Pay_Fragment();
                        break;

                    case R.id.user:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new Switch_User_Fragment();
                        break;

                    case R.id.wishlist:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new WishListFragment();
                        break;

                    case R.id.kyc:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new KYCFragment();
                        break;

                    case R.id.post:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new PostFragment();
                        break;

                    case R.id.term_conditions:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new Term_Condition_Fragment();
                        break;

                    case R.id.share:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new ShareFragment();
                        break;

                    case R.id.about_us:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new About_us_Fragment();
                        break;
                    case R.id.logout:
                        //   Toast.makeText(drawerLayout.this, "My Pay Open", Toast.LENGTH_SHORT).show();
                        temp = new LogoutFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.contener, temp).commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                return true;
            }
        });


        //        this 2 line code show first fragment in started(let main) Activity.
        getSupportFragmentManager().beginTransaction().replace(R.id.contener,new Home_bottom_Fragment()).commit();
        nav.setCheckedItem(R.id.myprofile);

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            Fragment temp1;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.home:
                        temp1 = new Home_bottom_Fragment();
                        break;

                    case R.id.live_Bid:
                        temp1 = new LiveBid_bottom_Fragment();
                        break;

                    case R.id.pay:
                        temp1 = new Pay_Bottom_Fragment();
                        break;

                    case R.id.Membership:
                        temp1 = new Membership_bottom_Fragment();
                        break;

                    case R.id.My_bit_bottomNav:
                        temp1 = new My_bid_Bottom_Fragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.contener, temp1).commit();
                return true;
            }
        });
    }
}

