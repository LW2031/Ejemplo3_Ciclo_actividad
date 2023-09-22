package lei.wang.ejemplo3_ciclo_actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnAbrir;

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Estados", "7- Estoy en el método Restart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados", "6- Estoy en el método Destroy");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados", "5- Estoy en el método Stop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados", "4- Estoy en el método Pause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados", "3- Estoy en el método Resume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados", "2- Estoy en el método Start");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAbrir = findViewById(R.id.btnActivity);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });

        Log.e("Estados", "1- Estoy en el método Create");


    }
}