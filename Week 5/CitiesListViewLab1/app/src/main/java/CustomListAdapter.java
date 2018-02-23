/**
 * Created by joanc on 2/22/2018.
 */

package com.example.joanc.CitiesListViewLab1;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.joanc.CitiesListViewlab1.MainActivity;
public class CustomListAdapot extends ArrayAdapter<String> {
    private final Activity Context;
    private final String[] ListItemsName;
    private final Integer[] ImageName;
    public CustomListAdapot(Activity context, String[] content,
                            Integer[] ImageName) {
        super(context, R.layout.mycities, content);
        this.Context = context;
        this.ListItemsName = content;
        this.ImageName = ImageName;
    }
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = Context.getLayoutInflater();
        View ListViewSingle = inflater.inflate(R.layout.mycities, null, true);
        TextView ListViewItems = (TextView)
                ListViewSingle.findViewById(R.id.cityname);
        ImageView ListViewImage = (ImageView)
                ListViewSingle.findViewById(R.id.cityicon);
        ListViewItems.setText(ListItemsName[position]);
        ListViewImage.setImageResource(ImageName[position]);

        return ListViewSingle;
    };
}