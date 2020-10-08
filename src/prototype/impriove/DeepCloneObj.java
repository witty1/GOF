package prototype.impriove;

import java.io.*;

/**
 * @Created with IntelliJ IDEA.
 * @author: wit
 * @Date: 2020/10/8
 * @Time: 8:18
 * @Description: No Description
 */
public class DeepCloneObj implements Serializable, Cloneable {
    private String name;
    private DeepCloneTarget target;

    public DeepCloneObj(String name, DeepCloneTarget target) {
        this.name = name;
        this.target = target;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deepClone;
        try (ByteArrayOutputStream bos = new ByteArrayOutputStream();
             ObjectOutputStream oos = new ObjectOutputStream(bos);) {
            oos.writeObject(this);
            oos.flush();
            try (ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
                 ObjectInputStream ois = new ObjectInputStream(bis)) {
                deepClone = ois.readObject();
            }
            return deepClone;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeepCloneTarget getTarget() {
        return target;
    }

    public void setTarget(DeepCloneTarget target) {
        this.target = target;
    }

    @Override
    public String toString() {
        return "DeepCloneObj{" +
                "name='" + name + '\'' +
                ", target=" + target.toString() +
                '}';
    }
}
