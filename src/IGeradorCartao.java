import java.time.LocalDate;
import java.time.Month;

public interface IGeradorCartao {
  
  default long gerarNumero(){
    final long min = 3000000000000000L;
    final long max = 9999999999999999L;
    long RandomNumber = (long) Math.floor(Math.random() * (max - min + 1) + min);
    return RandomNumber;
  }

  default int gerarNumero(int min, int max){
    int RandomNumber = (int) Math.floor(Math.random() * (max - min + 1) + min);
    return RandomNumber;
  }

  default long gerarNumero(long min, Long max){
    long RandomNumber = (long) Math.floor(Math.random() * (max - min + 1) + min);
    return RandomNumber;
  }

  default String gerarData() {
    LocalDate now = LocalDate.now();
    Month month = now.getMonth();
    int year = now.getYear();
    String expireDate = String.valueOf(month) + "/" + String.valueOf(year + 5);

    return expireDate;
  }
}
