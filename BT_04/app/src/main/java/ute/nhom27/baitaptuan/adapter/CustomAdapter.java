package ute.nhom27.baitaptuan.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import ute.nhom27.baitaptuan.R;
import ute.nhom27.baitaptuan.model.MonHoc;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int layout;
    ArrayList<MonHoc> monHocList;

    public CustomAdapter(Context ctx, int layout, ArrayList<MonHoc> monHocList){
        this.context = ctx;
        this.layout = layout;
        this.monHocList = monHocList;
    }

    @Override
    public int getCount() {
        return monHocList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        //lấy context
        LayoutInflater inflater = (LayoutInflater)
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        //gọi view chứa layout
        convertView = inflater.inflate(layout,null);

        //ánh xạ view
        TextView textView = convertView.findViewById(R.id.textView);
        ImageView img = convertView.findViewById(R.id.imageIcon);

        //gán giá trị
        textView.setText(monHocList.get(position).getName());
        img.setImageResource(monHocList.get(position).getPic());

        //trả về view
        return convertView;
    }
}
