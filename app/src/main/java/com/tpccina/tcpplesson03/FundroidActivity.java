package com.tpccina.tcpplesson03;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Random;

public class FundroidActivity extends AppCompatActivity {
    private static final String LOG_TAG = FundroidActivity.class.getSimpleName();
    private LinearLayout funbgcolor;
    private ImageView logo;
    private TextView feature;
    private ImageButton button;
//    private FundroidList fundroids;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fundroid);

        funbgcolor = (LinearLayout) findViewById(R.id.activity_fundroid);
        logo = (ImageView) findViewById(R.id.fundroid_logo);
        feature = (TextView) findViewById(R.id.fundroid_feature);
        //button = (ImageButton) findViewById(R.id.fundroid_button);

        FundroidList fundroids = new FundroidList();
        //final ArrayList<Fundroid> fundroidList = fundroids.createFundroids();
        final ArrayList<Fundroid> fundroidList = fundroids.getFundroids();
        //Log.i(LOG_TAG, "funcolor yang terpilih adalah " + randomColor);
        //Toast.makeText(this, "funcolor yang terpilih adalah " + randomColor, Toast.LENGTH_SHORT).show();
        //Log.i(LOG_TAG, "fundroids adalah " + fundroids);
        /*for (int i=0 ; i<fundroidList.size(); i++) {
            Log.i(LOG_TAG, "list fundroids adalah " + fundroidList.get(i).getDroidId());
            i++;
        }
        Log.i(LOG_TAG, "Ukuran fundroids adalah " + fundroidList.size());*/

        /*final int[] droidId = {   R.drawable.cupcake,
                            R.drawable.donut,
                            R.drawable.eclair,
                            R.drawable.froyo,
                            R.drawable.jellybean,
                            R.drawable.gingerbread };
        final String[] featureText = {"Cupcake", "Donut", "Eclair",
                "Froyo", "Jellybean", "Gingerbread"};*/

        /*final int[] bgColorId = {0xdd1122, Color.GREEN, Color.RED,
                            Color.CYAN, Color.BLUE, Color.YELLOW};*/

        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random randomGenerator = new Random();
                //int randomNumber = randomGenerator.nextInt(droidId.length);
                int randomNumber = randomGenerator.nextInt(fundroidList.size());
                //Toast.makeText(FundroidActivity.this, "random number: " + randomNumber, Toast.LENGTH_SHORT).show();
                //logo.setImageResource(droidId[randomNumber]);
                logo.setImageResource(fundroidList.get(randomNumber).getDroidId());
                //feature.setText(featureText[randomNumber]);
                feature.setText(fundroidList.get(randomNumber).getFeatureText());

                /*int randomNumber2 = randomGenerator.nextInt(bgColorId.length);
                funbgcolor.setBackgroundColor(bgColorId[randomNumber2]);*/
                FuncolorRandomizer funcolorRandomizer = new FuncolorRandomizer();
                int randomColor = funcolorRandomizer.getFuncolorId();
                //Log.i(LOG_TAG, "funcolor yang terpilih adalah " + randomColor);
                funbgcolor.setBackgroundColor(randomColor);
            }
        });
    }
}
