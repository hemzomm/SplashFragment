package np.edu.ncit.splashloginfragintent;

import android.os.Bundle;
import android.widget.FrameLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainScreen extends AppCompatActivity {
FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main_screen);
        frameLayout=(FrameLayout) findViewById(R.id.frameLayout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        // Load the LoginFragment by default
        FragmentManager fm=getSupportFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        ft.add(R.id.frameLayout,new LoginFragment());
        ft.commit();
    }
//    public void switchToSignupFragment() {
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.frameLayout, new SignUpFragment())
//                .addToBackStack(null)
//                .commit();
//    }
//
//    public void switchToLoginFragment() {
//        getSupportFragmentManager().popBackStack();
//    }


}