package com.Ui.Fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.Ui.Adapter.MyAdapter;
import com.Ui.modal.DataModal;
import com.example.scrap.R;

import java.util.ArrayList;

public class Home_bottom_Fragment extends Fragment {

    RecyclerView recyclerView;
    ArrayList<DataModal> dataholder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_home_bottom_, container, false);
        recyclerView= view.findViewById(R.id.recyclerView);
        // this line is for linear vertical scroolable
//        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),LinearLayoutManager.HORIZONTAL,true));

        // initalised data modal.

        dataholder= new ArrayList<>();

        DataModal ob1= new DataModal(R.drawable.tata, "Tata", "Tata company");
        dataholder.add(ob1);

        DataModal ob2= new DataModal(R.drawable.honda, "honda", "honda company");
        dataholder.add(ob1);


        DataModal ob3= new DataModal(R.drawable.toyota, "toyoto", "Toyata company");
        dataholder.add(ob1);

        DataModal ob4= new DataModal(R.drawable.tata, "Honda", "Honda company");
        dataholder.add(ob1);

        DataModal ob5= new DataModal(R.drawable.tata, "Honda", "Honda company");
        dataholder.add(ob1);


        DataModal ob6= new DataModal(R.drawable.tata, "Honda", "Honda company");
        dataholder.add(ob1);

        DataModal ob7= new DataModal(R.drawable.tata, "Honda", "Honda company");
        dataholder.add(ob1);
        DataModal ob8= new DataModal(R.drawable.tata, "Honda", "Honda company");
        dataholder.add(ob1);

        DataModal ob9= new DataModal(R.drawable.tata, "Honda", "Honda company");
        dataholder.add(ob1);


        recyclerView.setAdapter(new MyAdapter(dataholder));

        return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}