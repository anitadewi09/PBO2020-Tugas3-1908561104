import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class MuatData {
    public DataMahasiswa muatDataMhs() {
        DataMahasiswa dataMahasiswa = null;
        try {
            FileInputStream fileInputStream = new FileInputStream("data_text.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            dataMahasiswa = (DataMahasiswa) objectInputStream.readObject();
            objectInputStream.close();
        } catch (Exception error) {
            error.printStackTrace();
        }
        return dataMahasiswa;
    }
}
