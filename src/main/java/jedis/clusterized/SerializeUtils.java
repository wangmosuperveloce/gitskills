package jedis.clusterized;

import java.io.*;

/**
 * Created by wangmo on 16/10/9.
 */
public class SerializeUtils {

    public static byte[] serialize(Object object) {
        byte[] result = null;

        if (object == null) return new byte[0];

        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(128);
            try {
                if (!(object instanceof Serializable)) {
                    throw new IllegalArgumentException(object.getClass().getCanonicalName()+"不可进行序列化");
                }
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                objectOutputStream.writeObject(object);
                objectOutputStream.flush();
                result = byteArrayOutputStream.toByteArray();
            } catch (Throwable throwable) {
                throw new Exception("序列化失败!",throwable);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public static Object deserialize(byte[] bytes) {
        Object result = null;

        if (bytes == null || bytes.length == 0) return result;

        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                result = objectInputStream.readObject();
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
