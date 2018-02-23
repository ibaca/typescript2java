package js.mapboxgl;

import fr.lteconsulting.prebuilt.Action;
import javaemul.internal.annotations.DoNotAutobox;
import js.LngLatBoun_89_gLatBounds;
import js.LngLatLike_UnionOfArrayOfNumberAndLngLat;
import js.PointLike_UnionOfArrayOfNumberAndPoint;
import js.UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint;
import js.browser.AnonymousType705;
import js.browser.Array;
import js.browser.ArrayBufferView;
import js.browser.Function;
import js.browser.HTMLCanvasElement;
import js.browser.HTMLElement;
import js.browser.HTMLImageElement;
import js.browser.UnionOfArrayBufferViewAndHTMLImageElement;
import js.geojson.Feature;
import js.geojson.GeoJSONGeo_98_AndPolygon;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/** 
  * source type: "tsd/mapbox-gl/index".Map
  * flags: Object (32768)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 849
  * source type: "tsd/mapbox-gl/index".Map
  * flags: TypeParameter (16384)
  * declared in: tsd/mapbox-gl/index.d.ts at pos 849
  * 2 constructors
  * Map
  * Map
 */
@JsType(isNative=true, namespace="mapboxgl", name="Map")
public class Map extends Evented 
{

    /*
        Constructors
    */
    public Map (MapboxOptions options /* optional */) {
    } 
    public Map () {
    } 

    /*
        Properties
    */

    public BoxZoomHandler boxZoom;

    public DoubleClickZoomHandler doubleClickZoom;

    public DragPanHandler dragPan;

    public DragRotateHandler dragRotate;

    public KeyboardHandler keyboard;

    public Action onError;

    public Boolean repaint;

    public ScrollZoomHandler scrollZoom;

    public Boolean showCollisionBoxes;

    public Boolean showTileBoundaries;

    public TouchZoomRotateHandler touchZoomRotate;

    /*
        Methods
    */
    public native Map addClass(String klass);
    /** 
      * tsd/mapbox-gl/index.d.ts@1300
     */
    public native Map addClass(String klass, StyleOptions options /* optional */);
    public native Map addControl(Control control);
    /** 
      * tsd/mapbox-gl/index.d.ts@972
     */
    public native Map addControl(Control control, String position /* optional */);
    public native Map addControl(IControl control);
    /** 
      * tsd/mapbox-gl/index.d.ts@1087
      * VERSION 1
     */
    public native Map addControl(IControl control, String position /* optional */);
    public native Map addImage(String name, ArrayBufferView image);
    public native Map addImage(String name, ArrayBufferView image, Object options /* optional */);
    public native Map addImage(String name, HTMLImageElement image);
    public native Map addImage(String name, HTMLImageElement image, Object options /* optional */);
    public native Map addImage(String name, UnionOfArrayBufferViewAndHTMLImageElement image);
    /** 
      * tsd/mapbox-gl/index.d.ts@2789
     */
    public native Map addImage(String name, UnionOfArrayBufferViewAndHTMLImageElement image, Object options /* optional */);
    public native Map addLayer(Layer layer);
    /** 
      * tsd/mapbox-gl/index.d.ts@3082
     */
    public native Map addLayer(Layer layer, String before /* optional */);
    public native Map addSource(String id, GeoJSONSource source);
    public native Map addSource(String id, GeoJSONSourceRaw source);
    public native Map addSource(String id, ImageSource source);
    public native Map addSource(String id, RasterSource source);
    public native Map addSource(String id, VectorSource source);
    public native Map addSource(String id, VideoSource source);
    /** 
      * tsd/mapbox-gl/index.d.ts@2423
     */
    public native Map addSource(String id, UnionOfGeoJSONSourceAndGeoJSONSourceRawAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource source);
    /** 
      * tsd/mapbox-gl/index.d.ts@2607
     */
    public native Boolean areTilesLoaded();
    public native Map easeTo(AnimationOptions options);
    public native Map easeTo(AnimationOptions options, EventData eventData /* optional */);
    public native Map easeTo(CameraOptions options);
    public native Map easeTo(CameraOptions options, EventData eventData /* optional */);
    public native Map easeTo(UnionOfAnimationOptionsAndCameraOptions options);
    /** 
      * tsd/mapbox-gl/index.d.ts@5637
     */
    public native Map easeTo(UnionOfAnimationOptionsAndCameraOptions options, EventData eventData /* optional */);
    public native Map fitBounds(LngLatBounds bounds);
    public native Map fitBounds(LngLatBounds bounds, FitBoundsOptions options /* optional */);
    public native Map fitBounds(LngLatBounds bounds, FitBoundsOptions options /* optional */, EventData eventData /* optional */);
    public native Map fitBounds(Array<Array<Number>> bounds);
    public native Map fitBounds(Array<Array<Number>> bounds, FitBoundsOptions options /* optional */);
    public native Map fitBounds(Array<Array<Number>> bounds, FitBoundsOptions options /* optional */, EventData eventData /* optional */);
    public native Map fitBounds(LngLatBoun_89_gLatBounds bounds);
    public native Map fitBounds(LngLatBoun_89_gLatBounds bounds, FitBoundsOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@5428
     */
    public native Map fitBounds(LngLatBoun_89_gLatBounds bounds, FitBoundsOptions options /* optional */, EventData eventData /* optional */);
    public native Map flyTo(FlyToOptions options);
    /** 
      * tsd/mapbox-gl/index.d.ts@5753
     */
    public native Map flyTo(FlyToOptions options, EventData eventData /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4934
     */
    public native Number getBearing();
    /** 
      * tsd/mapbox-gl/index.d.ts@1629
     */
    public native LngLatBounds getBounds();
    @JsProperty(name = "boxZoom")
    public native BoxZoomHandler getBoxZoom();
    /** 
      * tsd/mapbox-gl/index.d.ts@3985
     */
    public native HTMLCanvasElement getCanvas();
    /** 
      * tsd/mapbox-gl/index.d.ts@3941
     */
    public native HTMLElement getCanvasContainer();
    /** 
      * tsd/mapbox-gl/index.d.ts@4208
     */
    public native LngLat getCenter();
    /** 
      * tsd/mapbox-gl/index.d.ts@1571
     */
    public native Array<String> getClasses();
    /** 
      * tsd/mapbox-gl/index.d.ts@3903
     */
    public native HTMLElement getContainer();
    @JsProperty(name = "doubleClickZoom")
    public native DoubleClickZoomHandler getDoubleClickZoom();
    @JsProperty(name = "dragPan")
    public native DragPanHandler getDragPan();
    @JsProperty(name = "dragRotate")
    public native DragRotateHandler getDragRotate();
    /** 
      * tsd/mapbox-gl/index.d.ts@3435
     */
    public native Array<Object> getFilter(String layer);
    @JsProperty(name = "keyboard")
    public native KeyboardHandler getKeyboard();
    /** 
      * tsd/mapbox-gl/index.d.ts@3244
     */
    public native Layer getLayer(String id);
    public native Object getLayoutProperty(String layer, String name);
    /** 
      * tsd/mapbox-gl/index.d.ts@3719
     */
    public native Object getLayoutProperty(String layer, String name, String klass /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@3866
     */
    public native Light getLight();
    /** 
      * tsd/mapbox-gl/index.d.ts@1857
     */
    public native Number getMaxZoom();
    /** 
      * tsd/mapbox-gl/index.d.ts@1781
     */
    public native Number getMinZoom();
    @JsProperty(name = "onError")
    public native Action getOnError();
    public native Object getPaintProperty(String layer, String name);
    /** 
      * tsd/mapbox-gl/index.d.ts@3567
     */
    public native Object getPaintProperty(String layer, String name, String klass /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@5336
     */
    public native Number getPitch();
    @JsProperty(name = "repaint")
    public native Boolean getRepaint();
    @JsProperty(name = "scrollZoom")
    public native ScrollZoomHandler getScrollZoom();
    @JsProperty(name = "showCollisionBoxes")
    public native Boolean getShowCollisionBoxes();
    @JsProperty(name = "showTileBoundaries")
    public native Boolean getShowTileBoundaries();
    /** 
      * tsd/mapbox-gl/index.d.ts@2684
     */
    public native UnionOfGeoJSONSourceAndImageSourceAndRasterSourceAndVectorSourceAndVideoSource getSource(String id);
    /** 
      * tsd/mapbox-gl/index.d.ts@2351
     */
    public native Style getStyle();
    @JsProperty(name = "touchZoomRotate")
    public native TouchZoomRotateHandler getTouchZoomRotate();
    /** 
      * tsd/mapbox-gl/index.d.ts@4545
     */
    public native Number getZoom();
    /** 
      * tsd/mapbox-gl/index.d.ts@1528
     */
    public native Boolean hasClass(String klass);
    /** 
      * tsd/mapbox-gl/index.d.ts@2939
     */
    public native Boolean hasImage(String name);
    /** 
      * tsd/mapbox-gl/index.d.ts@5839
     */
    public native Boolean isMoving();
    /** 
      * tsd/mapbox-gl/index.d.ts@2561
     */
    public native Boolean isSourceLoaded(String id);
    /** 
      * tsd/mapbox-gl/index.d.ts@2388
     */
    public native Boolean isStyleLoaded();
    public native Map jumpTo(CameraOptions options);
    /** 
      * tsd/mapbox-gl/index.d.ts@5549
     */
    public native Map jumpTo(CameraOptions options, EventData eventData /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@3023
     */
    public native Map loadImage(String url, Function callback);
    /** 
      * tsd/mapbox-gl/index.d.ts@4026
     */
    public native Boolean loaded();
    public native Map moveLayer(String id);
    /** 
      * tsd/mapbox-gl/index.d.ts@3147
     */
    public native Map moveLayer(String id, String beforeId /* optional */);
    public native Map panBy(Array<Number> offset);
    public native Map panBy(Array<Number> offset, AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4325
     */
    public native Map panBy(Array<Number> offset, AnimationOptions options /* optional */, EventData eventData /* optional */);
    public native Map panTo(LngLat lnglat);
    public native Map panTo(LngLat lnglat, AnimationOptions options /* optional */);
    public native Map panTo(LngLat lnglat, AnimationOptions options /* optional */, EventData eventdata /* optional */);
    public native Map panTo(Array<Number> lnglat);
    public native Map panTo(Array<Number> lnglat, AnimationOptions options /* optional */);
    public native Map panTo(Array<Number> lnglat, AnimationOptions options /* optional */, EventData eventdata /* optional */);
    public native Map panTo(LngLatLike_UnionOfArrayOfNumberAndLngLat lnglat);
    public native Map panTo(LngLatLike_UnionOfArrayOfNumberAndLngLat lnglat, AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4434
     */
    public native Map panTo(LngLatLike_UnionOfArrayOfNumberAndLngLat lnglat, AnimationOptions options /* optional */, EventData eventdata /* optional */);
    public native Point project(LngLat lnglat);
    public native Point project(Array<Number> lnglat);
    /** 
      * tsd/mapbox-gl/index.d.ts@1888
     */
    public native Point project(LngLatLike_UnionOfArrayOfNumberAndLngLat lnglat);
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures();
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures(Point pointOrBox /* optional */);
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures(Point pointOrBox /* optional */, Object parameters /* optional */);
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures(Array<Number> pointOrBox /* optional */);
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures(Array<Number> pointOrBox /* optional */, Object parameters /* optional */);
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures(UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint pointOrBox /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@1997
     */
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> queryRenderedFeatures(UnionOfArrayOfNumberAndArrayOfPointLike_UnionOfArrayOfNumberAndPointAndPoint pointOrBox /* optional */, Object parameters /* optional */);
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> querySourceFeatures(String sourceID);
    /** 
      * tsd/mapbox-gl/index.d.ts@2155
     */
    public native Array<Feature<GeoJSONGeo_98_AndPolygon, AnonymousType705>> querySourceFeatures(String sourceID, Object parameters /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4054
     */
    public native void remove();
    public native Map removeClass(String klass);
    /** 
      * tsd/mapbox-gl/index.d.ts@1373
     */
    public native Map removeClass(String klass, StyleOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@1203
     */
    public native Map removeControl(Control control);
    /** 
      * tsd/mapbox-gl/index.d.ts@1251
      * VERSION 1
     */
    public native Map removeControl(IControl control);
    /** 
      * tsd/mapbox-gl/index.d.ts@2981
     */
    public native Map removeImage(String name);
    /** 
      * tsd/mapbox-gl/index.d.ts@3204
     */
    public native Map removeLayer(String id);
    /** 
      * tsd/mapbox-gl/index.d.ts@2643
     */
    public native Map removeSource(String id);
    public native Map resetNorth();
    public native Map resetNorth(AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@5143
     */
    public native Map resetNorth(AnimationOptions options /* optional */, EventData eventData /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@1604
     */
    public native Map resize();
    public native Map rotateTo(@DoNotAutobox Number bearing);
    public native Map rotateTo(@DoNotAutobox Number bearing, AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@5041
     */
    public native Map rotateTo(@DoNotAutobox Number bearing, AnimationOptions options /* optional */, EventData eventData /* optional */);
    public native Map setBearing(@DoNotAutobox Number bearing);
    /** 
      * tsd/mapbox-gl/index.d.ts@4965
     */
    public native Map setBearing(@DoNotAutobox Number bearing, EventData eventData /* optional */);
    @JsProperty(name = "boxZoom")
    public native void setBoxZoom(BoxZoomHandler value);
    public native Map setCenter(LngLat center);
    public native Map setCenter(LngLat center, EventData eventData /* optional */);
    public native Map setCenter(Array<Number> center);
    public native Map setCenter(Array<Number> center, EventData eventData /* optional */);
    public native Map setCenter(LngLatLike_UnionOfArrayOfNumberAndLngLat center);
    /** 
      * tsd/mapbox-gl/index.d.ts@4247
     */
    public native Map setCenter(LngLatLike_UnionOfArrayOfNumberAndLngLat center, EventData eventData /* optional */);
    public native Map setClasses(Array<String> klasses);
    /** 
      * tsd/mapbox-gl/index.d.ts@1449
     */
    public native Map setClasses(Array<String> klasses, StyleOptions options /* optional */);
    @JsProperty(name = "doubleClickZoom")
    public native void setDoubleClickZoom(DoubleClickZoomHandler value);
    @JsProperty(name = "dragPan")
    public native void setDragPan(DragPanHandler value);
    @JsProperty(name = "dragRotate")
    public native void setDragRotate(DragRotateHandler value);
    public native Map setFilter(String layer);
    /** 
      * tsd/mapbox-gl/index.d.ts@3291
     */
    public native Map setFilter(String layer, Array<Object> filter /* optional */);
    @JsProperty(name = "keyboard")
    public native void setKeyboard(KeyboardHandler value);
    public native Map setLayerZoomRange(String layerId);
    public native Map setLayerZoomRange(String layerId, @DoNotAutobox Number minzoom /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@3348
     */
    public native Map setLayerZoomRange(String layerId, @DoNotAutobox Number minzoom /* optional */, @DoNotAutobox Number maxzoom /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@3644
     */
    public native Map setLayoutProperty(String layer, String name, Object value);
    /** 
      * tsd/mapbox-gl/index.d.ts@3797
     */
    public native Map setLight(Light options, Object lightOptions);
    public native Map setMaxBounds();
    public native Map setMaxBounds(LngLatBounds lnglatbounds /* optional */);
    public native Map setMaxBounds(Array<Array<Number>> lnglatbounds /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@1674
     */
    public native Map setMaxBounds(LngLatBoun_89_gLatBounds lnglatbounds /* optional */);
    public native Map setMaxZoom();
    /** 
      * tsd/mapbox-gl/index.d.ts@1812
     */
    public native Map setMaxZoom(@DoNotAutobox Number maxZoom /* optional */);
    public native Map setMinZoom();
    /** 
      * tsd/mapbox-gl/index.d.ts@1736
     */
    public native Map setMinZoom(@DoNotAutobox Number minZoom /* optional */);
    @JsProperty(name = "onError")
    public native void setOnError(Action value);
    public native Map setPaintProperty(String layer, String name, Object value);
    /** 
      * tsd/mapbox-gl/index.d.ts@3477
     */
    public native Map setPaintProperty(String layer, String name, Object value, String klass /* optional */);
    public native Map setPitch(@DoNotAutobox Number pitch);
    /** 
      * tsd/mapbox-gl/index.d.ts@5365
     */
    public native Map setPitch(@DoNotAutobox Number pitch, EventData eventData /* optional */);
    @JsProperty(name = "repaint")
    public native void setRepaint(Boolean value);
    @JsProperty(name = "scrollZoom")
    public native void setScrollZoom(ScrollZoomHandler value);
    @JsProperty(name = "showCollisionBoxes")
    public native void setShowCollisionBoxes(Boolean value);
    @JsProperty(name = "showTileBoundaries")
    public native void setShowTileBoundaries(Boolean value);
    public native Map setStyle(String style);
    public native Map setStyle(Style style);
    /** 
      * tsd/mapbox-gl/index.d.ts@2294
     */
    public native Map setStyle(UnionOfStringAndStyle style);
    @JsProperty(name = "touchZoomRotate")
    public native void setTouchZoomRotate(TouchZoomRotateHandler value);
    public native Map setZoom(@DoNotAutobox Number zoom);
    /** 
      * tsd/mapbox-gl/index.d.ts@4573
     */
    public native Map setZoom(@DoNotAutobox Number zoom, EventData eventData /* optional */);
    public native Map snapToNorth();
    public native Map snapToNorth(AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@5239
     */
    public native Map snapToNorth(AnimationOptions options /* optional */, EventData eventData /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@5869
     */
    public native Map stop();
    public native LngLat unproject(Point point);
    public native LngLat unproject(Array<Number> point);
    /** 
      * tsd/mapbox-gl/index.d.ts@1942
     */
    public native LngLat unproject(PointLike_UnionOfArrayOfNumberAndPoint point);
    public native Map zoomIn();
    public native Map zoomIn(AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4749
     */
    public native Map zoomIn(AnimationOptions options /* optional */, EventData eventData /* optional */);
    public native Map zoomOut();
    public native Map zoomOut(AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4841
     */
    public native Map zoomOut(AnimationOptions options /* optional */, EventData eventData /* optional */);
    public native Map zoomTo(@DoNotAutobox Number zoom);
    public native Map zoomTo(@DoNotAutobox Number zoom, AnimationOptions options /* optional */);
    /** 
      * tsd/mapbox-gl/index.d.ts@4643
     */
    public native Map zoomTo(@DoNotAutobox Number zoom, AnimationOptions options /* optional */, EventData eventData /* optional */);
}
