package com.example.adarsh.viewpagerdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by adaRSH on 19-Sep-16.
 */
public class fragmentTwo extends Fragment {
    int position;
    private TextView textview;

    public fragmentTwo() {

    }
    public static fragmentTwo newInstance(int position)
    {
        fragmentTwo frag=new fragmentTwo();
        Bundle pos=new Bundle();
        pos.putInt("key",position);
        frag.setArguments(pos);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args=getArguments();
        if(args!=null)
            position=args.getInt("key");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_two,container,false);
        textview=(TextView)view.findViewById(R.id.textshow);
        textview.setText("This is page "+position);
        return view;
    }
}
