package lei.wang.ejemplo3_ciclo_actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    private Button btnAbrir;

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Estados", "7- Estoy en el método Restart 2");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados", "6- Estoy en el método Destroy 2");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados", "5- Estoy en el método Stop 2");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados", "4- Estoy en el método Pause 2");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados", "3- Estoy en el método Resume 2");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados", "2- Estoy en el método Start 2");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        btnAbrir = findViewById(R.id.btnAbrirTercera);

        btnAbrir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ThirdActivity.class);
                startActivity(intent);
            }
        });

        Log.e("Estados", "1- Estoy en el método Create 2");
    }
}