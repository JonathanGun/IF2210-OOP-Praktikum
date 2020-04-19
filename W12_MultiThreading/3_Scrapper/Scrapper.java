import java.util.ArrayList;

class Scrapper {
    private ArrayList<String> urlList;

    public Scrapper() {
        urlList = new ArrayList<String>();
    }

    public void addUrl(String url) {
        urlList.add(url);
    }

    public int scrapLowestPrice() {
        // Kode berikut masih melakukan scrap ke banyak website
        // secara sekuensial. Agar lebih cepat, ubahlah kode di bawah ini
        // menjadi paralel menggunakan wait dan notify, dengan membuat
        // instance ScrapperThread
        // Hint: baca materi praktikum
        // int lowest = Integer.MAX_VALUE;
        return this.urlList.stream().parallel().map(x -> new Website(x).getPrice()).min().getAsInt();
        // ScrapperThread a = new ScrapperThread(urlList);
        // a.start();

        // synchronized(a){
        //     try{
        //         a.wait();
        //     } catch (InterruptedException ignored){

        //     }
        // }
        // return a.lowest;
    }
}
