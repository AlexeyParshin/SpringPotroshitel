package quoters;

import javax.annotation.PostConstruct;

@Profiling
public class TerminatorQuoter implements Quoter {

  @PostConstruct
  void init(){
    System.out.println("Phase 2");
    System.out.println(repeat);
  }

  TerminatorQuoter(){
    System.out.println("Phase 1");
  }

  @InjectRandomInt(min = 2, max = 7)
  private int repeat;
  private String message;

  public void sayQuote() {
    for (int i = 0; i < repeat; i++) {
      System.out.println(message);
    }
  }

  public void setMessage(String message) {
    this.message = message;
  }
}
