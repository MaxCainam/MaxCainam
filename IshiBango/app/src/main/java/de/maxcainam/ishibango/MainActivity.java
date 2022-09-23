package de.maxcainam.ishibango;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView eingabeFeld;
    public TextView checkZahl;
    public TextView rand;
    public TextView info;
    public ImageView icon;
    public ImageView loose;
    public ImageView win;
    public Button button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12;
    public ImageView imageView1, imageView2, imageView3, imageView4, imageView5, imageView6, imageView7, imageView8, imageView9, imageView10, imageView11, imageView12;

    public String anzeige = "";
    public double zufallszahl = Math.round(Math.random() * 100);
    public int i = 9;
    private Button reset_btn;
    private Button new_btn;
    private Button exit_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eingabeFeld = (TextView)findViewById(R.id.eingabeFeld);
        checkZahl = (TextView)findViewById(R.id.checkZahl);
        rand = (TextView)findViewById(R.id.random);
        info = (TextView)findViewById(R.id.info);
        icon = (ImageView)findViewById(R.id.icon);
        reset_btn = findViewById(R.id.reset_btn);
        new_btn = findViewById(R.id.new_btn);
        exit_btn = findViewById(R.id.exit_btn);
        loose = (ImageView)findViewById(R.id.loose);
        win = (ImageView)findViewById(R.id.win);
        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        button4 = (Button)findViewById(R.id.button4);
        button5 = (Button)findViewById(R.id.button5);
        button6 = (Button)findViewById(R.id.button6);
        button7 = (Button)findViewById(R.id.button7);
        button8 = (Button)findViewById(R.id.button8);
        button9 = (Button)findViewById(R.id.button9);
        button10 = (Button)findViewById(R.id.button10);
        button11 = (Button)findViewById(R.id.button11);
        button12 = (Button)findViewById(R.id.button12);
        imageView1 = (ImageView)findViewById(R.id.imageView1);
        imageView2 = (ImageView)findViewById(R.id.imageView2);
        imageView3 = (ImageView)findViewById(R.id.imageView3);
        imageView4 = (ImageView)findViewById(R.id.imageView4);
        imageView5 = (ImageView)findViewById(R.id.imageView5);
        imageView6 = (ImageView)findViewById(R.id.imageView6);
        imageView7 = (ImageView)findViewById(R.id.imageView7);
        imageView8 = (ImageView)findViewById(R.id.imageView8);
        imageView9 = (ImageView)findViewById(R.id.imageView9);
        imageView10 = (ImageView)findViewById(R.id.imageView10);
        imageView11 = (ImageView)findViewById(R.id.imageView11);
        imageView12 = (ImageView)findViewById(R.id.imageView12);

        loose.setVisibility(View.INVISIBLE);

        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
        exit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        new_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                startActivity(getIntent());
            }
        });
    }


    public void zifferAction(View v) {
        Button knopf = (Button)v;
        info.setText("");
        if (anzeige == "") {

            anzeige = (String)knopf.getText();
            eingabeFeld.setText(anzeige);
        } else {
            anzeige = anzeige + knopf.getText();
            eingabeFeld.setText(anzeige);
        }
    }

    public void backAction(View v) {
        anzeige = anzeige.replaceFirst(".$", "");
        eingabeFeld.setText(anzeige);
    }

    public void playAction(View v) {
        if (anzeige == "") {
            icon.setImageResource(R.drawable.qm);
            info.setText("ERROR");
        } else {
            rand.setText(String.valueOf("trys left:" + i));
            int eingabe = Integer.parseInt(String.valueOf(eingabeFeld.getText()));
            checkZahl.setText(String.valueOf(eingabe));
            eingabeFeld.setText("");
            anzeige = "";
            i = i - 1;

            int zahl = Integer.parseInt(String.valueOf(checkZahl.getText()));

            if (zahl == zufallszahl) {
                icon.setImageResource(R.drawable.check);
                info.setText("Access granted");
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);
                button9.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);
                button11.setVisibility(View.INVISIBLE);
                button12.setVisibility(View.INVISIBLE);
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                imageView8.setVisibility(View.INVISIBLE);
                imageView9.setVisibility(View.INVISIBLE);
                imageView10.setVisibility(View.INVISIBLE);
                imageView11.setVisibility(View.INVISIBLE);
                imageView12.setVisibility(View.INVISIBLE);
                win.setVisibility(View.VISIBLE);
                exit_btn.setVisibility(View.VISIBLE);
                new_btn.setVisibility(View.VISIBLE);
            } else if (i < 0) {
                info.setText("access denied");
                button1.setVisibility(View.INVISIBLE);
                button2.setVisibility(View.INVISIBLE);
                button3.setVisibility(View.INVISIBLE);
                button4.setVisibility(View.INVISIBLE);
                button5.setVisibility(View.INVISIBLE);
                button6.setVisibility(View.INVISIBLE);
                button7.setVisibility(View.INVISIBLE);
                button8.setVisibility(View.INVISIBLE);
                button9.setVisibility(View.INVISIBLE);
                button10.setVisibility(View.INVISIBLE);
                button11.setVisibility(View.INVISIBLE);
                button12.setVisibility(View.INVISIBLE);
                imageView1.setVisibility(View.INVISIBLE);
                imageView2.setVisibility(View.INVISIBLE);
                imageView3.setVisibility(View.INVISIBLE);
                imageView4.setVisibility(View.INVISIBLE);
                imageView5.setVisibility(View.INVISIBLE);
                imageView6.setVisibility(View.INVISIBLE);
                imageView7.setVisibility(View.INVISIBLE);
                imageView8.setVisibility(View.INVISIBLE);
                imageView9.setVisibility(View.INVISIBLE);
                imageView10.setVisibility(View.INVISIBLE);
                imageView11.setVisibility(View.INVISIBLE);
                imageView12.setVisibility(View.INVISIBLE);
                loose.setVisibility(View.VISIBLE);
                exit_btn.setVisibility(View.VISIBLE);
                new_btn.setVisibility(View.VISIBLE);

            } else if ((zahl > 100) || (zahl < 0)) {
                icon.setImageResource(R.drawable.qm);
                info.setText("ERROR");
            } else if (zahl < zufallszahl) {
                icon.setImageResource(R.drawable.up);
            } else if (zahl > zufallszahl) {
                icon.setImageResource(R.drawable.down);
            }

        }
    }
}