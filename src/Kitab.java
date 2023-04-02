public class Kitab {
    private String ad;
    private String muellif;
    private double qiymet;

    public Kitab(String ad, String muellif, double qiymet){
      this.ad = ad;
      this.muellif = muellif;
      this.qiymet = qiymet;

    }
    public void setAd(String ad){
        this.ad = ad;

    }
    public String getAd(){
        return this.ad;
    }
    public void setmuellif(String muellif){
        this.muellif = muellif;
    }
    public String getmuellif(){
        return this.muellif;
    }
    public void setqiymet(double qiymet){
        this.qiymet = qiymet;
    }
    public double getqiymet(){
        return this.qiymet;
    }

    @Override
    public String toString() {
        return "Kitab{" +
                "ad ='" + ad + '\'' +
                ", muellif ='" + muellif + '\'' +
                ", qiymet=" + qiymet +
                '}';
    }
}
