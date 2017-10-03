package com.ganjarramadhan.singaporepsi.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by ganjarramadhan on 03/10/17.
 * ganjar.ramadhan05@gmail.com
 */

public class PsiData implements Parcelable {

  @SerializedName("west")
  @Expose
  private int west;

  @SerializedName("national")
  @Expose
  private int national;

  @SerializedName("east")
  @Expose
  private int east;

  @SerializedName("central")
  @Expose
  private int central;

  @SerializedName("south")
  @Expose
  private int south;

  @SerializedName("north")
  @Expose
  private int north;

  public int getWest() {
    return west;
  }

  public void setWest(int west) {
    this.west = west;
  }

  public int getNational() {
    return national;
  }

  public void setNational(int national) {
    this.national = national;
  }

  public int getEast() {
    return east;
  }

  public void setEast(int east) {
    this.east = east;
  }

  public int getCentral() {
    return central;
  }

  public void setCentral(int central) {
    this.central = central;
  }

  public int getSouth() {
    return south;
  }

  public void setSouth(int south) {
    this.south = south;
  }

  public int getNorth() {
    return north;
  }

  public void setNorth(int north) {
    this.north = north;
  }

  @Override public int describeContents() {
    return 0;
  }

  @Override public void writeToParcel(Parcel dest, int flags) {
    dest.writeInt(this.west);
    dest.writeInt(this.national);
    dest.writeInt(this.east);
    dest.writeInt(this.central);
    dest.writeInt(this.south);
    dest.writeInt(this.north);
  }

  public PsiData() {
  }

  protected PsiData(Parcel in) {
    this.west = in.readInt();
    this.national = in.readInt();
    this.east = in.readInt();
    this.central = in.readInt();
    this.south = in.readInt();
    this.north = in.readInt();
  }

  public static final Parcelable.Creator<PsiData> CREATOR = new Parcelable.Creator<PsiData>() {
    @Override public PsiData createFromParcel(Parcel source) {
      return new PsiData(source);
    }

    @Override public PsiData[] newArray(int size) {
      return new PsiData[size];
    }
  };
}
