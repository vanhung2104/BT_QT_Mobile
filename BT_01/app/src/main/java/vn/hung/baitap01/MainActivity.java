package vn.hung.baitap01;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button bttHide = findViewById(R.id.buttonHide);
        bttHide.setOnClickListener(v -> {
            // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
            Intent intent = new Intent(MainActivity.this, AnTieuDeActivity.class);
            startActivity(intent);
        });

        Button btt4 = findViewById(R.id.button4);
        btt4.setOnClickListener(v -> {
            // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
            Intent intent = new Intent(MainActivity.this, InRaSoChanLeActivity.class);
            startActivity(intent);
        });

        Button btt5 = findViewById(R.id.button5);
        btt5.setOnClickListener(v -> {
            // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
            Intent intent = new Intent(MainActivity.this, DaoNguocActivity.class);
            startActivity(intent);
        });
    }
}