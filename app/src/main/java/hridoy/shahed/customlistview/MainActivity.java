package hridoy.shahed.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    ListView listView;

    CustomAdapter adapter;

    List<Country> countries;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        textView = findViewById(R.id.text_view);
        listView = findViewById(R.id.list_view);

        countries = new ArrayList<>();

        countries.add(new Country("Bangladesh"));
        countries.add(new Country("India"));
        countries.add(new Country("Pakistan"));
        countries.add(new Country("Nepal"));
        countries.add(new Country("Malaysia"));

        adapter = new CustomAdapter(this, countries);

        listView.setAdapter(adapter);


    }
}
