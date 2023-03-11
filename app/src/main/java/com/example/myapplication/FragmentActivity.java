package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment);

        Button firstFragment = (Button) findViewById(R.id.firstFragment);
        Button secondFragment = (Button) findViewById(R.id.secondFragment);

        FragmentA.setOnClickListener(new View.OnClickListener());
            @Override
            public void onClick(View v) {

                loadFragment(new FragmentA());

            }
        });

         FragmentB.setOnClickListener(new View.OnClickListener());
            @Override
            public void onClick(View v){

                loadFragment(new FragmentB());

            }
        });
    }
    private void loadFragment(Fragment fragment) {

       Fragment fa = getSupportFragmentManage();
       FragmentTransaction fragmentTransaction = fa.beginTransaction();
       fragmentTransaction.replace(R.id.frameLayout,fragment);
       fragmentTransaction.comit();
        }
     }

        }