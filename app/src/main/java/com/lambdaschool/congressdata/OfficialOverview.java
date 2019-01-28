package com.lambdaschool.congressdata;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

public class OfficialOverview {
    private String firstName, middleName, lastName;
    private String party, state;
    private String displayName;
    private String id;

    public OfficialOverview(String firstName, String middleName, String lastName, String party, String state, String id) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.party = party;
        this.state = state;
        this.displayName = buildDisplayName();
        this.id = id;
    }

    public OfficialOverview(CongresspersonOverview congresspersonOverview) {
        this.firstName = congresspersonOverview.getFirstName();
        this.middleName = congresspersonOverview.getMiddleName();
        this.lastName = congresspersonOverview.getLastName();
        this.party = congresspersonOverview.getParty();
        this.state = congresspersonOverview.getState();
        this.displayName = buildDisplayName();
        this.id = congresspersonOverview.getId();
    }

    private String buildDisplayName() {
        String displayName;
        if (middleName.equals("null")) {
            displayName = firstName + " " + lastName;
        } else {
            displayName = firstName + " " + middleName + " "  + lastName;
        }
        return displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getId() {
        return id;
    }

    public String getParty() {
        return party;
    }

    public String getState() {
        return state;
    }
}
