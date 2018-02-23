package com.example.joanc.citieslistviewlab;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ListAdapter;
        import android.widget.ListView;
        import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    String ListItemsName[] = new String[]{ "Bangalore", "Beijing",
            "Chicago"};
    Integer ImageName[] = { R.drawable.bangalore, R.drawable.beijing,
            R.drawable.chicago};
    ListView listView;
    ListAdapter listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView)findViewById(R.id.citylist);
        listAdapter = new CustomListAdapot(MainActivity.this,
                ListItemsName, ImageName);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(getApplicationContext(),
                        ListItemsName[position],
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}
