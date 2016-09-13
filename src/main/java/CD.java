

public class CD implements Comparable<CD>{
  private String mCDName;
  private String mBandName;
  private String mYear;

  public CD(String cdname, String bandName, String year) {
    mCDName = cdname;
    mBandName = bandName;
    mYear = year;
  }

  public String getCDName() {
    return mCDName;
  }

  public String getBandName() {
    return mBandName;
  }

  public String getYear() {
    return mYear;
  }

  public int compareTo(CD cd2){
    return getCDName().compareTo(cd2.getCDName());
  }
}
