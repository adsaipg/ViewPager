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
public class fragmentOne extends Fragment {
    int position;
    TextView textView;
    public fragmentOne(){};

    public  static fragmentOne newInstance(int position){
        fragmentOne frag=new fragmentOne();

        Bundle pos=new Bundle();
        pos.putInt("Key",position);
        frag.setArguments(pos);
        return frag;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle args=getArguments();
        if(args!=null)
            position=args.getInt("Key");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_one,container,false);
        textView=(TextView)view.findViewById(R.id.textshow2);
        textView.setText("This is page "+position);
        return view;
    }
}
