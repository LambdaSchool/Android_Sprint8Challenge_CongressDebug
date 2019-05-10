package com.lambdaschool.congressdata;

import com.lambdaschool.congressdataapiaccess.CongresspersonOverview;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class OfficialOverviewTest {

    private OfficialOverview officialOverview2;
    //private OfficialOverview officialOverview1;

    @Before
    public void initialize() {

/*        CongresspersonOverview congresspersonOverview;
        try {
            congresspersonOverview = new CongresspersonOverview(new JSONObject("{  \n" +
                    "      \"id\":\"H001056\",\n" +
                    "      \"title\":\"Representative\",\n" +
                    "      \"short_title\":\"Rep.\",\n" +
                    "      \"api_uri\":\"https:\\/\\/api.propublica.org\\/congress\\/v1\\/members\\/H001056.json\",\n" +
                    "      \"first_name\":\"Jaime\",\n" +
                    "      \"middle_name\":null,\n" +
                    "      \"last_name\":\"Herrera Beutler\",\n" +
                    "      \"suffix\":null,\n" +
                    "      \"date_of_birth\":\"1978-11-03\",\n" +
                    "      \"gender\":\"F\",\n" +
                    "      \"party\":\"R\",\n" +
                    "      \"leadership_role\":null,\n" +
                    "      \"twitter_account\":\"HerreraBeutler\",\n" +
                    "      \"facebook_account\":\"herrerabeutler\",\n" +
                    "      \"youtube_account\":\"RepHerreraBeutler\",\n" +
                    "      \"govtrack_id\":\"412486\",\n" +
                    "      \"cspan_id\":\"95198\",\n" +
                    "      \"votesmart_id\":\"101907\",\n" +
                    "      \"icpsr_id\":\"21187\",\n" +
                    "      \"crp_id\":\"N00031559\",\n" +
                    "      \"google_entity_id\":\"\\/m\\/0cz8yx2\",\n" +
                    "      \"fec_candidate_id\":\"H0WA03187\",\n" +
                    "      \"url\":\"https:\\/\\/herrerabeutler.house.gov\",\n" +
                    "      \"rss_url\":\"https:\\/\\/herrerabeutler.house.gov\\/news\\/rss.aspx\",\n" +
                    "      \"contact_form\":null,\n" +
                    "      \"in_office\":false,\n" +
                    "      \"dw_nominate\":0.38,\n" +
                    "      \"ideal_point\":null,\n" +
                    "      \"seniority\":\"6\",\n" +
                    "      \"next_election\":\"2016\",\n" +
                    "      \"total_votes\":1325,\n" +
                    "      \"missed_votes\":299,\n" +
                    "      \"total_present\":0,\n" +
                    "      \"last_updated\":\"2019-04-08 10:52:51 -0400\",\n" +
                    "      \"ocd_id\":\"ocd-division\\/country:us\\/state:wa\\/cd:3\",\n" +
                    "      \"office\":null,\n" +
                    "      \"phone\":null,\n" +
                    "      \"fax\":null,\n" +
                    "      \"state\":\"WA\",\n" +
                    "      \"district\":\"3\",\n" +
                    "      \"at_large\":false,\n" +
                    "      \"geoid\":\"5303\",\n" +
                    "      \"missed_votes_pct\":22.57,\n" +
                    "      \"votes_with_party_pct\":90.22\n" +
                    "   }"));


            officialOverview1 =new OfficialOverview(congresspersonOverview);

        } catch (JSONException e) {
            e.printStackTrace();
        }*/


        officialOverview2 = new OfficialOverview("Jaime", "Herrera", "Beutler", "R", "WA", "H001056");

    }

    @Test
    public void checkDisplayName() {
        assertEquals("Jaime Herrera Beutler", officialOverview2.getDisplayName());
    }

    @Test
    public void checkId() {
        assertEquals("H001056", officialOverview2.getId());
    }

    @Test
    public void checkParty() {
        assertEquals("R", officialOverview2.getParty());
    }

    @Test
    public void checkState() {
        assertEquals("WA", officialOverview2.getState());
    }

}