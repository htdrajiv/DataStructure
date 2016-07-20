package com.rajiv.algorithm.practice.dataStructure.customMap;

import java.util.Arrays;

/**
 * Created by Rajiv on 7/19/2016.
 */
public class MyMap <K,V> {
    MainMap<K,V>[] maps = new MainMap[2];
    int count = 0;
//    private List<MainMap> mapList = new ArrayList<>();

    public void put(K key, V value) throws Exception {
        Boolean isDuplicateKey = false;

        for(int i=0;i<maps.length;i++){
            if(maps[i]!=null && maps[i].getKey()==key){
                isDuplicateKey = true;
                break;
            }
        }
        if(!isDuplicateKey){
            MainMap<K,V> mainMap = new MainMap<>();
            mainMap.setKey(key);
            mainMap.setValue(value);
            checkSize();
            maps[count] = mainMap;
            count++;
        }else{
            throw new Exception("Duplicate Key Found");
        }
    }

    public V get(K key){
        for(int i=0;i<maps.length;i++){
            if(maps[i]!=null && maps[i].getKey()==key){
                return maps[i].getValue();
            }
        }
        return null;
    }

    public void checkSize(){
        if(count==maps.length){
            maps = Arrays.copyOf(maps,count*2);
        }
    }

    public void delete(K key){
        for(int i=0;i<maps.length;i++){
            if(maps[i]!=null && maps[i].getKey()==key){
                maps[i]=null;
                count--;
            }
            if(count==maps.length/2){
                maps = Arrays.copyOf(maps,maps.length/2);
            }
        }
    }
}
