import java.util.HashMap;
class Game{
	static void run(String[] hojun, String[] qila){
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		HashMap<String, Integer> q = new HashMap<String, Integer>();
		for(String s: hojun){
			try{
				int x = h.get(s);
				h.put(s, x+1);
			} catch (Exception e){
				h.put(s, 1);
			}
		}
		for(String s: qila){
			try{
				int x = q.get(s);
				q.put(s, x+1);
			} catch (Exception e){
				q.put(s, 1);
			}
		}

		for(String s: q.keySet()){
			for(int i = 0; i < q.get(s); i++){
				try{
					int x = h.get(s);
					if(x == 1){
						h.remove(s);
					} else {
						h.put(s, x-1);
					}
				} catch (Exception e){
					//pass
				}
			}
		}

		for(String s: h.keySet()){
			for(int i = 0; i < h.get(s); i++){
				System.out.println(s);
			}
		}
	}

}