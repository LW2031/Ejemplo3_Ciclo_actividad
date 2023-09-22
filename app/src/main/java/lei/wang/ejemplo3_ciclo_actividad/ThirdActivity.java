package lei.wang.ejemplo3_ciclo_actividad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("Estados", "7- Estoy en el método Restart 3");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Estados", "6- Estoy en el método Destroy 3");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Estados", "5- Estoy en el método Stop 3");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Estados", "4- Estoy en el método Pause 3");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Estados", "3- Estoy en el método Resume 3");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Estados", "2- Estoy en el método Start 3");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Log.e("Estados", "2- Estoy en el método Create 3");
    }
}