package com.kero99.wp;

import org.apache.spark.SparkConf;
import org.apache.spark.api.java.JavaSparkContext;

/**
 * @author wp
 * @date 2019-08-14 16:53
 */
public class JDK7WC {
    public static void main(String [] args){
        SparkConf cfg = new SparkConf();
        JavaSparkContext context= new JavaSparkContext(cfg);
    }
}
