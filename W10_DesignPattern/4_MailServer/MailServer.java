// import java api jika diperlukan
import java.util.HashMap;
import java.util.ArrayList;

public class MailServer implements EventChannel {
  // tambahkan properties jika perlu
  private HashMap<String, ArrayList<Subscriber>> subscriber;

  public MailServer() {
    // menginisiasi daftar subscriber
    this.subscriber = new HashMap<String, ArrayList<Subscriber>>();
  }

  public void addSubscriber(String topic, Subscriber s) {
    // tambahkan s sebagai subscriber ke topic yang diberikan
    if(this.subscriber.containsKey(topic)){
      this.subscriber.get(topic).add(s);
    } else {
      this.subscriber.put(topic, new ArrayList<Subscriber>());
      this.addSubscriber(topic, s);
    } 
  }

  public void sendEvent(String topic, Event event) {
    // untuk setiap subscriber s yang sudah subscribe ke topic yang diberikan,
    // panggil s.onEvent(event)
    try{
      this.subscriber.get(topic).forEach(s -> s.onEvent(event));
    } catch (NullPointerException e){
      
    }
  }
}
