package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class Region implements Parcelable {

  @SerializedName("name")
  @Expose
  private String mName;

  @SerializedName("label_location")
  @Expose
  private LabelLocation mLabelLocation;

  public String getName() {
    return mName;
  }

  public void setName(String name) {
    mName = name;
  }

  public LabelLocation getLabelLocation() {
    return mLabelLocation;
  }

  public void setLabelLocation(LabelLocation labelLocation) {
    mLabelLocation = labelLocation;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.mName);
    dest.writeParcelable(this.mLabelLocation, flags);
  }

  public Region() {
  }

  protected Region(Parcel in) {
    this.mName = in.readString();
    this.mLabelLocation = in.readParcelable(LabelLocation.class.getClassLoader());
  }

  public static final Parcelable.Creator<Region> CREATOR = new Parcelable.Creator<Region>() {
    @Override public Region createFromParcel(Parcel source) {
      return new Region(source);
    }

    @Override public Region[] newArray(int size) {
      return new Region[size];
    }
  };
}
