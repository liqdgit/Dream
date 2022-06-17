package test;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

/**
 * Created by meicai on 2018/9/3.
 */
public class MyTest {

    public static void main(String[] args) {
        String json = "[\n" +
                "{\"上级成本中心编码\":\"M01\",\"成本中心编码\":\"MX47\",\"成本中心名称\":\"美鲜贵阳\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"33686\",\"财务主管编码\":\"40247\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"33686\",\"预算专员编码\":\"40247\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M01\",\"成本中心编码\":\"MX48\",\"成本中心名称\":\"美鲜萍乡\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"33686\",\"财务主管编码\":\"01799\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"33686\",\"预算专员编码\":\"01799\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M02\",\"成本中心编码\":\"MX49\",\"成本中心名称\":\"美鲜沈阳\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68989\",\"财务主管编码\":\"45331\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"68989\",\"预算专员编码\":\"45331\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M02\",\"成本中心编码\":\"MX50\",\"成本中心名称\":\"美鲜大连\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68989\",\"财务主管编码\":\"12650\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"68989\",\"预算专员编码\":\"12650\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M02\",\"成本中心编码\":\"MX51\",\"成本中心名称\":\"美鲜怀柔\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68989\",\"财务主管编码\":\"58498\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"68989\",\"预算专员编码\":\"58498\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX52\",\"成本中心名称\":\"美鲜青岛\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"57126\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX53\",\"成本中心名称\":\"美鲜日照\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67759\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX54\",\"成本中心名称\":\"美鲜胶州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67759\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX55\",\"成本中心名称\":\"美鲜即墨\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67759\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX56\",\"成本中心名称\":\"美鲜霸州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"51738\",\"财务主管编码\":\"58498\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"58498\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX57\",\"成本中心名称\":\"美鲜固安涿州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"51738\",\"财务主管编码\":\"58498\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"58498\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX58\",\"成本中心名称\":\"美鲜高碑店\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"51738\",\"财务主管编码\":\"58498\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"58498\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX59\",\"成本中心名称\":\"美鲜大厂香河\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"51738\",\"财务主管编码\":\"58498\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"58498\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX60\",\"成本中心名称\":\"美鲜诸城\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67759\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX61\",\"成本中心名称\":\"美鲜乳山\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67759\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M03\",\"成本中心编码\":\"MX62\",\"成本中心名称\":\"美鲜高密\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67759\",\"财务主管编码\":\"09560\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"57126\",\"预算专员编码\":\"09560\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX63\",\"成本中心名称\":\"美鲜福州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"07121\",\"财务主管编码\":\"14832\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"14832\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX64\",\"成本中心名称\":\"美鲜厦门\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"07121\",\"财务主管编码\":\"17127\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"17127\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX65\",\"成本中心名称\":\"美鲜郑州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"07121\",\"财务主管编码\":\"28779\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"28779\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX66\",\"成本中心名称\":\"美鲜咸宁\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"54960\",\"财务主管编码\":\"00679\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"00679\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX67\",\"成本中心名称\":\"美鲜黄石大冶\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"54960\",\"财务主管编码\":\"00679\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"00679\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX68\",\"成本中心名称\":\"美鲜黄冈\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"54960\",\"财务主管编码\":\"00679\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"00679\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX69\",\"成本中心名称\":\"美鲜鄂州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"54960\",\"财务主管编码\":\"00679\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"00679\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX70\",\"成本中心名称\":\"美鲜仙桃\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"54960\",\"财务主管编码\":\"00679\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"00679\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX71\",\"成本中心名称\":\"美鲜新乡\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68226\",\"财务主管编码\":\"28779\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"28779\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX72\",\"成本中心名称\":\"美鲜开封\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68226\",\"财务主管编码\":\"28779\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"28779\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX73\",\"成本中心名称\":\"美鲜许昌\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68226\",\"财务主管编码\":\"28779\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"28779\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX74\",\"成本中心名称\":\"美鲜新郑\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68226\",\"财务主管编码\":\"28779\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"28779\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M04\",\"成本中心编码\":\"MX75\",\"成本中心名称\":\"美鲜焦作\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68226\",\"财务主管编码\":\"28779\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"28779\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX76\",\"成本中心名称\":\"美鲜崇明岛\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"00823\",\"财务主管编码\":\"01977\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01977\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX77\",\"成本中心名称\":\"美鲜太仓\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"01345\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX78\",\"成本中心名称\":\"美鲜张家港\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"01345\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX79\",\"成本中心名称\":\"美鲜句容\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"57663\",\"财务主管编码\":\"15237\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"15237\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX80\",\"成本中心名称\":\"美鲜滁州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"57663\",\"财务主管编码\":\"15237\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"15237\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX81\",\"成本中心名称\":\"美鲜靖江\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"29513\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX82\",\"成本中心名称\":\"美鲜泰州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"29513\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX83\",\"成本中心名称\":\"美鲜高淳\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"57663\",\"财务主管编码\":\"15237\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"15237\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX84\",\"成本中心名称\":\"美鲜泰兴\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"29513\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX85\",\"成本中心名称\":\"美鲜宜兴\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"29513\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX86\",\"成本中心名称\":\"美鲜潥阳\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"03064\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX87\",\"成本中心名称\":\"美鲜江阴\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"29513\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX88\",\"成本中心名称\":\"美鲜丹阳\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"55580\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX89\",\"成本中心名称\":\"美鲜巢湖\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"11156\",\"财务主管编码\":\"01630\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01630\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX90\",\"成本中心名称\":\"美鲜六安\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"11156\",\"财务主管编码\":\"01630\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01630\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX91\",\"成本中心名称\":\"美鲜淮南\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"11156\",\"财务主管编码\":\"01630\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01630\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX92\",\"成本中心名称\":\"美鲜芜湖\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"57663\",\"财务主管编码\":\"15237\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"15237\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX93\",\"成本中心名称\":\"美鲜马鞍山\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"57663\",\"财务主管编码\":\"15237\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"15237\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX94\",\"成本中心名称\":\"美鲜常熟\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"03064\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX95\",\"成本中心名称\":\"美鲜昆山\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"03064\",\"财务主管编码\":\"01946\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"39730\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01946\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M05\",\"成本中心编码\":\"MX96\",\"成本中心名称\":\"美鲜合肥\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"03064\",\"财务主管编码\":\"01630\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"00823\",\"预算专员编码\":\"01630\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX97\",\"成本中心名称\":\"美鲜增城\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX98\",\"成本中心名称\":\"美鲜清远\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX99\",\"成本中心名称\":\"美鲜从化\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX100\",\"成本中心名称\":\"美鲜江门\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX101\",\"成本中心名称\":\"美鲜鹤山\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX102\",\"成本中心名称\":\"美鲜肇庆\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX103\",\"成本中心名称\":\"美鲜中山\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M06\",\"成本中心编码\":\"MX104\",\"成本中心名称\":\"美鲜珠海\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"12782\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"07121\",\"预算专员编码\":\"12782\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M07\",\"成本中心编码\":\"MX105\",\"成本中心名称\":\"美鲜昆明\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"51448\",\"财务主管编码\":\"62999\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"51448\",\"预算专员编码\":\"62999\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M07\",\"成本中心编码\":\"MX106\",\"成本中心名称\":\"美鲜绵阳\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"51448\",\"财务主管编码\":\"49380\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"51448\",\"预算专员编码\":\"49380\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M07\",\"成本中心编码\":\"MX107\",\"成本中心名称\":\"美鲜都江堰\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"53709\",\"财务主管编码\":\"01756\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"51448\",\"预算专员编码\":\"01756\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M07\",\"成本中心编码\":\"MX108\",\"成本中心名称\":\"美鲜临潼\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"53709\",\"财务主管编码\":\"12609\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"51448\",\"预算专员编码\":\"12609\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M07\",\"成本中心编码\":\"MX109\",\"成本中心名称\":\"美鲜渭南\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"53709\",\"财务主管编码\":\"12609\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"61174\",\"业务线负责人编码\":\"51448\",\"预算专员编码\":\"12609\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M08\",\"成本中心编码\":\"MX110\",\"成本中心名称\":\"美鲜东莞\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"03039\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"00666\",\"预算专员编码\":\"03039\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M08\",\"成本中心编码\":\"MX111\",\"成本中心名称\":\"美鲜南宁\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"09855\",\"财务主管编码\":\"65909\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"30133\",\"业务线负责人编码\":\"00666\",\"预算专员编码\":\"65909\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX112\",\"成本中心名称\":\"美鲜温州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"63248\",\"财务主管编码\":\"07543\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"07543\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX113\",\"成本中心名称\":\"美鲜柯桥\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"06254\",\"财务主管编码\":\"17714\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"17714\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX114\",\"成本中心名称\":\"美鲜德清\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"06254\",\"财务主管编码\":\"17714\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"17714\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX115\",\"成本中心名称\":\"美鲜诸暨\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"06254\",\"财务主管编码\":\"17714\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"17714\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX116\",\"成本中心名称\":\"美鲜海宁桐乡\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"06254\",\"财务主管编码\":\"17714\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"17714\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX117\",\"成本中心名称\":\"美鲜台州\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"63248\",\"财务主管编码\":\"07543\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"07543\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX118\",\"成本中心名称\":\"美鲜丽水\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"63248\",\"财务主管编码\":\"07543\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"07543\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"MX44\",\"成本中心编码\":\"MX119\",\"成本中心名称\":\"美鲜慈溪\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"67766\",\"财务主管编码\":\"17725\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"63248\",\"预算专员编码\":\"17725\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"},\n" +
                "{\"上级成本中心编码\":\"M02\",\"成本中心编码\":\"MX120\",\"成本中心名称\":\"美鲜长春\",\"费用承担公司编码\":\"01010103\",\"部门主管编码\":\"68989\",\"财务主管编码\":\"45331\",\"费用专员编码\":\"38467\",\"薪酬专员编码\":\"55822\",\"业务线负责人编码\":\"68989\",\"预算专员编码\":\"45331\",\"部门属性\":\"管理\",\"是否末级部门\":\"否\"}\n" +
                "\n" +
                "]";

    }


}