/**
 * File generated by Magnet rest2mobile 1.1 - Aug 14, 2015 10:47:06 AM
 * @see {@link http://developer.magnet.com}
 */

package io.c0nnector.github.paradise.api.model;


import org.parceler.Parcel;

import io.c0nnector.github.paradise.api.model.results.Startup;

/**
 * Generated from json example
{
  "id" : 2867034,
  "role" : "employee",
  "created_at" : "2015-08-09T19:58:17Z",
  "started_at" : null,
  "ended_at" : null,
  "title" : null,
  "confirmed" : true,
  "tagged" : {
    "type" : "User",
    "name" : "JoyCampbell",
    "id" : 1450871,
    "bio" : null,
    "follower_count" : 1,
    "angellist_url" : "https://angel.co/joy-campbell",
    "image" : "https://angel.co/images/shared/nopic.png"
  },
  "startup" : {
    "id" : 387370,
    "hidden" : false,
      ...

 */

@Parcel
public class Role {

  
  private Boolean confirmed;

  
  private String created_at;

  
  private String ended_at;

  
  private Integer id;

  
  private String role;

  
  private String started_at;

  
  private Startup startup;

  
  private Tagged tagged;

  
  private String title;

  public Boolean getConfirmed() {
    return confirmed;
  }
  public String getCreated_at() {
    return created_at;
  }
  public String getEnded_at() {
    return ended_at;
  }
  public Integer getId() {
    return id;
  }
  public String getRole() {
    return role;
  }
  public String getStarted_at() {
    return started_at;
  }
  public Startup getStartup() {
    return startup;
  }
  public Tagged getTagged() {
    return tagged;
  }
  public String getTitle() {
    return title;
  }

}
