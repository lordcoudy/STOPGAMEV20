package com.lordcoudy.stopgamev20.MenuActivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import com.lordcoudy.stopgamev20.MainActivity;
import com.lordcoudy.stopgamev20.R;

public class BlogsActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blogs);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myWebView = (WebView)findViewById(R.id.WebView2);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://stopgame.ru/blogs");
        myWebView.setWebViewClient(new WebViewClient());

        // Получаем экземпляр элемента Spinner
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);

        // Настраиваем адаптер
        ArrayAdapter adapter =
                ArrayAdapter.createFromResource(this, R.array.blogs, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Вызываем адаптер
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {

                String[] choose = getResources().getStringArray(R.array.blogs);
                    if (choose[selectedItemPosition].equals("Новые темы")) {
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                        toast.show();
                        myWebView.loadUrl("https://stopgame.ru/blogs");
                    }else if (choose[selectedItemPosition].equals("Топ")){
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                        toast.show();
                        myWebView.loadUrl("https://stopgame.ru/blogs/top/good/month");
                    }else if (choose[selectedItemPosition].equals("Сообщества")){
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                        toast.show();
                        myWebView.loadUrl("https://stopgame.ru/blogs/communities");
                    }else if (choose[selectedItemPosition].equals("Мое избранное")){
                        Toast toast = Toast.makeText(getApplicationContext(),
                                "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                        toast.show();
                        myWebView.loadUrl("https://stopgame.ru/blogs/favorite");
                    }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });

    }

    public void onBackButtonClick(View view) {
        Intent intent  = new Intent(BlogsActivity.this, MainActivity.class);
        startActivity(intent);
    }




}
