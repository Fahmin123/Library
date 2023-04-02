public class BediiKitab extends Kitab {

    private String janr;

    public BediiKitab( String ad, String muellif, double qiymet, String janr){
        super(ad, muellif, qiymet);
     this.janr = janr;
    }



    public String getJanr() {
        return janr;
    }

    public void setJanr(String janr) {
        this.janr = janr;
    }
    @Override
    public String toString() {
        return "ElmiKitab{" +
                "ad ='" + super.getAd() + '\'' +
                ", muellif ='" + super.getmuellif() + '\'' +
                ", qiymet=" + super.getqiymet() +
                "  janr =" + janr +
                '}';
    }
}
