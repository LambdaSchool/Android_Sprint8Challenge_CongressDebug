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
        StringBuilder nameBuilder = new StringBuilder();
        nameBuilder.append(firstName);

        //TODO - Middle name not given necessary space.
        //Changed: if statement to give proper spacing;
        if (middleName.equals("null")) {
            nameBuilder.append(" ").append(lastName);
        } else {
            nameBuilder.append(" ").append(middleName).append(" ").append(lastName);
        }

        //TODO - Display Name is being sent lowercased.
        //Changed: return nameBuilder.toString().toLowerCase();
        return nameBuilder.toString();
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
