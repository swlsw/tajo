package nta.catalog;

import nta.catalog.proto.CatalogProtos.StoreType;
import nta.catalog.proto.CatalogProtos.TableProto;
import nta.common.ProtoObject;

/**
 * 
 * @author Hyunsik Choi
 *
 */
public interface TableMeta extends ProtoObject<TableProto>, Cloneable {
  
  void setStorageType(StoreType storeType);
  
  StoreType getStoreType();
  
  void setSchema(Schema schema);
  
  Schema getSchema();
  
  void setOptions(Options options);
  
  Options getOptions();
  
  String getOption(String key);
  
  void putOption(String key, String value);
  
  Object clone() throws CloneNotSupportedException;
  
  public String toJSON();
}
