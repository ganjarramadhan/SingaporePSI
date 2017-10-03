package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class PsiResponse implements Parcelable {

  @SerializedName("region_metadata")
  @Expose
  private List<Region> mRegionList = new ArrayList<>();

  @SerializedName("items")
  @Expose
  private List<ApiItem> mApiItemList = new ArrayList<>();

  @SerializedName("api_info")
  @Expose
  private ApiInfo mApiInfo;

  public List<Region> getRegionList() {
    return mRegionList;
  }

  public void setRegionList(List<Region> regionList) {
    mRegionList = regionList;
  }

  public List<ApiItem> getApiItemList() {
    return mApiItemList;
  }

  public void setApiItemList(List<ApiItem> apiItemList) {
    mApiItemList = apiItemList;
  }

  public ApiInfo getApiInfo() {
    return mApiInfo;
  }

  public void setApiInfo(ApiInfo apiInfo) {
    mApiInfo = apiInfo;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeTypedList(this.mRegionList);
    dest.writeList(this.mApiItemList);
    dest.writeParcelable(this.mApiInfo, flags);
  }

  public PsiResponse() {
  }

  protected PsiResponse(Parcel in) {
    this.mRegionList = in.createTypedArrayList(Region.CREATOR);
    this.mApiItemList = new ArrayList<ApiItem>();
    in.readList(this.mApiItemList, ApiItem.class.getClassLoader());
    this.mApiInfo = in.readParcelable(ApiInfo.class.getClassLoader());
  }

  public static final Parcelable.Creator<PsiResponse> CREATOR =
      new Parcelable.Creator<PsiResponse>() {
        @Override public PsiResponse createFromParcel(Parcel source) {
          return new PsiResponse(source);
        }

        @Override public PsiResponse[] newArray(int size) {
          return new PsiResponse[size];
        }
      };
}
