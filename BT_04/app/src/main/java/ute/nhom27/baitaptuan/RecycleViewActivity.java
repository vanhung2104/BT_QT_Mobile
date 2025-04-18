package ute.nhom27.baitaptuan;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import ute.nhom27.baitaptuan.adapter.RecycleViewAdapter;
import ute.nhom27.baitaptuan.model.Nhac;

public class RecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_recycle_view);

        RecyclerView rv = findViewById(R.id.recycleView);
        List<Nhac> NhacList = new ArrayList<>();
        NhacList.add(new Nhac("60696", "NEU EM CÒN TỔN TẠI", "Khi anh bat đầu 1 tinh yêu Là lúc anh tự thay", "Trinh Đinh Quang"));
        NhacList.add(new Nhac("60701", "NGOC", "Co rat nhieu nhung cau chuyen Em dau rieng minh em biet", "Khac Viet"));
        NhacList.add(new Nhac("60650", "HAY TIN ANH LAN NUA", "Dau cho ta da sai khi o ben nhau Co yeu thương", "Thien Dung"));
        NhacList.add(new Nhac("60610", "CHUOI NGAY VANG EM", "To khi em buoc ra di coi long anh ngap trang bao","Duy Cuong"));
        NhacList.add(new Nhac("60656", "KHI NGUỜI MINH YEU KHOC", "Nước mat em đang roi tren những ngon tay Nước mat em", "Pham Manh Quynh"));
        NhacList.add(new Nhac("60685", "MO", "Anh mơ gặp em anh mơ được om anh mơ được gần", "Trinh Thang Binh"));
        NhacList.add(new Nhac("60752", "TINH YEU CHAP VA", "Muon di xa noi yeu thuong minh tng co De khong nghe", "Mr. Siro"));
        NhacList.add(new Nhac("60608", "CHO NGAY MUA TAN", "1 ngay mua va em khuat xa noi anh bong dang cứ", "Trung Đức"));
        NhacList.add(new Nhac("60603", "CAU HOI EM CHUA TRA LOI", "Cần nơi em 1 lời giai thich that lòng Dừng lặng im", "Yuki Huy Nam"));
        NhacList.add(new Nhac("60720", "QUA DI LẶNG LỄ", "Đôi khi đến với nhau yêu thương chẳng được lâu nhung khi", "Phan Manh Quỳnh"));
        NhacList.add(new Nhac("60856", "QUEN ANH LA DIEU EM KHONG THE - REMIX", "Can them bao lau de em quen di niem dau Can them","Thien Ngon"));


        // Gán LayoutManager (bắt buộc)
        rv.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        RecycleViewAdapter adapter = new RecycleViewAdapter(getApplicationContext(), NhacList);
        rv.setAdapter(adapter);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}