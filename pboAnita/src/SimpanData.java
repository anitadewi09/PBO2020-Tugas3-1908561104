import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SimpanData {
    public void simpanData(DataMahasiswa dataMahasiswa) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("data_text.txt");
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
                objectOutputStream.writeObject(dataMahasiswa);
                objectOutputStream.flush();
            }
        } catch (IOException error) {
        }
    }
}
