package pe.edu.ulima.promul;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    private boolean isDrawerOpen = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar actionBar = getSupportActionBar();

        if (actionBar != null){
            actionBar.setHomeAsUpIndicator(R.drawable.ic_action_bar_white);
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentManager fm = getSupportFragmentManager();
                if(item.getItemId() == R.id.listado){
                    //Menu 1. Abir UnoFragment
                    Fragment fra = new ListadoFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.fraContenido,fra);
                    ft.addToBackStack(null);
                    ft.commit();
                }/*else if (item.getItemId() == R.id.menu2){
                    //Menu 2. Abrir DosFragment
                    Fragment fra = new DosFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.fraContenido,fra);
                    ft.addToBackStack(null);
                    ft.commit();
                }else if (item.getItemId() == R.id.menu3){
                    //Menu 3. Abrir TresFragment
                    Fragment fra = new TresFragment();
                    FragmentTransaction ft = fm.beginTransaction();
                    ft.replace(R.id.fraContenido,fra);
                    ft.addToBackStack(null);
                    ft.commit();
                }*/
                drawerLayout.closeDrawers();
                isDrawerOpen = false;

                return true;
            }
        });
    }

    //Nav Drawer
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            //Si hacemos click en la estrellita
            if(!isDrawerOpen) {
                drawerLayout.openDrawer(GravityCompat.START);
                isDrawerOpen = true;
            }else{
                drawerLayout.closeDrawers();
                isDrawerOpen = false;
            }
        }
        return super.onOptionsItemSelected(item);
    }
}
