package vn.hung.baitap01;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class InRaSoChanLeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insochanle);

        Button btt = findViewById(R.id.button4);
        TextView textView4 = findViewById(R.id.textView4);
        //viết code sinh ngẫu nhiên
        btt.setOnClickListener(view -> {
            // Chuỗi để hiển thị tất cả số ngẫu nhiên
            StringBuilder allNumbers = new StringBuilder();
            StringBuilder oddNumbers = new StringBuilder();
            StringBuilder evenNumbers = new StringBuilder();


            // Tạo 6 số ngẫu nhiên
            Random random = new Random();
            for (int i = 0; i < 6; i++) {
                int number = random.nextInt(10); // Sinh số ngẫu nhiên từ 0 đến 9
                allNumbers.append(number).append(" ");

                // Phân loại số chẵn/lẻ
                if (number % 2 == 0) {
                    evenNumbers.append(number).append(" ");
                } else {
                    oddNumbers.append(number).append(" ");
                }
            }

            // Hiển thị tất cả số lên TextView
            textView4.setText(allNumbers);

            // Ghi log số chẵn và số lẻ
            android.util.Log.d("Numbers", "Số chẵn: " + evenNumbers);
            android.util.Log.d("Numbers", "Số lẻ: " + oddNumbers);
        });
    }
}
