package com.lordcoudy.stopgamev20;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Spinner;

import com.lordcoudy.stopgamev20.MenuActivities.BlogsActivity;
import com.lordcoudy.stopgamev20.MenuActivities.FAQActivity;
import com.lordcoudy.stopgamev20.MenuActivities.GalleryActivity;
import com.lordcoudy.stopgamev20.MenuActivities.GamesActivity;
import com.lordcoudy.stopgamev20.MenuActivities.LiveActivity;
import com.lordcoudy.stopgamev20.MenuActivities.NewsActivity;
import com.lordcoudy.stopgamev20.MenuActivities.PeopleActivity;
import com.lordcoudy.stopgamev20.MenuActivities.SecretsActivity;
import com.lordcoudy.stopgamev20.MenuActivities.VideosActivity;
import com.lordcoudy.stopgamev20.MenuActivities.WritingsActivity;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    WebView myWebView;
//    private SwipeRefreshLayout mSwipeRefresh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myWebView = (WebView)findViewById(R.id.WebView1);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://stopgame.ru");
        myWebView.setWebViewClient(new WebViewClient());

//        mSwipeRefresh = (SwipeRefreshLayout) findViewById(R.id.swipe_refresh);

//        //Настраиваем выполнение OnRefreshListener для данной activity:
//        mSwipeRefresh.setOnRefreshListener(this);
//        //Настраиваем цветовую тему значка обновления, используя наши цвета:
//        mSwipeRefresh.setColorSchemeResources
//                (R.color.colorPrimary, R.color.colorPrimaryDark,R.color.colorAccent);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_games) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.games");
            startActivity(intent);
        } else if (id == R.id.nav_news) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.news");
            startActivity(intent);
        } else if (id == R.id.nav_writings) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.writings");
            startActivity(intent);
        } else if (id == R.id.nav_videos) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.videos");
            startActivity(intent);
        } else if (id == R.id.nav_live) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.live");
            startActivity(intent);
        } else if (id == R.id.nav_secrets) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.secrets");
            startActivity(intent);
        } else if (id == R.id.nav_gallery) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.gallery");
            startActivity(intent);
        } else if (id == R.id.nav_blogs) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.blogs");
            startActivity(intent);
        } else if (id == R.id.nav_people) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.people");
            startActivity(intent);
        } else if (id == R.id.nav_faq) {
            Intent intent  = new Intent("com.lordcoudy.stopgamev20.faq");
            startActivity(intent);
        } else if (id == R.id.app_bar_search) {
            myWebView.loadUrl("https://stopgame.ru/search/?s=&where=games");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

//    @Override
//    public void onRefresh() {
//        new Handler().postDelayed(new Runnable() {
//            @Override public void run() {
//
//                //Останавливаем обновление:
//                mSwipeRefresh.setRefreshing(false)
//                ;}}, 5000);
//    }
}
