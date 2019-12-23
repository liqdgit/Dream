package utils;


import java.io.Serializable;
import java.util.List;

public class TreeTableModel implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String pid;

    private List child;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public List getChild() {
        return child;
    }

    public void setChild(List child) {
        this.child = child;
    }
}
