package com.example.utils;

import org.apache.commons.lang3.StringUtils;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

/**
 * Created by king on 2016/4/10.
 */
public class ToJsonUtil {
    private static String ResultSuccuss = "succuss";
    private static String ResultFailed = "failed";

    public static String exceptionToResult(Exception e)
    {
        return exceptionToResult(e.getMessage());
    }

    public static String exceptionToResult(String message)
    {
        return new ToJsonUtil().setError(message).toString();
    }

    public static String succussResult()
    {
        return new ToJsonUtil().toString();
    }

    public static ToJsonUtil rawJson()
    {
        return new ToJsonUtil(true,null);
    }
    
    public static ToJsonUtil rawJson(String arg){
        return new ToJsonUtil(true,arg);
    }
    
    public static String httpResponseToResult(String jsonParams){
    	if(StringUtils.isNotBlank(jsonParams) && !"null".equals(jsonParams)){
//    		JSONObject respJson = new JSONObject(jsonParams);
//    		boolean success = respJson.getBoolean("success");
//    		if(success){
//    			return succussResult();
//    		}else{
//    			return exceptionToResult(respJson.getString("error"));
//    		}
    	}
    	return succussResult();
    }

    private ObjectMapper jmapper = null;
    private ObjectNode jroot = null;
    private ObjectNode realjroot = null;
    private String user_arg = null;
    public ToJsonUtil(String user_arg)
    {
        this.objInit(user_arg);
    }

    public ToJsonUtil(){this.objInit(null);}

    private ToJsonUtil(boolean raw,String arg)
    {
        if(raw){
            this.user_arg = arg;
            jmapper = new ObjectMapper();
            jroot = jmapper.createObjectNode();
            realjroot = jroot;
        }else{
            this.objInit(null);
        }
    }

    private void objInit(String arg)
    {
        this.user_arg = arg;
        jmapper = new ObjectMapper();
        jroot = jmapper.createObjectNode();
        jroot.put("result", ResultSuccuss);
        realjroot = jmapper.createObjectNode();
        jroot.set("body", realjroot);
    }

    public ToJsonUtil setError(String message)
    {
        jroot.put("result", ResultFailed);
        if(!StringUtils.isEmpty(message))
            jroot.put("message",message);
        return this;
    }

    public String getUser_arg() {
        return user_arg;
    }

    @Override
    public String toString() {
        return jroot.toString();
    }

}
