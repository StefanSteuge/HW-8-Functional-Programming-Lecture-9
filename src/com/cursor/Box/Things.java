package com.cursor.Box;

import java.util.List;

public class Things implements ServiceBox{
    private String thing;
    private Protector status;

    public Things(String thing, Protector status) {
        this.thing = thing;
        this.status = status;
    }


    public void addBox(String protector) {

    }

    public String getThing() {
        return thing;
    }

    public void setThing(String thing) {
        this.thing = thing;
    }

    public Protector getStatus() {
        return status;
    }

    public void setStatus(Protector status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return " Things { " +
                "thing = '" + thing + '\n' +
                " , status = " + status +
                " }";
    }


}
