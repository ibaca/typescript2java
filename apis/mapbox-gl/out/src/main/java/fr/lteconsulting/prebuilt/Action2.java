package fr.lteconsulting.prebuilt;

import javaemul.internal.annotations.DoNotAutobox;
import jsinterop.annotations.JsFunction;

/** 
  * 
 */
@JsFunction
public interface Action2<P1, P2>{
    void call(@DoNotAutobox P1 p1, @DoNotAutobox P2 p2);
}
