package ute.hung.bt_08.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import ute.hung.bt_08.databinding.*;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NewOrderFragment extends Fragment {
    FragmentNeworderBinding binding;
    public NewOrderFragment(){

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // inflate layout cho fragment
        binding = FragmentNeworderBinding.inflate(inflater, container, false);

        // load data from recycler view , .....
        return binding.getRoot();
    }
}