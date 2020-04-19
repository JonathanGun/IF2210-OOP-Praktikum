import java.io.IOException;
import java.util.List;

public class ChunkLoader implements Runnable {
    // ... Anda boleh menambahkan atribut
    private String chunkDataFilename;
    private Chunk chunk;

    public ChunkLoader(Chunk chunk, String chunkDataFilename) {
        // ... Isilah constructor sesuai kebutuhan
        this.chunk = chunk;
        this.chunkDataFilename = chunkDataFilename;
    }

    @Override
    public void run() {
        // Membaca file dengan nama chunkDataFilename
        // Gunakan class CSVReader.
        CSVReader csvReader = new CSVReader(chunkDataFilename, ",");
        csvReader.setSkipHeader(true);
        List<String[]> positions;
        try {
            positions = csvReader.read();
            int i = 0;
            while(i < positions.size()){
                chunk.addTree(new Position(Integer.valueOf(positions.get(i)[0]), Integer.valueOf(positions.get(i)[1])));
                i++;
            }
        } catch (IOException ignored) {

        }
        // Contoh file chunkDataFilename:
        // x,y
        // 1,18
        // 10,8
        // 6,12
        // Untuk setiap x dan y, tambahkan tree ke Chunk
        // Jika ada IOException pada saat membaca reader, catch Exception
        // tidak ada tree yang ditambahkan pada Chunk (tidak dithrow lagi)
    }
}
