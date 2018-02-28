package co.com.ic2.colciencias.transformers.util;

import java.lang.reflect.Type;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;



public class JsonUtil {
	private static JsonUtil instance = null;
	private Gson transfer;
	
	protected JsonUtil() {
		transfer = new Gson();

	}
	
	 public static JsonUtil getInstance() {
	      if(instance == null) {
	         instance = new JsonUtil();
	      }
	      return instance;
	   }
	
	 public String toJson(Object object){
		 return transfer.toJson(object);
	 }
	 
	 public <T> Object fromJson(String json, Class<T> classOfT){
		 try{
			 return transfer.fromJson(json, classOfT);
		 }catch (NullPointerException | ClassCastException e){
			
			 return null;
		 }
	 }
	 
	 public   <T> List<T>  fromJsonList(String json,Type type){
		 try{
			 return transfer.fromJson(json, type);
		 }catch (NullPointerException | JsonSyntaxException |ClassCastException e){
			e.printStackTrace();
			 return null;
		 }
	 }

}
