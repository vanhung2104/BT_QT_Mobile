package ute.nhom27.baitaptuan;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

import ute.nhom27.baitaptuan.adapter.CustomAdapter;
import ute.nhom27.baitaptuan.model.MonHoc;

public class GridViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_grid_view);

        ArrayList<MonHoc> list = new ArrayList<>();
        list.add(new MonHoc("C++",R.drawable.c2));
        list.add(new MonHoc("C#",R.drawable.c1));
        list.add(new MonHoc("Java",R.drawable.java));
        list.add(new MonHoc("Python",R.drawable.python));
        GridView gridView = findViewById(R.id.customGridView);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), R.layout.row_monhoc_gridview, list);
        gridView.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}