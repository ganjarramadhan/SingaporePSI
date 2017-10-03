package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class Readings implements Parcelable {

  @SerializedName("o3_sub_index") @Expose private PsiData o3SubIndex;
  @SerializedName("pm10_twenty_four_hourly") @Expose private PsiData pm10TwentyFourHourly;
  @SerializedName("pm10_sub_index") @Expose private PsiData pm10SubIndex;
  @SerializedName("co_sub_index") @Expose private PsiData coSubIndex;
  @SerializedName("pm25_twenty_four_hourly") @Expose private PsiData pm25TwentyFourHourly;
  @SerializedName("so2_sub_index") @Expose private PsiData so2SubIndex;
  @SerializedName("co_eight_hour_max") @Expose private PsiData coEightHourMax;
  @SerializedName("no2_one_hour_max") @Expose private PsiData no2OneHourMax;
  @SerializedName("so2_twenty_four_hourly") @Expose private PsiData so2TwentyFourHourly;
  @SerializedName("pm25_sub_index") @Expose private PsiData pm25SubIndex;
  @SerializedName("psi_twenty_four_hourly") @Expose private PsiData psiTwentyFourHourly;
  @SerializedName("o3_eight_hour_max") @Expose private PsiData o3EightHourMax;

  public PsiData getO3SubIndex() {
    return o3SubIndex;
  }

  public void setO3SubIndex(PsiData o3SubIndex) {
    this.o3SubIndex = o3SubIndex;
  }

  public PsiData getPm10TwentyFourHourly() {
    return pm10TwentyFourHourly;
  }

  public void setPm10TwentyFourHourly(PsiData pm10TwentyFourHourly) {
    this.pm10TwentyFourHourly = pm10TwentyFourHourly;
  }

  public PsiData getPm10SubIndex() {
    return pm10SubIndex;
  }

  public void setPm10SubIndex(PsiData pm10SubIndex) {
    this.pm10SubIndex = pm10SubIndex;
  }

  public PsiData getCoSubIndex() {
    return coSubIndex;
  }

  public void setCoSubIndex(PsiData coSubIndex) {
    this.coSubIndex = coSubIndex;
  }

  public PsiData getPm25TwentyFourHourly() {
    return pm25TwentyFourHourly;
  }

  public void setPm25TwentyFourHourly(PsiData pm25TwentyFourHourly) {
    this.pm25TwentyFourHourly = pm25TwentyFourHourly;
  }

  public PsiData getSo2SubIndex() {
    return so2SubIndex;
  }

  public void setSo2SubIndex(PsiData so2SubIndex) {
    this.so2SubIndex = so2SubIndex;
  }

  public PsiData getCoEightHourMax() {
    return coEightHourMax;
  }

  public void setCoEightHourMax(PsiData coEightHourMax) {
    this.coEightHourMax = coEightHourMax;
  }

  public PsiData getNo2OneHourMax() {
    return no2OneHourMax;
  }

  public void setNo2OneHourMax(PsiData no2OneHourMax) {
    this.no2OneHourMax = no2OneHourMax;
  }

  public PsiData getSo2TwentyFourHourly() {
    return so2TwentyFourHourly;
  }

  public void setSo2TwentyFourHourly(PsiData so2TwentyFourHourly) {
    this.so2TwentyFourHourly = so2TwentyFourHourly;
  }

  public PsiData getPm25SubIndex() {
    return pm25SubIndex;
  }

  public void setPm25SubIndex(PsiData pm25SubIndex) {
    this.pm25SubIndex = pm25SubIndex;
  }

  public PsiData getPsiTwentyFourHourly() {
    return psiTwentyFourHourly;
  }

  public void setPsiTwentyFourHourly(PsiData psiTwentyFourHourly) {
    this.psiTwentyFourHourly = psiTwentyFourHourly;
  }

  public PsiData getO3EightHourMax() {
    return o3EightHourMax;
  }

  public void setO3EightHourMax(PsiData o3EightHourMax) {
    this.o3EightHourMax = o3EightHourMax;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeParcelable(this.o3SubIndex, flags);
    dest.writeParcelable(this.pm10TwentyFourHourly, flags);
    dest.writeParcelable(this.pm10SubIndex, flags);
    dest.writeParcelable(this.coSubIndex, flags);
    dest.writeParcelable(this.pm25TwentyFourHourly, flags);
    dest.writeParcelable(this.so2SubIndex, flags);
    dest.writeParcelable(this.coEightHourMax, flags);
    dest.writeParcelable(this.no2OneHourMax, flags);
    dest.writeParcelable(this.so2TwentyFourHourly, flags);
    dest.writeParcelable(this.pm25SubIndex, flags);
    dest.writeParcelable(this.psiTwentyFourHourly, flags);
    dest.writeParcelable(this.o3EightHourMax, flags);
  }

  public Readings() {
  }

  protected Readings(Parcel in) {
    this.o3SubIndex = in.readParcelable(PsiData.class.getClassLoader());
    this.pm10TwentyFourHourly = in.readParcelable(PsiData.class.getClassLoader());
    this.pm10SubIndex = in.readParcelable(PsiData.class.getClassLoader());
    this.coSubIndex = in.readParcelable(PsiData.class.getClassLoader());
    this.pm25TwentyFourHourly = in.readParcelable(PsiData.class.getClassLoader());
    this.so2SubIndex = in.readParcelable(PsiData.class.getClassLoader());
    this.coEightHourMax = in.readParcelable(PsiData.class.getClassLoader());
    this.no2OneHourMax = in.readParcelable(PsiData.class.getClassLoader());
    this.so2TwentyFourHourly = in.readParcelable(PsiData.class.getClassLoader());
    this.pm25SubIndex = in.readParcelable(PsiData.class.getClassLoader());
    this.psiTwentyFourHourly = in.readParcelable(PsiData.class.getClassLoader());
    this.o3EightHourMax = in.readParcelable(PsiData.class.getClassLoader());
  }

  public static final Parcelable.Creator<Readings> CREATOR = new Parcelable.Creator<Readings>() {
    @Override public Readings createFromParcel(Parcel source) {
      return new Readings(source);
    }

    @Override public Readings[] newArray(int size) {
      return new Readings[size];
    }
  };
}
