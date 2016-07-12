package br.edu.ifpb.minhaappnogit;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirBrowser(View view) {

        EditText urlEditText = (EditText) findViewById(R.id.urlEditText);
        Uri uri = Uri.parse(urlEditText.getText().toString());
        Intent intent = new Intent(Intent.ACTION_VIEW, uri);

        startActivity(intent);
    }
}
