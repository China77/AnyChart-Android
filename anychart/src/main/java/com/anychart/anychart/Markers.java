package com.anychart.anychart;

import java.util.Locale;
import java.util.Arrays;

public class Markers extends JsObject {

    
    private Double index;

    public void setItemat(Double index) {
        this.index = index;
    }

    private Double index1;
    private String type;

    public void setItemat(Double index1, String type) {
        this.index = null;
        this.index1 = null;
        
        this.index1 = index1;
        this.type = type;
    }

    private String[] items;
    private String items1;
    private String var_args;

    public void setItems(String[] items, String var_args) {
        this.items = null;
        this.items1 = null;
        
        this.items = items;
        this.var_args = var_args;
    }


    public void setItems(String items1, String var_args) {
        this.items = null;
        this.items1 = null;
        
        this.items1 = items1;
        this.var_args = var_args;
    }

    private String type1;
    private Boolean useCapture;

    public void setListen(String type1, Boolean useCapture) {
        this.type = null;
        this.type1 = null;
        
        this.type1 = type1;
        this.useCapture = useCapture;
    }

    private String type2;
    private Boolean useCapture1;

    public void setListenonce(String type2, Boolean useCapture1) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        
        this.type2 = type2;
        this.useCapture = null;
        this.useCapture1 = null;
        
        this.useCapture1 = useCapture1;
    }

    private String type3;

    public void setRemovealllisteners(String type3) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        
        this.type3 = type3;
    }

    private String type4;
    private Boolean useCapture2;

    public void setUnlisten(String type4, Boolean useCapture2) {
        this.type = null;
        this.type1 = null;
        this.type2 = null;
        this.type3 = null;
        this.type4 = null;
        
        this.type4 = type4;
        this.useCapture = null;
        this.useCapture1 = null;
        this.useCapture2 = null;
        
        this.useCapture2 = useCapture2;
    }

    private String generateJSindex() {
        if (index != null) {
            return String.format(Locale.US, "index: %f,", index);
        }
        return "";
    }

    private String generateJSindex1() {
        if (index1 != null) {
            return String.format(Locale.US, "index: %f,", index1);
        }
        return "";
    }

    private String generateJStype() {
        if (type != null) {
            return String.format(Locale.US, "type: %s,", type);
        }
        return "";
    }

    private String generateJSitems() {
        if (items != null) {
            return String.format(Locale.US, "items: %s,", Arrays.toString(items));
        }
        return "";
    }

    private String generateJSitems1() {
        if (items1 != null) {
            return String.format(Locale.US, "items: %s,", items1);
        }
        return "";
    }

    private String generateJSvar_args() {
        if (var_args != null) {
            return String.format(Locale.US, "var_args: %s,", var_args);
        }
        return "";
    }

    private String generateJStype1() {
        if (type1 != null) {
            return String.format(Locale.US, "type: %s,", type1);
        }
        return "";
    }

    private String generateJSuseCapture() {
        if (useCapture != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture);
        }
        return "";
    }

    private String generateJStype2() {
        if (type2 != null) {
            return String.format(Locale.US, "type: %s,", type2);
        }
        return "";
    }

    private String generateJSuseCapture1() {
        if (useCapture1 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture1);
        }
        return "";
    }

    private String generateJStype3() {
        if (type3 != null) {
            return String.format(Locale.US, "type: %s,", type3);
        }
        return "";
    }

    private String generateJStype4() {
        if (type4 != null) {
            return String.format(Locale.US, "type: %s,", type4);
        }
        return "";
    }

    private String generateJSuseCapture2() {
        if (useCapture2 != null) {
            return String.format(Locale.US, "useCapture: %b,", useCapture2);
        }
        return "";
    }


    @Override
    protected String generateJs() {
        js.append("{");
        js.append(generateJSindex());
        js.append(generateJSindex1());
        js.append(generateJStype());
        js.append(generateJSitems());
        js.append(generateJSitems1());
        js.append(generateJSvar_args());
        js.append(generateJStype1());
        js.append(generateJSuseCapture());
        js.append(generateJStype2());
        js.append(generateJSuseCapture1());
        js.append(generateJStype3());
        js.append(generateJStype4());
        js.append(generateJSuseCapture2());

        js.append("}");

        String result = js.toString();
        js.setLength(0);
        return result;
    }

}