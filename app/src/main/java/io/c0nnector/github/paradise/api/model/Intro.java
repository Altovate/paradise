/**
 * File generated by Magnet rest2mobile 1.1 - Jul 31, 2015 3:08:28 PM
 * @see {@link http://developer.magnet.com}
 */

package io.c0nnector.github.paradise.api.model;


import android.os.Parcel;
import android.os.Parcelable;

/**
 * Generated from json example
{
  "can" : false,
  "has" : false
}

 */

public class Intro implements Parcelable {

  
  private Boolean can;

  
  private Boolean has;

  public Boolean getCan() {
    return can;
  }
  public Boolean getHas() {
    return has;
  }


  public void setCan(Boolean can) {

    this.can = can;
  }

  public void setHas(Boolean has) {

    this.has = has;
  }

  @Override
  public int describeContents() {

    return 0;
  }

  @Override
  public void writeToParcel(Parcel dest, int flags) {

    dest.writeValue(this.can);
    dest.writeValue(this.has);
  }

  public Intro() {

  }

  protected Intro(Parcel in) {

    this.can = (Boolean) in.readValue(Boolean.class.getClassLoader());
    this.has = (Boolean) in.readValue(Boolean.class.getClassLoader());
  }

  public static final Parcelable.Creator<Intro> CREATOR = new Parcelable.Creator<Intro>() {

    public Intro createFromParcel(Parcel source) {

      return new Intro(source);
    }

    public Intro[] newArray(int size) {

      return new Intro[size];
    }
  };
}
