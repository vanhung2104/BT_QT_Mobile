package vn.hung.baitap01;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DaoNguocActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daonguoc);

        Button btt = findViewById(R.id.button5);
        EditText editText = findViewById(R.id.editText5);
        TextView textView = findViewById(R.id.textView52);
        btt.setOnClickListener(view -> {
            String input = editText.getText().toString().trim();

            // Tách các từ trong chuỗi
            String[] words = input.split(" ");

            // Khởi tạo StringBuilder để xây dựng chuỗi kết quả
            StringBuilder reversed = new StringBuilder();

            // Lặp qua các từ từ cuối đến đầu
            for (int i = words.length - 1; i >= 0; i--) {
                reversed.append(words[i]).append(" ");
            }

            // Chuyển chuỗi đã đảo ngược thành in hoa và loại bỏ khoảng trắng cuối
            String result = reversed.toString().trim().toUpperCase();

            // Hiển thị kết quả lên TextView
            textView.setText(result);

            // Hiển thị kết quả trong Toast
            Toast.makeText(getApplicationContext(), result, Toast.LENGTH_SHORT).show();
        });
    }
}
