package com.jonmid.segundoparcial.Parser;

import com.jonmid.segundoparcial.Models.TeamModelAnguloChristian;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CHRISTIAN on 17/10/2017.
 */

public class TeamJsonAnguloChristian {

    public static List<TeamModelAnguloChristian> getData(String content) throws JSONException {
        JSONObject item =  new JSONObject(content);
        JSONArray jsonArray = item.getJSONArray("teams");

        List<TeamModelAnguloChristian> lista = new ArrayList<>();
        for (int i = 0; i < jsonArray.length(); i++) {
            TeamModelAnguloChristian teamJsonAnguloChristian = new TeamModelAnguloChristian();
            JSONObject item2 = jsonArray.getJSONObject(i);



            teamJsonAnguloChristian.setNombre_equipo(item2.getString("name"));
            teamJsonAnguloChristian.setCodigo_equipo(item2.getString("code"));



            lista.add(teamJsonAnguloChristian);
        }
        return lista;
    }
}
