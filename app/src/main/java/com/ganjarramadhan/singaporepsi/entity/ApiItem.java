package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.Date;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class ApiItem implements Parcelable {

  @SerializedName("timestamp")
  @Expose
  private Date mTimestamp;

  @SerializedName("update_timestamp")
  @Expose
  private Date mUpdateTimestamp;

  @SerializedName("readings")
  @Expose
  private Readings mReadings;

  public Date getTimestamp() {
    return mTimestamp;
  }

  public void setTimestamp(Date timestamp) {
    mTimestamp = timestamp;
  }

  public Date getUpdateTimestamp() {
    return mUpdateTimestamp;
  }

  public void setUpdateTimestamp(Date updateTimestamp) {
    mUpdateTimestamp = updateTimestamp;
  }

  public Readings getReadings() {
    return mReadings;
  }

  public void setReadings(Readings readings) {
    mReadings = readings;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeLong(this.mTimestamp != null ? this.mTimestamp.getTime() : -1);
    dest.writeLong(this.mUpdateTimestamp != null ? this.mUpdateTimestamp.getTime() : -1);
    dest.writeParcelable(this.mReadings, flags);
  }

  public ApiItem() {
  }

  protected ApiItem(Parcel in) {
    long tmpMTimestamp = in.readLong();
    this.mTimestamp = tmpMTimestamp == -1 ? null : new Date(tmpMTimestamp);
    long tmpMUpdateTimestamp = in.readLong();
    this.mUpdateTimestamp = tmpMUpdateTimestamp == -1 ? null : new Date(tmpMUpdateTimestamp);
    this.mReadings = in.readParcelable(Readings.class.getClassLoader());
  }

  public static final Parcelable.Creator<ApiItem> CREATOR = new Parcelable.Creator<ApiItem>() {
    @Override public ApiItem createFromParcel(Parcel source) {
      return new ApiItem(source);
    }

    @Override public ApiItem[] newArray(int size) {
      return new ApiItem[size];
    }
  };
}
