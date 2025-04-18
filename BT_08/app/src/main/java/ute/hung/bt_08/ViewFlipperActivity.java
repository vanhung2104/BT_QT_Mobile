package ute.hung.bt_08;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class ViewFlipperActivity extends AppCompatActivity {
    private ViewFlipper viewFlipperMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_view_flipper);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // anh xa
        viewFlipperMain = findViewById(R.id.viewFlipperMain);

        ActionViewFlipperMain();
    }

    private void ActionViewFlipperMain() {
        List<String> listFlipper = new ArrayList<>();
        listFlipper.add("https://png.pngtree.com/png-clipart/20230413/original/pngtree-coffee-cup-vintage-logo-png-image_9052433.png");
        listFlipper.add("https://th.bing.com/th/id/OIP.h4kSMQUys_XqXCI0RvSD_QHaHa?rs=1&pid=ImgDetMain");
        listFlipper.add("https://th.bing.com/th/id/OIP.7E0wULdDsy448QJtYt-CswHaEK?rs=1&pid=ImgDetMain");

        for(int i = 0; i < listFlipper.size(); i++){
            ImageView imgProduct = new ImageView(getApplicationContext());
            Glide.with(getApplicationContext()).load(listFlipper.get(i)).into(imgProduct);
            imgProduct.setScaleType(ImageView.ScaleType.FIT_XY);
            viewFlipperMain.addView(imgProduct);
        }

        viewFlipperMain.setFlipInterval(3000);
        viewFlipperMain.setAutoStart(true);

        // set animation
        Animation slide_in = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_in_right);
        Animation slide_out = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide_out_right);
        viewFlipperMain.setInAnimation(slide_in);
        viewFlipperMain.setOutAnimation(slide_out);
    }
}