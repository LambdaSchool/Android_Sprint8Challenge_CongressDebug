
package com.lambdaschool.congressdataapiaccess;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

public class Subcommittee {

    private String name;

    private Subcommittee(JSONObject jsonObject) {
        this.name = CongressDao.getStringFromJson(jsonObject, "name");
    }

    static ArrayList<Subcommittee> getSubCommitteesFromJSON(JSONArray jsonArray) {
        ArrayList<Subcommittee> subcommittees = new ArrayList<Subcommittee>();
        for(int i = 0; i < jsonArray.length(); ++i) {
            try {
                subcommittees.add(new Subcommittee(jsonArray.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return subcommittees;
    }

    public String getName() {
        return name;
    }
}
