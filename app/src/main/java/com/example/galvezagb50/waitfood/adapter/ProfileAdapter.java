package com.example.galvezagb50.waitfood.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.example.galvezagb50.waitfood.R;
import com.example.galvezagb50.waitfood.pojo.Feature;
import com.example.galvezagb50.waitfood.repository.ProfileRepository;


/**
 * Created by galvezagb50
 */

public class ProfileAdapter extends ArrayAdapter<Feature> {

    public ProfileAdapter(@NonNull Context context) {
        super(context, R.layout.item_profile, ProfileRepository.getInstance().getFeatures());

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        ProfileAdapter.ProfileHolder profileHolder;
        View view = convertView;

        if (view == null){

            LayoutInflater inflater = (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view= inflater.inflate(R.layout.item_profile,null);
            profileHolder = new ProfileAdapter.ProfileHolder();
            profileHolder.txv_featureName = (TextView)view.findViewById(R.id.txv_featureName);
            profileHolder.txv_feature = (TextView)view.findViewById(R.id.txv_feature);
            view.setTag(profileHolder);
        }else {
            profileHolder = (ProfileAdapter.ProfileHolder) view.getTag();
        }

        profileHolder.txv_featureName.setText(getItem(position).getNameFeature());
        profileHolder.txv_feature.setText(getItem(position).getFeature());

        return view;
    }

    class ProfileHolder {
        TextView txv_feature;
        TextView txv_featureName;
    }
}
