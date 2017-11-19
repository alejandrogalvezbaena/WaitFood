package com.example.galvezagb50.waitfood.adapter;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;

import com.example.galvezagb50.waitfood.R;
import com.example.galvezagb50.waitfood.pojo.Product;
import com.example.galvezagb50.waitfood.repository.DependencyRepository;


import java.util.HashMap;
import java.util.List;

/**
 * Created by galvezagb50
 */

public class DependencyAdapter extends BaseExpandableListAdapter {

    private Context context;
    private List<String> listDependencies;
    private HashMap<String ,List<Product>> listProducts;

    public DependencyAdapter(Context context) {
        this.context = context;
        this.listDependencies = DependencyRepository.getInstance().getDependencies();
        this.listProducts = DependencyRepository.getInstance().getProducts();
    }

    @Override
    public int getGroupCount() {
        return listDependencies.size();
    }

    @Override
    public int getChildrenCount(int i) {
        return listProducts.get(listDependencies.get(i)).size();
    }

    @Override
    public Object getGroup(int i) {
        return listDependencies.get(i);
    }

    @Override
    public Object getChild(int i, int i1) {
        return listProducts.get(listDependencies.get(i)).get(i1);
    }

    @Override
    public long getGroupId(int i) {
        return i;
    }

    @Override
    public long getChildId(int i, int i1) {
        return i1;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int i, boolean b, View view, ViewGroup viewGroup) {
        String headerTitle = (String)getGroup(i);
        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_dependency,null);
        }
        TextView lblListHeader = (TextView)view.findViewById(R.id.txv_name);
        lblListHeader.setTypeface(null, Typeface.BOLD);
        lblListHeader.setText(headerTitle);
        return view;
    }

    @Override
    public View getChildView(int i, int i1, boolean b, View view, ViewGroup viewGroup) {
        final String childText = (String)getChild(i,i1).toString();
        if(view == null)
        {
            LayoutInflater inflater = (LayoutInflater)this.context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item_product,null);
        }

        TextView txtListChild = (TextView)view.findViewById(R.id.txv_name);
        txtListChild.setText(childText);
        return view;
    }

    @Override
    public boolean isChildSelectable(int i, int i1) {
        return true;
    }
}
