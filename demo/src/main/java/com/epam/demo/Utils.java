package com.epam.demo;
import com.epam.utils.StringUtils;

import java.util.List;


public class Utils {
    public static boolean isAllPositiveNumbers(List<String> args) {
        for (String arg : args){
            if (StringUtils.isPositiveNumber(arg)){
                continue;
            }
            else {
                return  false;
            }
        }
        return true;
    }
}