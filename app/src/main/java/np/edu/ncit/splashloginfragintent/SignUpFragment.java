package np.edu.ncit.splashloginfragintent;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class SignUpFragment extends Fragment {
TextView login;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sign_up, container, false);
        login=(TextView)view.findViewById(R.id.loginNow);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm=getParentFragmentManager();

                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.frameLayout,new LoginFragment());
//                ft.add(R.id.frameLayout,new SignUpFragment());

                ft.commit();

            }

        });
        return view;

    }
}