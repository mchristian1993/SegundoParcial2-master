package com.jonmid.segundoparcial.Adapters;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.jonmid.segundoparcial.Array.Images;
import com.jonmid.segundoparcial.Models.TeamModelAnguloChristian;
import com.jonmid.segundoparcial.R;
import com.jonmid.segundoparcial.TeamActivity;
import com.jonmid.segundoparcial.Views.DetailActivity;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 17/10/2017.
 */

public class TeamAdapterAnguloChristian extends RecyclerView.Adapter<TeamAdapterAnguloChristian.ViewHolder> {

    List<TeamModelAnguloChristian> teamModelAnguloChristien = new ArrayList<>();
    Context context;


    public TeamAdapterAnguloChristian(List<TeamModelAnguloChristian> teamModelAnguloChristien, Context context) {
        this.teamModelAnguloChristien = teamModelAnguloChristien;
        this.context = context;
    }

    @Override


    public TeamAdapterAnguloChristian.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_team, parent, false);

        // Pasar la vista (item.xml) al ViewHolder
        ViewHolder viewHolder = new ViewHolder(item);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(TeamAdapterAnguloChristian.ViewHolder holder, int position) {
   String A;
        holder.nombre.setText(teamModelAnguloChristien.get(position).getNombre_equipo());
        holder.codigo.setText(teamModelAnguloChristien.get(position).getCodigo_equipo());

        Picasso.with(context).load(Images.imageRandom()).into(holder.url);
    }

    @Override
    public int getItemCount() {
        return teamModelAnguloChristien.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        ImageView url;

        TextView nombre;
        TextView codigo;


        public ViewHolder(View item) {
            super(item);
            item.setOnClickListener(this);
            url = (ImageView) item.findViewById(R.id.id_img_team);

            nombre = (TextView) item.findViewById(R.id.id_tv_name_team);

            codigo = (TextView) item.findViewById(R.id.id_tv_cod_team);
        }

        public void onClick(View view) {
            Context contextItem = view.getContext();
            Intent intent = new Intent(context, DetailActivity.class);
            intent.putExtra("name", teamModelAnguloChristien.get(getLayoutPosition()).getNombre_equipo());
            intent.putExtra("code", teamModelAnguloChristien.get(getLayoutPosition()).getCodigo_equipo());
            contextItem.startActivity(intent);


            //String valor = Integer.toString(albumModelList.get(getLayoutPosition()).getId());
            //Toast.makeText(contextItem, valor, Toast.LENGTH_SHORT).show();
        }
    }
}
