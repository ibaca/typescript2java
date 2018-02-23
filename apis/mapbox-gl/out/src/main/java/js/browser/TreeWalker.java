package js.browser;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: TreeWalker
  * flags: Object (32768)
  * declared in: tsd/browser/lib.es6.d.ts at pos 659718
  * declared in: tsd/browser/lib.es6.d.ts at pos 660090
  * 1 constructors
 */
@JsType(isNative=true, namespace=JsPackage.GLOBAL, name="TreeWalker")
public class TreeWalker
{

    /*
        Constructors
    */
    public TreeWalker () {
    } 

    /*
        Properties
    */

    public Node currentNode;

    public Boolean expandEntityReferences;

    public NodeFilter filter;

    public Node root;

    public Number whatToShow;

    /*
        Methods
    */
    /** 
      * tsd/browser/lib.es6.d.ts@659907
     */
    public native Node firstChild();
    @JsProperty(name = "currentNode")
    public native Node getCurrentNode();
    @JsProperty(name = "expandEntityReferences")
    public native Boolean getExpandEntityReferences();
    @JsProperty(name = "filter")
    public native NodeFilter getFilter();
    @JsProperty(name = "root")
    public native Node getRoot();
    @JsProperty(name = "whatToShow")
    public native Number getWhatToShow();
    /** 
      * tsd/browser/lib.es6.d.ts@659931
     */
    public native Node lastChild();
    /** 
      * tsd/browser/lib.es6.d.ts@659954
     */
    public native Node nextNode();
    /** 
      * tsd/browser/lib.es6.d.ts@659976
     */
    public native Node nextSibling();
    /** 
      * tsd/browser/lib.es6.d.ts@660001
     */
    public native Node parentNode();
    /** 
      * tsd/browser/lib.es6.d.ts@660025
     */
    public native Node previousNode();
    /** 
      * tsd/browser/lib.es6.d.ts@660051
     */
    public native Node previousSibling();
    @JsProperty(name = "currentNode")
    public native void setCurrentNode(Node value);
    @JsProperty(name = "expandEntityReferences")
    public native void setExpandEntityReferences(Boolean value);
    @JsProperty(name = "filter")
    public native void setFilter(NodeFilter value);
    @JsProperty(name = "root")
    public native void setRoot(Node value);
    @JsProperty(name = "whatToShow")
    public native void setWhatToShow(@DoNotAutobox Number value);
}
