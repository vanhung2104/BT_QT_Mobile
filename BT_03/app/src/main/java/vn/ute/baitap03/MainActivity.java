package vn.ute.baitap03;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ConstraintLayout bg= findViewById(R.id.main);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(R.drawable.pop_1);
        arrayList.add(R.drawable.pop_2);
        arrayList.add(R.drawable.pop_3);

        Random random = new Random();
        int vitri = random.nextInt(arrayList.size());
        bg.setBackgroundResource(arrayList.get(vitri));

        Switch sw = findViewById(R.id.switch1);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){ //isChecked = true
                    bg.setBackgroundResource(R.drawable.background_intro);
                }else{
                    bg.setBackgroundResource(R.drawable.image_banner);
                }
            }

        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button bttLinear = findViewById(R.id.button);
        bttLinear.setOnClickListener(v -> {
            // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
            Intent intent = new Intent(MainActivity.this, LinearActivity.class);
            startActivity(intent);
        });

        Button bttLinear2 = findViewById(R.id.button2);
        bttLinear2.setOnClickListener(v -> {
            // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
            Intent intent = new Intent(MainActivity.this, Linear2Activity.class);
            startActivity(intent);
        });

        Button bttLogin = findViewById(R.id.button3);
        bttLogin.setOnClickListener(v -> {
            // Tạo Intent để chuyển sang AnThanhTieuDeAndroid
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
        });
    }
}