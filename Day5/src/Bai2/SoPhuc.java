package Bai2;

public class SoPhuc {
    private double soThuc;
    private double soAo;

    public SoPhuc() {
    }

    public SoPhuc(double soThuc, double soAo) {
        this.soThuc = soThuc;
        this.soAo = soAo;
    }

    public double getSoThuc() {
        return soThuc;
    }

    public void setSoThuc(double soThuc) {
        this.soThuc = soThuc;
    }

    public double getSoAo() {
        return soAo;
    }

    public void setSoAo(double soAo) {
        this.soAo = soAo;
    }

    public SoPhuc Cong(SoPhuc x2) {
        SoPhuc x = new SoPhuc();
        x.setSoThuc(this.soThuc + x2.getSoThuc());
        x.setSoAo(this.soAo + x2.getSoAo());
        return x;
    }

    public SoPhuc Tru(SoPhuc x2){
        SoPhuc x = new SoPhuc();
        x.setSoThuc(this.soThuc - x2.getSoThuc());
        x.setSoAo(this.soAo - x2.getSoAo());
        return x;
    }
}
