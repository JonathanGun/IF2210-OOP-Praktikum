import java.lang.reflect.*;
public class AssistantDecoder {
	Assistant assistant;
	Class c;

	AssistantDecoder(Assistant assistant) {
		this.assistant = assistant;
		c = assistant.getClass();
	}

	public void addPersonToRecommendations(String name) throws Exception {
		Method m = c.getDeclaredMethod("addPersonToRecommendations", String.class);
		m.setAccessible(true);
		m.invoke(this.assistant, name);
	}

	public int getSalary() throws Exception {
		Field salary = c.getDeclaredField("salary");
		salary.setAccessible(true);
		return salary.getInt(this.assistant);
	}
}