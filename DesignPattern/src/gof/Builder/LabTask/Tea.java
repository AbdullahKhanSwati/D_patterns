public class Tea implements Item {
    private SweetnessType sweetnessType;
    private boolean withCream;
    private int sweetnessSpoons;

    public Tea(SweetnessType sweetnessType, boolean withCream, int sweetnessSpoons) {
        this.sweetnessType = sweetnessType;
        this.withCream = withCream;
        this.sweetnessSpoons = sweetnessSpoons;
    }