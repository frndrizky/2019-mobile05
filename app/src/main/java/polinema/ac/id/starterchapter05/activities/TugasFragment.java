package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragments.DipsFragment;
import polinema.ac.id.starterchapter05.fragments.HandstandFragment;
import polinema.ac.id.starterchapter05.fragments.PushupFragment;

import android.os.Bundle;
import android.view.View;

public class TugasFragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tugas_fragment);
    }

    public void handlePushup(View view) {
        Fragment fragmentTransaction = getSupportFragmentManager().findFragmentById(R.id.tugas_load_fragment);
        FragmentTransaction f = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        if(fragmentTransaction instanceof PushupFragment){
            f.replace(R.id.tugas_load_fragment, new PushupFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
        else{
            f.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            f.replace(R.id.tugas_load_fragment, new PushupFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
    }

    public void handleDips(View view) {
        Fragment fragmentTransaction = getSupportFragmentManager().findFragmentById(R.id.tugas_load_fragment);
        FragmentTransaction f = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        if(fragmentTransaction instanceof DipsFragment){
            f.replace(R.id.tugas_load_fragment, new DipsFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
        else{
            f.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            f.replace(R.id.tugas_load_fragment, new DipsFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
    }

    public void handleHandstand(View view) {
        Fragment fragmentTransaction = getSupportFragmentManager().findFragmentById(R.id.tugas_load_fragment);
        FragmentTransaction f = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
        if(fragmentTransaction instanceof HandstandFragment){
            f.replace(R.id.tugas_load_fragment, new HandstandFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
        else{
            f.setCustomAnimations(R.anim.enter_from_left,R.anim.exit_from_left,R.anim.enter_from_left,R.anim.exit_from_right);
            f.replace(R.id.tugas_load_fragment, new HandstandFragment() , "RED FRAGMENT");
            f.addToBackStack(null);
            f.commit();
        }
    }
}