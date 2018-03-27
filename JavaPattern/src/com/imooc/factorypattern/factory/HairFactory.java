package com.imooc.factorypattern.factory;


/**
 * 生产发型工厂
 * Create By Min
 * 2018/3/16
 */
public class HairFactory {

/*  public HairInterface getHair(String key){
      if(key.equals("left")){
          return new LeftHair();
      }else if(key.equals("right")){
          return new RightHair();
      }
      return null;
  }*/

    public HairInterface getHairByClass(Class c) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        HairInterface hairInterface = (HairInterface) c.newInstance();
        return hairInterface;
    }

}
