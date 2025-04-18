package ute.nhom27.baitaptuan;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

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

        Button bttListView = findViewById(R.id.button);
        bttListView.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, ListViewActivity.class);
            startActivity(intent);
        });

        Button bttGridView = findViewById(R.id.button2);
        bttGridView.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
            startActivity(intent);
        });

        Button bttRecyclerView = findViewById(R.id.button3);
        bttRecyclerView.setOnClickListener(v -> {

            Intent intent = new Intent(MainActivity.this, RecycleViewActivity.class);
            startActivity(intent);
        });
    }
}