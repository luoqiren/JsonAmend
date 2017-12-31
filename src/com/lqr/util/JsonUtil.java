package com.lqr.util;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;


public class JsonUtil {
	/**
	 * 
	* <p>Description: 将一个list - bean对象按照其Field字段转换成json字符串</p>
	* @author Qi
	* @date 20160821
	* @param list
	* @return String
	 */
	public static String listToJson(List<?> list){
		String json = null;
		if(list!=null){
			json=JSONArray.fromObject(list.toArray()).toString();
		}
		return json;
	}
	
	/**
	* <p>Description: 将一个bean对象按照其Field字段转换成json字符串 </p>
	* @author Qi
	* @date 20160821
	* @param obj
	* @return String
	 */
	public static JSONObject objectToJson(Object obj){
		JSONObject json = null;
		if(obj!=null){
			json=JSONObject.fromObject(obj);
		}
		return json;
	}
	
	/**
	* <p>Description: 将一个json字符串 按照其Field字段转换成 bean对象</p>
	* @author Qi
	* @date 20160821
	* @param obj
	* @return String
	 */
	@SuppressWarnings("unchecked")
	public static <T> T jsonToObject(String jsonStr, Class<T> clazz){
		return (T) JSONObject.toBean(JSONObject.fromObject(jsonStr), clazz);
	}
	
	/**
	* <p>Description: 将一个json字符串 按照其Field字段转换成 bean对象</p>
	* @author Qi
	* @date 20160821
	* @param obj
	* @return String
	 */
	@SuppressWarnings("unchecked")
    public static <T> Map<String, Object> jsonToMap(String jsonStr)     throws Exception {
            return (Map<String, Object>) JSONObject.toBean(JSONObject.fromObject(jsonStr), Map.class);
    }
  
	/**
	* <p>Description: 将一个json字符串 按照其Field字段转换成 bean对象</p>
	* @author Qi
	* @date 20160821
	* @param obj
	* @return String
	 */
	@SuppressWarnings("unchecked")
    public static <T> T mapToObj(Map<?, ?> map, Class<T> clazz) throws Exception {
        return (T) JSONObject.toBean(JSONObject.fromObject(map), clazz);
    }
    
	/**
	* <p>Description: 将一个bean对象按照其Field字段转换成map字符串 </p>
	* @author Qi
	* @date 20160821
	* @param obj
	* @return String
	 */
    public static Map<?, ?> objectToMap(Object obj) {    
        if(obj == null)    
            return new HashMap();     
        return new org.apache.commons.beanutils.BeanMap(obj);    
    } 
    public static void main(String[] args) {
    	PmsUserInfos pmsUserInfos = new PmsUserInfos();
    	pmsUserInfos.setStartDate(new Date());
    	System.out.println(pmsUserInfos.getStartDate());
    	String str = JsonUtil.objectToJson(pmsUserInfos).toString();
    	System.out.println(process(pmsUserInfos.getStartDate()));
    	System.out.println(str);
	}
    
    
    private static String format = "yyyy-MM-dd HH:mm:ss";
    private static Object process(Object value){     
        //遇到类型为日期的，就自动转换成“yyyy-MM-dd HH:mm:ss”格式的字符串  
        if(value instanceof Date){     
            SimpleDateFormat sdf = new SimpleDateFormat(format,Locale.UK);     
            return sdf.format(value);     
        }     
        return value == null ? "" : value.toString(); 
    }
}
