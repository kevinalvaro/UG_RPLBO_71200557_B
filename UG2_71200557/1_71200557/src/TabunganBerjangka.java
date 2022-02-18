public class TabunganBerjangka {
    String pemilik;
    Double saldo;

    public Double getSaldo() {
        return saldo;
    }

    public void penarikan() {
        saldo -= 50000;
    }

    public void penyetoran(int saldobaru){
        saldo += saldobaru;
    }
}
