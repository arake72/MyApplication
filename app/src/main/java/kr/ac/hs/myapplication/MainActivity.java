package kr.ac.hs.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void OK(View v){
        Toast.makeText(getApplicationContext(),"버튼을 눌렀어요",Toast.LENGTH_LONG).show();
    }
}
