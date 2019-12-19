package polinema.ac.id.starterchapter05;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import polinema.ac.id.starterchapter05.activities.DynamicActivity;
import polinema.ac.id.starterchapter05.activities.StaticActivty;
import polinema.ac.id.starterchapter05.activities.TugasFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handlerClickStaticFragment(View view) {
        Intent i = new Intent(this, StaticActivty.class);
        startActivity(i);
    }

    public void handlerClickDynamicFragment(View view) {
        Intent i = new Intent(this, DynamicActivity.class);
        startActivity(i);
    }

    public void handlerClickPraktikumFragment(View view) {
        Intent i = new Intent(this, TugasFragment.class);
        startActivity(i);
    }
}