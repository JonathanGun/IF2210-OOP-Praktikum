class Main{
	public static void main(String[] args){
		Assistant ass = new Assistant(100);
		AssistantDecoder test = new AssistantDecoder(ass);
		test.addPersonToRecommendations("jojo");
		System.out.println(test.getSalary());
	}
}