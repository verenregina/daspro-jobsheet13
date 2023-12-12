public class TerimaKasih29 {
    public static void UcapanTerimakasih() {
        System.out.println("Terima kasih banyak!");
        System.out.println("Semoga sukses selalu!");
    }
    public static void UcapanTambahan(String ucapan){
        System.out.println(ucapan);
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
        String ucapan = "Terima kasih Pak.. Bu.. Semoga Sehat Selalu";
        UcapanTambahan(ucapan);
    }
}
