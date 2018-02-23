package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: Selection
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 640153
  * declared in: tsd/browser/lib.es6.d.ts at pos 641189
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="Selection")
public class Selection
{

    /*
        Constructors
    */
    public Selection () {
    } 

    /*
        Properties
    */

    public Node anchorNode;

    public Number anchorOffset;

    public Node baseNode;

    public Number baseOffset;

    public Node extentNode;

    public Number extentOffset;

    public Node focusNode;

    public Number focusOffset;

    public Boolean isCollapsed;

    public Number rangeCount;

    public String type;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@640534
     */
    public native void addRange(Range range);
    /** 
      * tsd/browser/lib.es6.d.ts@640568
     */
    public native void collapse(Node parentNode, @DoNotAutobox Number offset);
    /** 
      * tsd/browser/lib.es6.d.ts@640622
     */
    public native void collapseToEnd();
    /** 
      * tsd/browser/lib.es6.d.ts@640649
     */
    public native void collapseToStart();
    /** 
      * tsd/browser/lib.es6.d.ts@640678
     */
    public native Boolean containsNode(Node node, Boolean partlyContained);
    /** 
      * tsd/browser/lib.es6.d.ts@640743
     */
    public native void deleteFromDocument();
    /** 
      * tsd/browser/lib.es6.d.ts@640775
     */
    public native void empty();
    /** 
      * tsd/browser/lib.es6.d.ts@640794
     */
    public native void extend(Node newNode, @DoNotAutobox Number offset);
    @JsProperty(name = "anchorNode")
    public native Node getAnchorNode();
    @JsProperty(name = "anchorOffset")
    public native Number getAnchorOffset();
    @JsProperty(name = "baseNode")
    public native Node getBaseNode();
    @JsProperty(name = "baseOffset")
    public native Number getBaseOffset();
    @JsProperty(name = "extentNode")
    public native Node getExtentNode();
    @JsProperty(name = "extentOffset")
    public native Number getExtentOffset();
    @JsProperty(name = "focusNode")
    public native Node getFocusNode();
    @JsProperty(name = "focusOffset")
    public native Number getFocusOffset();
    @JsProperty(name = "isCollapsed")
    public native Boolean getIsCollapsed();
    /** 
      * tsd/browser/lib.es6.d.ts@640843
     */
    public native Range getRangeAt(@DoNotAutobox Number index);
    @JsProperty(name = "rangeCount")
    public native Number getRangeCount();
    @JsProperty(name = "type")
    public native String getType();
    /** 
      * tsd/browser/lib.es6.d.ts@640881
     */
    public native void removeAllRanges();
    /** 
      * tsd/browser/lib.es6.d.ts@640910
     */
    public native void removeRange(Range range);
    /** 
      * tsd/browser/lib.es6.d.ts@640947
     */
    public native void selectAllChildren(Node parentNode);
    @JsProperty(name = "anchorNode")
    public native void setAnchorNode(Node value);
    @JsProperty(name = "anchorOffset")
    public native void setAnchorOffset(@DoNotAutobox Number value);
    /** 
      * tsd/browser/lib.es6.d.ts@640994
     */
    public native void setBaseAndExtent(Node baseNode, @DoNotAutobox Number baseOffset, Node extentNode, @DoNotAutobox Number extentOffset);
    @JsProperty(name = "baseNode")
    public native void setBaseNode(Node value);
    @JsProperty(name = "baseOffset")
    public native void setBaseOffset(@DoNotAutobox Number value);
    @JsProperty(name = "extentNode")
    public native void setExtentNode(Node value);
    @JsProperty(name = "extentOffset")
    public native void setExtentOffset(@DoNotAutobox Number value);
    @JsProperty(name = "focusNode")
    public native void setFocusNode(Node value);
    @JsProperty(name = "focusOffset")
    public native void setFocusOffset(@DoNotAutobox Number value);
    @JsProperty(name = "isCollapsed")
    public native void setIsCollapsed(Boolean value);
    /** 
      * tsd/browser/lib.es6.d.ts@641098
     */
    public native void setPosition(Node parentNode, @DoNotAutobox Number offset);
    @JsProperty(name = "rangeCount")
    public native void setRangeCount(@DoNotAutobox Number value);
    @JsProperty(name = "type")
    public native void setType(String value);
}
