package com.shallcheek.timetale;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jiangwei on 17-2-28.
 */

public class Data {
    private List<TimeTableModel> mList;



    /*
    * 构造函数传入mList变量
    *
    * 周数
    *
    *
    * 谁的课表
    *
    * */
    Data(List<TimeTableModel> mListb,int week,int who){
        mList=mListb;
        //mList.add(new TimeTableModel(0, 1, 4, 2, "8:20", "10:10", "测试1","王老师", "06103", ""));

        if(who==1){  //我自己课表的数据
            switch (week){
                case 1:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "就业指导与创业基础","", "05314", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "8:10", "9:50", "软件体系结构与设计模式","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "14:30", "16:10", "就业指导与创业基础","", "06409", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 2:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "就业指导与创业基础","", "05314", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "8:10", "9:50", "软件体系结构与设计模式","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "14:30", "16:10", "就业指导与创业基础","", "06409", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 3:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "软件测试B","", "06607", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "就业指导与创业基础","", "05314", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "8:10", "9:50", "软件体系结构与设计模式","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "软件测试B","", "06306", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "14:30", "16:10", "就业指导与创业基础","", "06409", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 4:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "软件测试B","", "06607", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "就业指导与创业基础","", "05314", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "8:10", "9:50", "软件体系结构与设计模式","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "软件测试B","", "06306", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "14:30", "16:10", "就业指导与创业基础","", "06409", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 5:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "软件测试B","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "计算机网络安全X","", "06401", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "就业指导与创业基础","", "05314", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "8:10", "9:50", "软件体系结构与设计模式","", "06514", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "计算机网络安全X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "软件测试B","", "06306", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 6:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "软件测试B","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "计算机网络安全X","", "06401", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "计算机网络安全X","", "02511J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "计算机网络安全X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "软件测试B","", "06306", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 7:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "软件测试B","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "计算机网络安全X","", "06401", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "计算机网络安全X","", "02511J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "计算机网络安全X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "软件测试B","", "05311", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 8:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "软件测试B","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "计算机网络安全X","", "06401", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "计算机网络安全X","", "02511J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "计算机网络安全X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "软件测试B","", "05311", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    break;
                case 9:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "计算机网络安全X","", "06401", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "计算机网络安全X","", "02511J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "计算机网络安全X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "软件测试B","", "05207", ""));
                    break;
                case 10:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "计算机网络安全X","", "06401", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "8:10", "9:50", "计算机网络安全X","", "02511J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "8:10", "9:50", "软件开发形式化技术","", "05310", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "8:10", "9:50", "软件测试B","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05301", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "软件测试B","", "05207", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    break;
                case 11:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "8:10", "9:50", "软件开发形式化技术","", "05310", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "软件开发形式化技术","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "PHP程序设计X","", "05310", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05301", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "PHP程序设计X","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    break;
                case 12:
                    mList.add(new TimeTableModel(0, 1, 2, 1, "8:10", "9:50", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 1, "8:10", "9:50", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "8:10", "9:50", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "8:10", "9:50", "软件开发形式化技术","", "05310", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "8:10", "9:50", "软件开发形式化技术","", "02525J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "8:10", "9:50", "PHP程序设计X","", "05310", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "8:10", "9:50", "ASP.NET网站开发X","", "02524J", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05301", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "软件体系结构与设计模式","", "05208", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "PHP程序设计X","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    break;
                case 13:
                    break;
                case 14:
                    break;
                case 15:
                    break;
                case 16:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "软件开发形式化技术","", "05209", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "ASP.NET网站开发X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 4, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "ASP.NET网站开发X","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    break;
                case 17:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "软件开发形式化技术","", "05209", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "ASP.NET网站开发X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 4, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "ASP.NET网站开发X","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "PHP程序设计X","", "05412J", ""));



                    break;
                case 18:

                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "软件开发形式化技术","", "05209", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "ASP.NET网站开发X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 4, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "ASP.NET网站开发X","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "PHP程序设计X","", "05412J", ""));

                    break;
                case 19:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "PHP程序设计X","", "06514", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "ASP.NET网站开发X","", "06607", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "软件开发形式化技术","", "05209", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "ASP.NET网站开发X","", "05312", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 4, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "ASP.NET网站开发X","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "软件开发形式化技术","", "05412J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 5, "10:20", "12:00", "PHP程序设计X","", "05412J", ""));
                    break;
                case 20:
                    break;
            }

        }
        else{//秀秀的课表

            switch (week){

                case 1:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    break;
                case 2:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "10:20", "12:00", "广告创意B","", "07520", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "策划实务","", "06508", ""));
                    break;
                case 3:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "10:20", "12:00", "广告创意B","", "07520", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "策划实务","", "06508", ""));
                    break;
                case 4:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "10:20", "12:00", "广告创意B","", "07520", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "策划实务","", "06508", ""));
                    break;
                case 5:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "10:20", "12:00", "广告创意B","", "07520", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "策划实务","", "06508", ""));
                    break;
                case 6:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "10:20", "12:00", "广告创意B","", "07520", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "策划实务","", "06508", ""));
                    break;
                case 7:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 3, "10:20", "12:00", "广告创意B","", "07520", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "策划实务","", "06508", ""));
                    break;
                case 8:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 5, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    break;
                case 9:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "就业指导与创业基础","", "07120", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 5, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    break;
                case 10:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 5, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    break;
                case 11:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 5, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    break;
                case 12:
                    mList.add(new TimeTableModel(0, 3, 4, 1, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 2, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 3, "10:20", "12:00", "策划实务","", "07518", ""));
                    mList.add(new TimeTableModel(0, 5, 8, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 4, "10:20", "12:00", "公共关系学B","", "06210", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 4, 5, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "广告创意B","", "06508", ""));
                    break;
                case 13:
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 6, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学","", "07615", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "广告创意B","", "06508", ""));
                    break;
                case 14:
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 6, 3, "10:20", "12:00", "网络广告设计与制作","", "05612J", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学","", "07615", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "广告创意B","", "06508", ""));
                    break;
                case 15:
                    mList.add(new TimeTableModel(0, 5, 6, 1, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 1, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 2, "10:20", "12:00", "管理学B","", "07615", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 3, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 3, 4, 4, "10:20", "12:00", "管理学","", "07615", ""));
                    mList.add(new TimeTableModel(0, 7, 8, 4, "10:20", "12:00", "会展策划X","", "06309", ""));
                    mList.add(new TimeTableModel(0, 1, 2, 5, "10:20", "12:00", "毛泽东思想和中国特色社会主义理论体系概论","", "07119", ""));
                    mList.add(new TimeTableModel(0, 5, 6, 5, "10:20", "12:00", "广告创意B","", "06508", ""));
                    break;
                case 16:
                    break;
                case 17:
                    break;
                case 18:
                    break;
                case 19:
                    break;
                case 20:
                    break;



            }

        }






    }






}
