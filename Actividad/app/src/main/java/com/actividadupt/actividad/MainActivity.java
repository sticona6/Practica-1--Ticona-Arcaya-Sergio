package com.actividadupt.actividad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn_cerrar;

    @Override
    public  boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public  boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id== R.id.action_settings){
            //Toast.makeText(this,"Este es el boton del menu",Toast.LENGTH_SHORT).show();
            //return true;
            Intent intent = new Intent(this, AcercaDeActivity.class);
            startActivity(intent);
        }
        return  super.onOptionsItemSelected(item);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Este es onCreate",Toast.LENGTH_SHORT).show();
        btn_cerrar = (Button)findViewById(R.id.btn_cerrar);
        btn_cerrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }


    @Override
    protected  void  onStart(){
        super.onStart();
        Toast.makeText(this,"Este es onStart",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void  onResume(){
        super.onResume();
        Toast.makeText(this,"Este es onResume",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void  onPause(){
        super.onPause();
        Toast.makeText(this,"Este es onPause",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void  onStop(){
        super.onStop();
        Toast.makeText(this,"Este es  onStop",Toast.LENGTH_SHORT).show();
    }

    @Override
    protected  void  onRestart(){
        super.onRestart();
        Toast.makeText(this,"Este es onRestart",Toast.LENGTH_SHORT).show();
    }
    @Override
    protected  void  onDestroy(){
        super.onDestroy();
        Toast.makeText(this,"Este es onDestroy",Toast.LENGTH_SHORT).show();
    }
}
