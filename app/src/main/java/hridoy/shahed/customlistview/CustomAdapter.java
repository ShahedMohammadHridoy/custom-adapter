package hridoy.shahed.customlistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends BaseAdapter {

    Activity activity;
    LayoutInflater inflater;
    List<Country> countries;

    public CustomAdapter(Activity activity, List<Country> countries) {
        this.activity = activity;
        this.countries = countries;
    }

    @Override
    public int getCount() {
        return countries.size();
    }

    @Override
    public Object getItem(int position) {
        return countries.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (inflater == null) {
            inflater = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        }

        if (convertView==null){

            assert inflater != null;
            convertView = inflater.inflate(R.layout.item_view,null);

        }


        TextView showCountryName = convertView.findViewById(R.id.show_country_name);

        showCountryName.setText(String.valueOf(countries.get(position).county_name));

        return convertView;
    }
}
