/**
 * File generated by Magnet rest2mobile 1.1 - Jul 31, 2015 3:08:28 PM
 *
 * @see {@link http://developer.magnet.com}
 */

package io.c0nnector.github.paradise.api.model.results;

import org.parceler.Parcel;

import java.util.List;

import io.c0nnector.github.paradise.api.model.Abilities;
import io.c0nnector.github.paradise.api.model.CompanyType;
import io.c0nnector.github.paradise.api.model.Location;
import io.c0nnector.github.paradise.api.model.Market;
import io.c0nnector.github.paradise.api.model.Screenshot;
import io.c0nnector.github.paradise.api.model.Status;
import io.c0nnector.github.paradise.api.model.Tagged;
import io.c0nnector.github.paradise.util.Strings;

/**
 * Generated from json example
 {
 "id" : 74139,
 "hidden" : false,
 "community_profile" : false,
 "name" : "SeatGeek",
 "angellist_url" : "https://angel.co/seatgeek",
 "logo_url" : "https://d1qb2nb5cznatu.cloudfront.net/startups/i/74139-75f197c37c953a29a5634c66c8c72545-medium_jpg.jpg?buster=1360947378",
 "thumb_url" : "https://d1qb2nb5cznatu.cloudfront.net/startups/i/74139-75f197c37c953a29a5634c66c8c72545-thumb_jpg.jpg?buster=1360947378",
 "quality" : 9,
 "product_desc" : "SeatGeekisaticketsearchengine.Wehelpusersfindgames&showsthey'llloveandcompareticketinventoryfromhundredsofsitesatonce.",
 "high_concept" : "Kayakforliveeventtickets",
 "follower_count" : 595,
 "company_url" : "http://seatgeek.com",
 "created_at" : "2012-03-05T16:16:08Z",
 "updated_at" : "2015-05-23T16:41:20Z",
 "crunchbase_url" : "http://www.crunchbase.com/organization/seatgeek",
 "twitter_url" : "http://twitter.com/seatgeek",
 "blog_url" : "http://chairnerd.seatgeek.com",
 "facebook_url" : "https://www.facebook.com/SeatGeek",
 "linkedin_url" : "http://www.linkedin.com/company/seatgeek",
 ...

 */

@Parcel
public class Startup {

    /**
     * Adds specific wording when the size is empty
     * @return
     */
    public String getCompanySizeFormatted(){

       if (Strings.isNotBlank(company_size)) {
           return company_size + " employees";
       }

        return "";
    }


    public String getFollowerCountFormatted(){

        if (follower_count !=null && follower_count > 0) {
            return getFollower_count() + " followers";
        }

        else return  "no followers yet";
    }

    public String getFirtLocationName(){

        if (locations !=null && locations.size() > 0) {

            return locations.get(0).getDisplay_name();
        }

        return "";
    }


    /**
     * Converts a tagged object into an incomplete startup object
     * @param tagged
     * @return
     */
    public static Startup convertFromTagged(Tagged tagged){

        return new Startup()
                .setHigh_concept(tagged.getHigh_concept())
                .setId(tagged.getId())
                .setLogo_url(tagged.getLogo_url())
                .setName(tagged.getName())
                .setThumb_url(tagged.getThumb_url())
                .setFollower_count(0);
    }


    private Abilities abilities;


    private String angellist_url;


    private String blog_url;


    private Boolean community_profile;


    private String company_size;


    private List<CompanyType> company_type;


    private String company_url;


    private String created_at;


    private String crunchbase_url;


    private String facebook_url;


    private Integer follower_count;


    private Boolean hidden;


    private String high_concept;


    private Integer id;


    private String launch_date;


    private String linkedin_url;


    private List<Location> locations;


    private String logo_url;


    private List<Market> markets;


    private String name;


    private String product_desc;


    private Integer quality;


    private List<Screenshot> screenshots;


    private Status status;


    private String thumb_url;


    private String twitter_url;


    private String updated_at;


    private String video_url;

    public Abilities getAbilities() {

        return abilities;
    }

    public String getAngellist_url() {

        return angellist_url;
    }

    public String getBlog_url() {

        return blog_url;
    }

    public Boolean getCommunity_profile() {

        return community_profile;
    }

    public String getCompany_size() {

        return company_size;
    }


    public List<CompanyType> getCompany_type() {

        return company_type;
    }

    public String getCompany_url() {

        return company_url;
    }

    public String getCreated_at() {

        return created_at;
    }

    public String getCrunchbase_url() {

        return crunchbase_url;
    }

    public String getFacebook_url() {

        return facebook_url;
    }

    public Integer getFollower_count() {

        return follower_count;
    }

    public Boolean getHidden() {

        return hidden;
    }

    public String getHigh_concept() {

        return high_concept;
    }

    public Integer getId() {

        return id;
    }

    public String getLaunch_date() {

        return launch_date;
    }

    public String getLinkedin_url() {

        return linkedin_url;
    }

    public List<Location> getLocations() {

        return locations;
    }




    public String getLogo_url() {

        return logo_url;
    }

    public List<Market> getMarkets() {

        return markets;
    }

    public String getName() {

        return name;
    }

    public String getProduct_desc() {

        return product_desc;
    }

    public Integer getQuality() {

        return quality;
    }

    public List<Screenshot> getScreenshots() {

        return screenshots;
    }

    public Status getStatus() {

        return status;
    }

    public String getThumb_url() {

        return thumb_url;
    }

    public String getTwitter_url() {

        return twitter_url;
    }

    public String getUpdated_at() {

        return updated_at;
    }

    public String getVideo_url() {

        return video_url;
    }


    public Startup setId(Integer id) {
        this.id = id;
        return this;
    }

    public Startup setName(String name) {
        this.name = name;
        return this;
    }

    public Startup setLogo_url(String logo_url) {
        this.logo_url = logo_url;

        return this;
    }

    public Startup setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
        return this;
    }

    public Startup setProduct_desc(String product_desc) {
        this.product_desc = product_desc;
        return this;
    }

    public Startup setHigh_concept(String high_concept) {
        this.high_concept = high_concept;
        return this;
    }

    public Startup setFollower_count(Integer follower_count) {
        this.follower_count = follower_count;

        return this;
    }

}