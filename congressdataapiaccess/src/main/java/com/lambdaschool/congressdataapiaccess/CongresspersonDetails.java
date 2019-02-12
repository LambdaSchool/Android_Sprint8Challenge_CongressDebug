
package com.lambdaschool.congressdataapiaccess;

import org.json.JSONObject;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CongresspersonDetails implements Serializable {

    private String memberId;
    private String firstName;
    private String middleName;
    private String lastName;
    private String twitterAccount;
    private String facebookAccount;
    private String currentParty;
    private List<Role> roles = null;

    public CongresspersonDetails(String memberId, String firstName, String middleName, String lastName, String twitterAccount, String facebookAccount, String currentParty, List<Role> roles) {
        this.memberId = memberId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.twitterAccount = twitterAccount;
        this.facebookAccount = facebookAccount;
        this.currentParty = currentParty;
        this.roles = roles;
    }

    public CongresspersonDetails() {
        this.memberId = "member_id";
        this.firstName = "first_name";
        this.middleName = "middle_name";
        this.lastName = "last_name";
        this.twitterAccount = "twitter_account";
        this.facebookAccount = "facebook_account";
        this.currentParty = "current_party";
        this.roles = new ArrayList<Role>();
    }

    public CongresspersonDetails(JSONObject jsonObject) {
        this.memberId = CongressDao.getStringFromJson(jsonObject,"member_id");
        this.firstName = CongressDao.getStringFromJson(jsonObject,"first_name");
        this.middleName = CongressDao.getStringFromJson(jsonObject,"middle_name");
        this.lastName = CongressDao.getStringFromJson(jsonObject,"last_name");
        this.twitterAccount = CongressDao.getStringFromJson(jsonObject,"twitter_account");
        this.facebookAccount = CongressDao.getStringFromJson(jsonObject,"facebook_account");
        this.currentParty = CongressDao.getStringFromJson(jsonObject,"current_party");
        this.roles = Role.getRolesFromJSON(CongressDao.getJSONArrayFromJson(jsonObject, "roles"));
    }

    public String getMemberId() {
        return memberId;
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

    public String getTwitterAccount() {
        return twitterAccount;
    }

    public String getFacebookAccount() {
        return facebookAccount;
    }

    public String getCurrentParty() {
        return currentParty;
    }

    public List<Role> getRoles() {
        return roles;
    }
}
