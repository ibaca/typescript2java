package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: NodeIterator
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 535141
  * declared in: tsd/browser/lib.es6.d.ts at pos 535387
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="NodeIterator")
public class NodeIterator
{

    /*
        Constructors
    */
    public NodeIterator () {
    } 

    /*
        Properties
    */

    public Boolean expandEntityReferences;

    public NodeFilter filter;

    public Node root;

    public Number whatToShow;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@535309
     */
    public native void detach();
    @JsProperty(name = "expandEntityReferences")
    public native Boolean getExpandEntityReferences();
    @JsProperty(name = "filter")
    public native NodeFilter getFilter();
    @JsProperty(name = "root")
    public native Node getRoot();
    @JsProperty(name = "whatToShow")
    public native Number getWhatToShow();
    /** 
      * tsd/browser/lib.es6.d.ts@535329
     */
    public native Node nextNode();
    /** 
      * tsd/browser/lib.es6.d.ts@535351
     */
    public native Node previousNode();
    @JsProperty(name = "expandEntityReferences")
    public native void setExpandEntityReferences(Boolean value);
    @JsProperty(name = "filter")
    public native void setFilter(NodeFilter value);
    @JsProperty(name = "root")
    public native void setRoot(Node value);
    @JsProperty(name = "whatToShow")
    public native void setWhatToShow(@DoNotAutobox Number value);
}
