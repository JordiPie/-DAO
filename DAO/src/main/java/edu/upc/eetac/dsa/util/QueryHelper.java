package edu.upc.eetac.dsa.util;

import java.util.HashMap;
public class QueryHelper {

    public static String createQueryINSERT(Object entity) {

        StringBuffer sb = new StringBuffer("INSERT INTO ");
        sb.append(entity.getClass().getSimpleName()).append(" ");
        sb.append("(");

        String [] fields = ObjectHelper.getFields(entity);

        sb.append("id");
        for (String field: fields) {
            sb.append(", ").append(field);
        }

        sb.append(") VALUES (?");

        for (String field: fields) {
            sb.append(", ?");
        }

        sb.append(")");

        return sb.toString();
    }

    public static String createQuerySELECT(Class theClass, String pk) {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM ").append(theClass.getSimpleName());
        sb.append(" WHERE "+pk+"= ?");

        return sb.toString();
    }

    public static String createQuerySELECTAll(Class theClass) {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM ").append(theClass.getSimpleName());
        return sb.toString();
    }

    public static String createQuerySELECTByName(Class theClass, String username){
        StringBuffer sb = new StringBuffer("");
        sb.append("SELECT * FROM ").append(theClass.getSimpleName());
        sb.append(" WHERE username = '").append(username).append("'");
        return sb.toString();
    }

    /*public static String createQuerySelectWithP(Class theClass, HashMap params) {
        StringBuffer sb = new StringBuffer();
        sb.append("SELECT * FROM ").append(theClass.getSimpleName());
        sb.append(" WHERE (");

        params.forEach((k,v) ->{
            //k = k.substring(0, 1).toUpperCase() + k.substring(1);
            if(k.equals("password")){
                sb.append(k).append(" = MD5(").append("?").append(") AND ");
            }else {
                sb.append(k).append(" = ").append("?").append(" AND ");
            }
        });
        sb.delete(sb.length()-4, sb.length()-1);
        sb.append(")");

        return sb.toString();
    }*/


}
