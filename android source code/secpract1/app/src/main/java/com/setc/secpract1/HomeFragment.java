package com.setc.secpract1;


import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
public class HomeFragment extends Fragment implements View.OnClickListener {
    private Button Savee,Vview,Deletee,BnUpdate;
    OnDbOpListener dbOpListener;
    public HomeFragment() {
    }
    public interface OnDbOpListener
    {
        public void dBOpPerformed(int method);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        Savee = view.findViewById(R.id.add_contacts);
        Savee.setOnClickListener(this);
        Vview = view.findViewById(R.id.view_contacts);
        Vview.setOnClickListener(this);
        Deletee = view.findViewById(R.id.delete_contact);
        Deletee.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View v) {
        switch(v.getId())
        {
            case R.id.add_contacts:
                dbOpListener.dBOpPerformed(0 );
                break;
            case R.id.view_contacts:
                dbOpListener.dBOpPerformed(1 );
                break;
             }
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

        Activity activity =(Activity)context; try {
            dbOpListener = (OnDbOpListener) activity; }
        catch (ClassCastException e)
        {
            throw new ClassCastException(activity.toString()+" must implement the interface method");
        } }
}

