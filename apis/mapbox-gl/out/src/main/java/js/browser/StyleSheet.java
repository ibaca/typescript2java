package js.browser;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: StyleSheet
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 649091
  * declared in: tsd/browser/lib.es6.d.ts at pos 649339
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="StyleSheet")
public class StyleSheet
{

    /*
        Constructors
    */
    public StyleSheet () {
    } 

    /*
        Properties
    */

    public Boolean disabled;

    public String href;

    public MediaList media;

    public Node ownerNode;

    public StyleSheet parentStyleSheet;

    public String title;

    public String type;

    /*
        Methods
    */
    @JsProperty(name = "disabled")
    public native Boolean getDisabled();
    @JsProperty(name = "href")
    public native String getHref();
    @JsProperty(name = "media")
    public native MediaList getMedia();
    @JsProperty(name = "ownerNode")
    public native Node getOwnerNode();
    @JsProperty(name = "parentStyleSheet")
    public native StyleSheet getParentStyleSheet();
    @JsProperty(name = "title")
    public native String getTitle();
    @JsProperty(name = "type")
    public native String getType();
    @JsProperty(name = "disabled")
    public native void setDisabled(Boolean value);
    @JsProperty(name = "href")
    public native void setHref(String value);
    @JsProperty(name = "media")
    public native void setMedia(MediaList value);
    @JsProperty(name = "ownerNode")
    public native void setOwnerNode(Node value);
    @JsProperty(name = "parentStyleSheet")
    public native void setParentStyleSheet(StyleSheet value);
    @JsProperty(name = "title")
    public native void setTitle(String value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
