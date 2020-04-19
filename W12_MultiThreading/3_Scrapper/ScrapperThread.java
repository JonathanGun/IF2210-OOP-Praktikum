import java.lang.Thread;
import java.util.ArrayList;

class ScrapperThread extends Thread{
	ArrayList<String> urlList;
	Integer lowest;

	public ScrapperThread(ArrayList<String> url){
		this.urlList = url;
		this.lowest = Integer.MAX_VALUE;
	}

	@Override
    public void run(){
        synchronized(this){
            for (String url : urlList) {
	            Website website = new Website(url);
	            int currInt = website.getPrice();
	            lowest = (lowest > currInt) ? currInt : lowest;
	        }
	        this.notify();
        }
    }
}