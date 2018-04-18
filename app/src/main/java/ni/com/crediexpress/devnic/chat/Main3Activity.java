package ni.com.crediexpress.devnic.chat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Toast.makeText(Main3Activity.this, "ESTO NO ES UNA PRUEBA", Toast.LENGTH_SHORT).show();
    }
}
