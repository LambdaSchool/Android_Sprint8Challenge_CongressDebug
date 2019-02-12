
package com.lambdaschool.congressdataapiaccess;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Role {

    private String congress;
    private String state;
    private String district;
    private String office;
    private String phone;
    private double missedVotesPct;
    private double votesWithPartyPct;
    private List<Committee> committees = null;
    private List<Subcommittee> subcommittees = null;

    public Role(String congress, String state, String district, String office, String phone, double missedVotesPct, double votesWithPartyPct, List<Committee> committees, List<Subcommittee> subcommittees) {
        this.congress = congress;
        this.state = state;
        this.district = district;
        this.office = office;
        this.phone = phone;
        this.missedVotesPct = missedVotesPct;
        this.votesWithPartyPct = votesWithPartyPct;
        this.committees = committees;
        this.subcommittees = subcommittees;
    }

    public Role(JSONObject jsonObject) {
        this.congress = CongressDao.getStringFromJson(jsonObject, "congress");
        this.state = CongressDao.getStringFromJson(jsonObject, "state");
        this.district = CongressDao.getStringFromJson(jsonObject, "district");
        this.office = CongressDao.getStringFromJson(jsonObject, "office");
        this.phone = CongressDao.getStringFromJson(jsonObject, "phone");
        this.missedVotesPct = CongressDao.getDoubleFromJson(jsonObject, "missed_votes_pct");
        this.votesWithPartyPct = CongressDao.getDoubleFromJson(jsonObject, "votes_with_party_pct");
        this.committees = Committee.getCommitteesFromJSON(CongressDao.getJSONArrayFromJson(jsonObject, "committees"));
        this.subcommittees = Subcommittee.getSubCommitteesFromJSON(CongressDao.getJSONArrayFromJson(jsonObject, "subcommittees"));
    }

    static ArrayList<Role> getRolesFromJSON(JSONArray jsonArray) {
        ArrayList<Role> roles = new ArrayList<Role>();
        for(int i = 0; i < jsonArray.length(); ++i) {
            try {
                roles.add(new Role(jsonArray.getJSONObject(i)));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return roles;
    }

    public String getCongress() {
        return congress;
    }

    public String getState() {
        return state;
    }

    public String getDistrict() {
        return district;
    }

    public String getOffice() {
        return office;
    }

    public String getPhone() {
        return phone;
    }

    public double getMissedVotesPct() {
        return missedVotesPct;
    }

    public double getVotesWithPartyPct() {
        return votesWithPartyPct;
    }

    public List<Committee> getCommittees() {
        return committees;
    }

    public List<Subcommittee> getSubcommittees() {
        return subcommittees;
    }
}
