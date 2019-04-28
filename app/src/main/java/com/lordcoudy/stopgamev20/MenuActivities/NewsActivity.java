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

public class NewsActivity extends AppCompatActivity {

    WebView myWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myWebView = (WebView)findViewById(R.id.WebView7);
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        myWebView.loadUrl("https://stopgame.ru/news");
        myWebView.setWebViewClient(new WebViewClient());

        // Получаем экземпляр элемента Spinner
        final Spinner spinner = (Spinner)findViewById(R.id.spinner);

        // Настраиваем адаптер
        ArrayAdapter adapter =
                ArrayAdapter.createFromResource(this, R.array.news, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Вызываем адаптер
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            public void onItemSelected(AdapterView<?> parent,
                                       View itemSelected, int selectedItemPosition, long selectedId) {

                String[] choose = getResources().getStringArray(R.array.news);
                if (choose[selectedItemPosition].equals("Все")) {
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news");
                }else if (choose[selectedItemPosition].equals("PC")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/pc");
                }else if (choose[selectedItemPosition].equals("Xbox 360")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/x360");
                }else if (choose[selectedItemPosition].equals("Xbox One")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/xone");
                }else if (choose[selectedItemPosition].equals("PlayStation 3")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/ps3");
                }else if (choose[selectedItemPosition].equals("PlayStation 4")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/ps4");
                }else if (choose[selectedItemPosition].equals("PS Vita")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/psvita");
                }else if (choose[selectedItemPosition].equals("VR")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/vr");
                }else if (choose[selectedItemPosition].equals("Wii U")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/wiiu");
                }else if (choose[selectedItemPosition].equals("Nintendo Switch")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/nintendo_switch");
                }else if (choose[selectedItemPosition].equals("Mad Box")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/madbox");
                }else if (choose[selectedItemPosition].equals("MMO")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/mmo");
                }else if (choose[selectedItemPosition].equals("Мобильные")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/mobile");
                }else if (choose[selectedItemPosition].equals("Социальные")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/social");
                }else if (choose[selectedItemPosition].equals("Железо")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/hard");
                }else if (choose[selectedItemPosition].equals("Индустрия")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/industry");
                }else if (choose[selectedItemPosition].equals("Киберспорт")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/cybersport");
                }else if (choose[selectedItemPosition].equals("Кино")){
                    Toast toast = Toast.makeText(getApplicationContext(),
                            "Ваш выбор: " + choose[selectedItemPosition], Toast.LENGTH_SHORT);
                    toast.show();
                    myWebView.loadUrl("https://stopgame.ru/news/movies");
                }
            }
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
    }

    public void onBackButtonClick(View view) {
        Intent intent  = new Intent(NewsActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
