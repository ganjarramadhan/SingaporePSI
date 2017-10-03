package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class ApiInfo implements Parcelable {

  @SerializedName("status")
  @Expose
  private String status;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeString(this.status);
  }

  public ApiInfo() {
  }

  protected ApiInfo(Parcel in) {
    this.status = in.readString();
  }

  public static final Parcelable.Creator<ApiInfo> CREATOR = new Parcelable.Creator<ApiInfo>() {
    @Override public ApiInfo createFromParcel(Parcel source) {
      return new ApiInfo(source);
    }

    @Override public ApiInfo[] newArray(int size) {
      return new ApiInfo[size];
    }
  };
}
