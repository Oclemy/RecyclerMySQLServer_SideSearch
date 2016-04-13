package com.tutorials.hp.recyclermysqlserver_sidesearch.Recycler;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.tutorials.hp.recyclermysqlserver_sidesearch.R;

/**
 * Created by Oclemmy on 4/2/2016 for ProgrammingWizards Channel.
 */
public class MyHolder  extends RecyclerView.ViewHolder {

    TextView nameTxt;

    public MyHolder(View itemView) {
        super(itemView);

        nameTxt= (TextView) itemView.findViewById(R.id.nameTxt);
    }
}
