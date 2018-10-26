package CleanCode;

public class TimKiTuKoLap {
    public static String findCharacter(String chuoi) {
        String ketQua = "_";
        if (chuoi.length() == 1) {
            return chuoi;
        } else {
            char[] arrChuoi = chuoi.toCharArray();
            for (int i = 0; i < arrChuoi.length; i++) {
                if (chuoi.indexOf(arrChuoi[i]) == chuoi.lastIndexOf(arrChuoi[i])){
                    ketQua = String.valueOf(arrChuoi[i]);
                    return ketQua;
                }
            }
        }
        return ketQua;
    }
}