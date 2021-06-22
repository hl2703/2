package sg.edu.np.masterpeace;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavHostFragment navHostFragment =
                (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView);
        NavController navController = navHostFragment.getNavController();
        //NavController navController = Navigation.findNavController(this,  R.id.fragment);
        //AppBarConfiguration appBarConfiguration =
        // new AppBarConfiguration.Builder(navController.getGraph()).build();
        AppBarConfiguration appBarConfiguration =
                new AppBarConfiguration.Builder(R.id.firstFragment, R.id.secondFragment,R.id.thirdFragment).build();
        // NavigationUI.setupActionBarWithNavController(navController, appBarConfiguration);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);

    }
}