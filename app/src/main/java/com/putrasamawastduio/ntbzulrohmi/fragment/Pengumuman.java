package com.putrasamawastduio.ntbzulrohmi.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.putrasamawastduio.ntbzulrohmi.R;
import com.putrasamawastduio.ntbzulrohmi.adapter.CustomAdapter;

/**
 * Created by Satria on 2/9/2018.
 */

public class Pengumuman extends Fragment {
    ListView simpleList;
    String countryList[] = {"NTB 1", "NTB 2", "NTB 3", "NTB 4", "NTB 5", "NTB 6", "NTB 7", "NTB 8", "NTB 9", "NTB 10"};
    String tanggal[] = {"12/02/2018", "13/02/2018", "14/02/2018", "15/02/2018", "16/02/2018", "17/02/2018", "18/02/2018", "19/02/2018", "20/02/2018", "21/02/2018"};
    int flags[] = {R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp, R.drawable.ic_assignment_black_24dp,
            R.drawable.ic_assignment_black_24dp};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.pengumuman, container, false);


        simpleList = (ListView) view.findViewById(R.id.simpleListView);
        CustomAdapter customAdapter = new CustomAdapter(getContext(), countryList, tanggal, flags);
        simpleList.setAdapter(customAdapter);

        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {

                    case 0:
                        Toast.makeText(getContext(), "NTB 1", Toast.LENGTH_SHORT).show();
                        break;
                    case 1:
                        Toast.makeText(getContext(), "NTB 2", Toast.LENGTH_SHORT).show();
                        break;
                    case 2:
                        Toast.makeText(getContext(), "NTB 3", Toast.LENGTH_SHORT).show();
                        break;
                    case 3:
                        Toast.makeText(getContext(), "NTB 4", Toast.LENGTH_SHORT).show();
                        break;
                    case 4:
                        Toast.makeText(getContext(), "NTB 5", Toast.LENGTH_SHORT).show();
                        break;
                    case 5:
                        Toast.makeText(getContext(), "NTB 6", Toast.LENGTH_SHORT).show();
                        break;
                    case 6:
                        Toast.makeText(getContext(), "NTB 7", Toast.LENGTH_SHORT).show();
                        break;
                    case 7:
                        Toast.makeText(getContext(), "NTB 8", Toast.LENGTH_SHORT).show();
                        break;
                    case 8:
                        Toast.makeText(getContext(), "NTB 9", Toast.LENGTH_SHORT).show();
                        break;
                    case 9:
                        Toast.makeText(getContext(), "NTB 10", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}
