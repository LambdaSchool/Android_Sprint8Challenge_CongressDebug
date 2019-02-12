
package com.lambdaschool.congressdataapiaccess;

import org.json.JSONObject;

import java.io.Serializable;

public class CongresspersonOverview implements Serializable {

    private String id;
    private String firstName;
    private String middleName;
    private String lastName;
    private String party;
    private String state;

    public CongresspersonOverview(String id, String firstName, String middleName, String lastName, String party, String state) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.party = party;
        this.state = state;
    }

    public CongresspersonOverview(JSONObject jsonObject) {
        this.id = CongressDao.getStringFromJson(jsonObject, "id");
        this.firstName = CongressDao.getStringFromJson(jsonObject, "first_name");
        this.middleName = CongressDao.getStringFromJson(jsonObject, "middle_name");
        this.lastName = CongressDao.getStringFromJson(jsonObject, "last_name");
        this.party = CongressDao.getStringFromJson(jsonObject, "party");
        this.state = CongressDao.getStringFromJson(jsonObject, "state");
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getParty() {
        return party;
    }

    public String getState() {
        return state;
    }

}
