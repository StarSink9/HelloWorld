package com.example.helloworld;

        import android.os.Bundle;
        import android.util.Log;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.RadioGroup;
        import android.widget.TextView;

        import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout3);

//                final EditText name=findViewById(R.id.editText1);
//                final EditText passWord=findViewById(R.id.editText2);
        final EditText name=findViewById(R.id.editTextTextPersonName);
        final EditText passWord=findViewById(R.id.editTextTextPassword);
        Button button7=findViewById(R.id.button7);
//                Button button1=findViewById(R.id.button1);
//
//                button1.setOnClickListener(new View.OnClickListener(){
//                    @Override
//                    public void onClick(View v) {
//                        Log.i("wangxiaojian","账号:" +name.getText());
//                        Log.i("wangxiaojian","密码:" +passWord.getText());
//                    }
//                });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String account=name.getText().toString();
                String password=passWord.getText().toString();
                Log.i("wangxiaojian","账号:" +account);
                Log.i("wangxiaojian","密码:" +password);
            }
        });
    }
}