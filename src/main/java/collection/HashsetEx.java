package collection;

import java.util.Objects;

public class HashsetEx {
    private int id;
    private String name;
    private int pw;
    private String addr;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HashsetEx)) return false;
        HashsetEx hashsetEx = (HashsetEx) o;
        return id == hashsetEx.id &&
                pw == hashsetEx.pw &&
                Objects.equals(name, hashsetEx.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, pw);
    }
}

