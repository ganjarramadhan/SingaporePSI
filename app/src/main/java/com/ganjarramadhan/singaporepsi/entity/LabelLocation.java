package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class LabelLocation implements Parcelable {

  @SerializedName("latitude")
  @Expose
  private double latitude;

  @SerializedName("longitude")
  @Expose
  private double longitude;

  public double getLatitude() {
    return latitude;
  }

  public void setLatitude(double latitude) {
    this.latitude = latitude;
  }

  public double getLongitude() {
    return longitude;
  }

  public void setLongitude(double longitude) {
    this.longitude = longitude;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeDouble(this.latitude);
    dest.writeDouble(this.longitude);
  }

  public LabelLocation() {
  }

  protected LabelLocation(Parcel in) {
    this.latitude = in.readDouble();
    this.longitude = in.readDouble();
  }

  public static final Parcelable.Creator<LabelLocation> CREATOR =
      new Parcelable.Creator<LabelLocation>() {
        @Override public LabelLocation createFromParcel(Parcel source) {
          return new LabelLocation(source);
        }

        @Override public LabelLocation[] newArray(int size) {
          return new LabelLocation[size];
        }
      };
}
