import java.util.List;
import java.util.ArrayList;

class Assistant {
  private int salary;
  private List recommendations;

  Assistant(int salary) {
    this.salary = salary;
    recommendations = new ArrayList();
  }

  private void addPersonToRecommendations(String name) {
    this.recommendations.add(name);
  }
}