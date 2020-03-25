import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class CanBoDao {
    private static final String FILE_NAME = "Canbo.txt";

    public void write(List<CanBo> c) {
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) {
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(c);
        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {
            closeStream(fos);
            closeStream(oos);


        }
    }

    private void closeStream(InputStream is) {
        if (is != null) {
            try {
                is.close();
            } catch (IOException ioe) {
                ioe.printStackTrace();
            }

        }
    }

    public List<CanBo> read() {
        List<CanBo> canBoList = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            fis = new FileInputStream(new File(FILE_NAME));
            ois = new ObjectInputStream(fis);
            canBoList = (List<CanBo>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.print("Can Bo List is empty");

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } catch (ClassNotFoundException c) {
            c.printStackTrace();

        } finally {
            closeStream(fis);
            closeStream(ois);

        }
        return canBoList;
    }

    private void closeStream(OutputStream os) {
        if (os != null) {
            try {
                os.close();

            } catch (IOException ioe) {
                ioe.printStackTrace();
            }
        }
    }
}

