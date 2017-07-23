package xyz.rishideep.amritadhwani;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView a17 = (ImageView) findViewById(R.id.a17);
        a17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, A17_.class);
                startActivity(in);
            }
        });
        Glide.with(this).load(R.drawable.a17).into(a17);

        ImageView a16 = (ImageView) findViewById(R.id.a16);
        a16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, A16_.class);
                startActivity(in);
            }
        });
        Glide.with(this).load(R.drawable.a16).into(a16);

        ImageView a15 = (ImageView) findViewById(R.id.a15);
        a15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, A15_.class);
                startActivity(in);
            }
        });
        Glide.with(this).load(R.drawable.a15).into(a15);

        ImageView a14 = (ImageView) findViewById(R.id.a14);
        a14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, A14_.class);
                startActivity(in);
            }
        });
        Glide.with(this).load(R.drawable.a14).into(a14);

        ImageView a13 = (ImageView) findViewById(R.id.a13);
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, A13_.class);
                startActivity(in);
            }
        });
        Glide.with(this).load(R.drawable.a13).into(a13);
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }
}
