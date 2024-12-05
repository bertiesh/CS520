package org.example.cs520.utils;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Xinyuan Xu
 */
public class CommonUtils {
    /**
     * check if email is valid
     *
     * @param username username
     * @return status
     */
    public static boolean checkEmail(String username) {
        String rule = "^\\w+((-\\w+)|(\\.\\w+))*\\@[A-Za-z0-9]+((\\.|-)[A-Za-z0-9]+)*\\.[A-Za-z0-9]+$";
        //正则表达式的模式 编译正则表达式
        Pattern p = Pattern.compile(rule);
        //正则表达式的匹配器
        Matcher m = p.matcher(username);
        //进行正则匹配
        return m.matches();
    }

    /**
     * 获取括号内容
     *
     * @param str str
     * @return {@link String} 括号内容
     */
    public static String getBracketsContent(String str) {
        return str.substring(str.indexOf("(") + 1, str.indexOf(")"));
    }

    /**
     * 生成6位随机验证码
     *
     * @return 验证码
     */
    public static String getRandomCode() {
        StringBuilder str = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 6; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }

    /**
     * 转换List
     *
     * @param obj   obj
     * @param clazz clazz
     * @return {@link List <T>}
     */
    public static <T> List<T> castList(Object obj, Class<T> clazz) {
        List<T> result = new ArrayList<T>();
        if (obj instanceof List<?>) {
            for (Object o : (List<?>) obj) {
                result.add(clazz.cast(o));
            }
            return result;
        }
        return result;
    }

    /**
     * 转换set
     *
     * @param obj   obj
     * @param clazz clazz
     * @return {@link Set <T>}
     */
    public static <T> Set<T> castSet(Object obj, Class<T> clazz) {
        Set<T> result = new HashSet<>();
        if (obj instanceof Set<?>) {
            for (Object o : (Set<?>) obj) {
                result.add(clazz.cast(o));
            }
            return result;
        }
        return result;
    }

    /**
     * 生成随机字符串
     *
     * @return {@link String} 随机字符串
     */
    public static String generateUUID() {
        // 去除生成的随机字符串中的 ”-“
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

