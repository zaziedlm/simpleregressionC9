package com.example;

import org.apache.commons.math3.stat.regression.SimpleRegression;

/**
 * SimpleRegression
 *
 */
public class Regression 
{
    public static void main( String[] args )
    {
        // 単回帰分析のため、インスタンス生成
        SimpleRegression sReg = new SimpleRegression();
        
        // addDataメソッドを利用して、データ渡し
        sReg.addData(new double[][] {
            {19.0, 197},
            {23.0, 237.1},
            {27.5, 282.3},
            {32.5, 322.3},
            {37.5, 362.8},
            {42.6, 392.5},
            {47.5, 418.9},
            {52.4, 446.6},
            {57.4, 443.0},
            {62.3, 329.8},
            {67.2, 287.1},
            {73.0, 269.4}
        });

        // 推定したパラメータを表示
        System.out.println("切片：" + sReg.getIntercept());
        System.out.println("推定回帰直線の傾き：" + sReg.getSlope());

    }
}
