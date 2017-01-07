package geoton.treveler;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

import geoton.treveler.adapter.CastumMonomentsAdapter;
import geoton.treveler.imfoFile.MonumentAndDescription;
import geoton.treveler.models.CharacterT;

public class CategoriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        ArrayList<CharacterT> listViewDat = getMonumentData();
        CastumMonomentsAdapter adapter = new CastumMonomentsAdapter(this, listViewDat);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);





        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent= new Intent(getApplicationContext(), DetailsActivity.class);
                intent.putExtra("CharacterT",(CharacterT)parent.getAdapter().getItem(position));
                startActivity(intent);

            }
        });




    }

    private ArrayList<CharacterT> getMonumentData() {
        ArrayList<CharacterT> list = new ArrayList<>();

        for (int j = 0; j < 8; j++) {
            for (int i = 0; i < MonumentAndDescription.names.length; i++) {
                CharacterT monument = new CharacterT
                        (MonumentAndDescription.names[i],
                                MonumentAndDescription.descriptions[i],
                                MonumentAndDescription.images[i] ,
                                MonumentAndDescription.location[i]);
                list.add(monument);
            }
        }
        return list;


    }
}
