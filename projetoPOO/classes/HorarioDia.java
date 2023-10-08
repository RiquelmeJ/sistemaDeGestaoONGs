package classes;

public class HorarioDia {
    private boolean h8;
    private boolean h10;
    private boolean h12;
    private boolean h14;
    private boolean h16;
    private boolean h18;
    private boolean h20;
    
    public HorarioDia(boolean h8, boolean h10, boolean h12, boolean h14, boolean h16, boolean h18, boolean h20) {
        this.h8 = h8;
        this.h10 = h10;
        this.h12 = h12;
        this.h14 = h14;
        this.h16 = h16;
        this.h18 = h18;
        this.h20 = h20;
    }
    
    public boolean isH8() {
        return h8;
    }
    public void setH8(boolean h8) {
        this.h8 = h8;
    }
    public boolean isH10() {
        return h10;
    }
    public void setH10(boolean h10) {
        this.h10 = h10;
    }
    public boolean isH12() {
        return h12;
    }
    public void setH12(boolean h12) {
        this.h12 = h12;
    }
    public boolean isH14() {
        return h14;
    }
    public void setH14(boolean h14) {
        this.h14 = h14;
    }
    public boolean isH16() {
        return h16;
    }
    public void setH16(boolean h16) {
        this.h16 = h16;
    }
    public boolean isH18() {
        return h18;
    }
    public void setH18(boolean h18) {
        this.h18 = h18;
    }
    public boolean isH20() {
        return h20;
    }
    public void setH20(boolean h20) {
        this.h20 = h20;
    }
}
