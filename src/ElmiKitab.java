public class ElmiKitab extends Kitab{
    private int yawHeddi;

    public ElmiKitab(String ad, String muellif, double qiymet, int yawHeddi) {
        super(ad, muellif, qiymet);
        this.yawHeddi = yawHeddi;
    }

    public int getYawheddi() {
        return yawHeddi;
    }

    public void setYawheddi(int yawheddi) {
        this.yawHeddi = yawheddi;
    }

    @Override
    public String toString() {
        return "ElmiKitab{" +
                "ad ='" + super.getAd() + '\'' +
                ", muellif ='" + super.getmuellif() + '\'' +
                ", qiymet=" + super.getqiymet() +
                "  yawHeddi=" + yawHeddi +
                '}';
    }
}
