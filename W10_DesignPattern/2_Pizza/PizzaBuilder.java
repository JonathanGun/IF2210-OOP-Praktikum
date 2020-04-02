import java.util.HashMap;

class PizzaBuilder{
	private static final HashMap<String, Integer> sizeMap = new HashMap<String, Integer>(){
		{
			// size, diameter
			put("small", 25);
			put("medium", 35);
			put("large", 40);
			// add more sizes here
		}
	};

	private static final HashMap<String, Integer> crustPriceMap = new HashMap<String, Integer>(){
		{
			// name, addPrice
			put("Original", 0);
			put("Cheesy Bites", 10);
			put("Stuffed", 20);
			// add more crusts here
		}
	};

	private static final HashMap<String, String[]> toppingIngredientMap = new HashMap<String, String[]>(){
		{
			// topping, ingredient
			put("Meat Lovers", new String[]{"beef", "mozarella"});
			put("Tuna Melt", new String[]{"tuna", "corn", "mozarella"});
			put("Supreme", new String[]{"pepperoni", "beef", "mushroom", "pineapple"}); // PINEAPPLE PIZZA?!?!?!?!? NOOOOOOOO
			// add more toppings here
		}
	};

	private static final int pricePerDiameter = 15;
	private static final int pricePerIngredient = 10;

	Pizza pizza;

	public PizzaBuilder(){
		pizza = new Pizza();
	}

	public PizzaBuilder size(String size){
		this.pizza.setDiameter(PizzaBuilder.sizeMap.get(size));
		return this;
	}

	public PizzaBuilder crust(String crust){
		this.pizza.setCrust(crust);
		return this;
	}

	public PizzaBuilder addTopping(String topping){
		for(String ingredient: PizzaBuilder.toppingIngredientMap.get(topping))
			this.pizza.addToppingIngredient(ingredient);
		return this;
	}

	public Pizza build(){
		int price = 0;
		price += PizzaBuilder.pricePerDiameter * this.pizza.getDiameter();
		price += PizzaBuilder.pricePerIngredient * this.pizza.getToppingIngredients().size();
		price += PizzaBuilder.crustPriceMap.get(this.pizza.getCrust());
		this.pizza.setPrice(price);
		return this.pizza;
	}
}