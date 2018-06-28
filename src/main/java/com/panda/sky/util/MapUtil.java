/**
 * Project Name:zjbi
 * File Name:MapUtil.java
 * Package Name:com.handsure.zjbi.util
 * Date:2017年3月12日上午10:09:10
 * Copyright (c) 2017, 上海点贸信息计算有限公司版权所有.
 *
 */

package com.panda.sky.util;

import java.util.*;

/**
 * ClassName: MapUtil
 * Function: TODO ADD FUNCTION.
 * date: 2017年3月12日 上午10:09:10
 *
 * @author zhao rui
 * @version 
 */
public class MapUtil {
	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue( Map<K, V> map) {  
	    List<Map.Entry<K, V>> list = new LinkedList<Map.Entry<K, V>>(map.entrySet());  
	    Collections.sort(list, new Comparator<Map.Entry<K, V>>() {  
	        @Override
	        public int compare(Map.Entry<K, V> o1, Map.Entry<K, V> o2 ) {
	            return (o1.getValue()).compareTo( o2.getValue() );  
	        }  
	    });  
	
	    Map<K, V> result = new LinkedHashMap<K, V>();  
	    for (Map.Entry<K, V> entry : list) {  
	        result.put( entry.getKey(), entry.getValue() );  
	    }  
	    return result;  
	}
	
	/**
     * 使用 Map按key进行排序
     * @param materialCodeGroupByMap
     * @return
     */
    public static Map<String, Long> sortMapByKey(Map<String, Long> materialCodeGroupByMap) {
        if (materialCodeGroupByMap == null || materialCodeGroupByMap.isEmpty()) {
            return null;
        }
        Map<String, Long> sortMap = new TreeMap<String, Long>(new MapKeyComparator());
        sortMap.putAll(materialCodeGroupByMap);
        return sortMap;
    }
}

class MapKeyComparator implements Comparator<String> {
    @Override
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}