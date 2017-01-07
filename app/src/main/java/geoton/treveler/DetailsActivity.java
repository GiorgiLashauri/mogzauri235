package geoton.treveler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import geoton.treveler.models.CharacterT;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        CharacterT monuments = (CharacterT) getIntent().getExtras().getSerializable("CharacterT");

        TextView nameView = (TextView) findViewById(R.id.name);
        TextView descriptionView = (TextView) findViewById(R.id.description);
        ImageView imageView = (ImageView) findViewById(R.id.image);

        nameView.setText(monuments.getName());
        descriptionView.setText(monuments.getDescription());


        Picasso.with(this)
                .load(monuments.getImage())
                .resize(1200,1000)
                .centerCrop()
                .into(imageView);

    }

}
